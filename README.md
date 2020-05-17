# guestbook
1. Login into Application https://localhost:8080/GuestBookWeb/login
2. users : user name tusker , tusker1 password : Anything can be enetered as of now
3. Once logged in you will be allowed to give title and post your message 
4. Enter details and post the message 
5. Confirmation will come

Currently database has been mocked . 

The following tables can be created

CREATE DATABASE IF NOT EXISTS guest_app;

USE guest_app;

DROP TABLE IF EXISTS `guest_app`.`users`;

CREATE TABLE `guest_app`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` INT NULL,
  PRIMARY KEY (`username`));
  
  
  
  
  
  CREATE TABLE `guest_app`.`post` (
  `postid` VARCHAR(45) NOT NULL,
  `postname` VARCHAR(45) NOT NULL,
  `postdetails` VARCHAR(45) NULL,
  `username` VARCHAR(45) NOT NULL,
    FOREIGN KEY (`username`)
      REFERENCES `users`(`username`),
  PRIMARY KEY (`postid`));

