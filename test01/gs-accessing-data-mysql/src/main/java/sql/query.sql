CREATE DATABASE IF NOT EXISTS jpadb;

USE jpadb;

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id      int(20)         AUTO_INCREMENT     NOT NULL,
  name    varchar(255)    CHARACTER SET utf8 NOT NULL,
  email   VARCHAR (255)   CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT=1 default charset=utf8;


