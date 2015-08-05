#!/bin/bash

#-e fail on error
#-u fail on unset var
#-f disable globbing
#-o pipefail fail if anything in a pipe fails
set -euf -o pipefail

#See: https://sipb.mit.edu/doc/safe-shell/

DIR=mutaplay/target/web/public/main
VER_OUT=version.manifest
VER_HEAD=$HOME/muta/label/dns/mutaspace.jackman.biz/version/HEAD.manifest
SHA_REPO=$HOME/muta/hash/sha256

files() {
  cd $DIR
  find -type f
}

trimmed() {
  files | grep -v '^.$' | cut -b3-
}
for j in $(trimmed); do
  sha256sum $DIR/$j | awk '{print $1}' | xargs echo $j | awk '{print $1 " sha256://" $2}';
done | tee $VER_OUT


cp $VER_OUT $VER_HEAD


for j in $(trimmed); do
  F="$DIR/$j"
  SHA256=$(sha256sum "$F" | awk '{print $1}')
  OF="$SHA_REPO/$SHA256"

  if [ ! -f "$OF" ]; then
    echo Copying $F $OF
    cp "$F" "$OF"
    SHA256_OF=$(sha256sum "$OF" | awk '{print $1}')
    if [ "$SHA256" != "$SHA256_OF" ]; then
      rm "$OF"
    fi
  else
    echo Bypassing $F
  fi
done