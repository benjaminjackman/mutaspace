#!/bin/bash


DIR=mutaplay/target/web/public/main

files() {
  cd $DIR
  find -type f
}

for j in $(files | grep -v '^.$' | cut -b3-); do
  sha256sum $DIR/$j | awk '{print $1}' | xargs echo $j | awk '{print $2 " "  $1}';
done | tee version.manifest