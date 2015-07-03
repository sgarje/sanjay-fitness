# Exercise schema

#--- !Ups
create table EXERCISE(id bigint auto_increment, name varchar(255), minutes INTEGER);

#--- !Downs
drop table EXERCISE;