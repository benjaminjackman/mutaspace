#!/bin/bash

#-e fail on error
#-u fail on unset var
#-f disable globbing
#-o pipefail fail if anything in a pipe fails
set -euf -o pipefail

#See: https://sipb.mit.edu/doc/safe-shell/


files() {
  cd "$EXPORT_DIR"
  find -type f
}

trimmed() {
  files | grep -v '^.$' | cut -b3-
}

getTarget() {
  if [ $(dirname $1) == "." ]; then
    echo $1
  else
    echo "assets/"$1
  fi
}

getSha256() {
  sha256sum "$1" | awk '{print $1}'
}

#  ls version | sort -t. -k 1,1n -k 2,2n -k 3,3n -k 4,4n | tail -n 1
lastVersion() {
  ls version | grep -v HEAD | sort -V | tail -n 1
}
nextVersion() {
  lastVersion | awk -F. '{print $1 "." $2 "." $3+1}'
}

EXPORT_DIR=mutaplay/target/web/public/main
VER_OUT=version/$(nextVersion)
VER_HEAD=version/HEAD
SHA_REPO=$HOME/muta/hash/sha256

sbt 'project mutaplay' 'clean' 'assets' 'compile'

for j in $(trimmed); do
  echo $(getTarget "$j") sha256://$(getSha256 "$EXPORT_DIR/$j")
done | tee $VER_OUT

cp $VER_OUT $VER_HEAD
cp $VER_OUT $HOME/muta/label/dns/tal.jackman.biz/version/
cp $VER_HEAD $HOME/muta/label/dns/tal.jackman.biz/version/
echo "Wrote to $VER_OUT & $VER_HEAD"

for j in $(trimmed); do
  F="$EXPORT_DIR/$j"
  SHA256=$(sha256sum "$F" | awk '{print $1}')
  OF="$SHA_REPO/$SHA256"

  if [ ! -f "$OF" ]; then
    echo Copying $F $OF
    cp "$F" "$OF"
    SHA256_OF=$(sha256sum "$OF" | awk '{print $1}')
    if [ "$SHA256" != "$SHA256_OF" ]; then
      echo "Unexpected SHA! $F $OF"
      rm "$OF"
    fi
  else
    echo Bypassing Existing SHA256 for $F
  fi
done


rsync -avz ~/muta/ tal:muta