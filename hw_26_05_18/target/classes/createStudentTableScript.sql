CREATE TABLE public.student (
  name CHARACTER VARYING(20) NOT NULL,
  ser_name CHARACTER VARYING(20),
  phone CHARACTER VARYING(20) NOT NULL,
  email CHARACTER VARYING(20) NOT NULL
);
CREATE UNIQUE INDEX student_phone_uindex ON student USING BTREE (phone);
CREATE UNIQUE INDEX student_email_uindex ON student USING BTREE (email);