CREATE DATABASE student_db;

CREATE SCHEMA student_db;


CREATE TABLE student (
  name CHARACTER VARYING(25) NOT NULL,
  surname CHARACTER VARYING(25),
  phone CHARACTER VARYING(25) NOT NULL,
  email CHARACTER VARYING(25) NOT NULL
);
CREATE UNIQUE INDEX student_phone_uindex ON student USING BTREE (phone);
CREATE UNIQUE INDEX student_email_uindex ON student USING BTREE (email);