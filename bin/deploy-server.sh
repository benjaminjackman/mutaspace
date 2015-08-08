#!/bin/bash


SERVER=tal
KEY="$HOME/keys/ben-personal.pem"

sbt 'project mutaplay' 'dist'

if [ $? ]; then
  scp mutaplay/target/universal/mutaplay-0.1-SNAPSHOT.zip $SERVER:
  ssh $SERVER unzip -o mutaplay-0.1-SNAPSHOT.zip
  ssh $SERVER ./bounce.sh
fi 


