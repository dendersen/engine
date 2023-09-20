@echo off
echo unfinished and may not work correctly
javac -source 7 -target 7 -cp ./src/;./lib/* -d ./bin/ ./src/Client/*.java
echo compiled
jar -cvfe runnable.jar Client/Start bin/Client/* ./lib/*
echo jarred
java -jar runnable.jar