#!/bin/bash

#killall java
#nohup ./mutaplay >> std.log 2>&1 &

ubuntu@ip-172-31-40-174:~$ ls -l
total 35276
-rwxrw-r-- 1 ubuntu ubuntu       61 Aug  8 02:06 bounce.sh
drwxr-xr-x 4 ubuntu ubuntu     4096 Aug  5 21:01 muta
lrwxrwxrwx 1 ubuntu ubuntu       34 Jul 15 07:27 mutaplay -> mutaplay-0.1-SNAPSHOT/bin/mutaplay
drwxrwxr-x 7 ubuntu ubuntu     4096 Aug  8 02:19 mutaplay-0.1-SNAPSHOT
-rw-r--r-- 1 ubuntu ubuntu 36097324 Aug  8 02:19 mutaplay-0.1-SNAPSHOT.zip
-rw------- 1 ubuntu ubuntu      447 Jul 15 07:30 nohup.out
-rw-rw-r-- 1 ubuntu ubuntu     5819 Aug  8 02:21 std.log


server {
	listen 80 default_server;
	listen [::]:80 default_server ipv6only=on;

	#root /usr/share/nginx/html;
	#index index.html index.htm;

	# Make site accessible from http://localhost/
	#server_name localhost;
	server_name washington.jackman.biz;

	location / {
		# First attempt to serve request as file, then
		# as directory, then fall back to displaying a 404.
		# try_files $uri $uri/ =404;
		# Uncomment to enable naxsi on this location
		# include /etc/nginx/naxsi.rules
	        proxy_set_header   X-Real-IP $remote_addr;
	        proxy_set_header   Host      $http_host;
        	proxy_pass         http://127.0.0.1:9000;
	}

}

