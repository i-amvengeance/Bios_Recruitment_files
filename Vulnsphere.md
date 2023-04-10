# Bios_Recruitment_files
This file consists of the breakdown of the process in which I reached the flags.
After reading the challenge description , to find out whch ports were open , I ran the nmap command.
But,to get more information , I ran the nmap -A command and found out that port 2121(ftp) , port 2222(ssh) , port 8000(http) were open and were vulnerable.
So , in the nmap -A command , i found out that port 2121 can be accessed through Anonymous login. So I ran the ftp command to connect to the given IP Address and for the user , i typed anonymous.
Then there came the ftp command line. I did ls -a and I got the fear.txt using get command.
I exited the port and did cat fear.txt and there was my first flag .
Then , I went to the browser and opened the http website of port 8000.
Then , from nmap -A command, i found out that there were three dissalowed entries in robots.txt
I opened the fl4g.html page and there was a statement . I went on to inspect it and there was my second flag.
Then, I went to cookie dough .pcapng and downloaded it.
I installed wireshark to open it .
There , I extracted all the http files and they were login.php and username.php
In that , I found out the username justin and password majorockyou for a user on the ssh port 2222 for the given ip address.
Then , I used the ssh -p 2222 justin@13.234.19.132 command and got user access to the IP Address.
I used the ls command and got to know the files in it.
I used cat command and found the flag in user.txt
There , I found my third flag.
After that , I visited the tiny file manager website and went to the page source.
There , I found a link to github repository of a .php file.
I opened it and in the code , I got information about two auth_users admin and user with respective passwords.
I logged in using them and found flag.txt.
I opened it and found my fourth flag.
After that , I got back to user justin and did ls -a to find the hidden files.
In that , I found vm.zip file
So, using sftp command in my home user , i got vm.zip into my file manager.
Then , using john-the-ripper , i got the password for the file as qwertyuio. I extracted spider.jpg and it had nothing in it.
So , after using file command in terminal , there was a base64 encrypted string and after decrypting it , i got my fifth flag. For the last flag , i did cat /etc/shadow in justin user and I found an md5 encrypted hash.
Since , it is only one way encryption , i tried to edit the /etc/sadow using vi and nano but none of them worked coz it way only readable file.
I didn't know how to proceed next and I couldn't collect the last flag.
This is how I reached the flags I submitted.
