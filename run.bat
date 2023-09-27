@echo off
echo unfinished and may not work correctly
javac -cp ./src/;./lib/* -d ./bin/ ./src/Client/*.java
echo compiled
cd bin
jar -cvfe runnable.jar Client/Start * ../lib/*
echo jarred
java -jar runnable.jar
cd ..