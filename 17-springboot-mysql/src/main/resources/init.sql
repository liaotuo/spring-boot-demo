-- Create the new database
create database db_example;

-- Creates the user
 create user 'springuser'@'%' identified by 'ThePassword';

-- Gives all the privileges to the new user on the newly created database
grant all on db_example.* to 'springuser'@'%';