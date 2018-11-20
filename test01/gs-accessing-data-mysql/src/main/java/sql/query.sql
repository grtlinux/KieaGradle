CREATE DATABASE IF NOT EXISTS jpadb;

USE jpadb;

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id      int(20)                            NOT NULL,
  name    varchar(255)    CHARACTER SET utf8 NOT NULL,
  email   VARCHAR (255)   CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (id)
) default charset = utf8;


