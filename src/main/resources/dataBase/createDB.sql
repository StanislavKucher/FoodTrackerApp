CREATE DATABASE "FoodTracker"
  WITH
OWNER = postgres
  ENCODING = 'UTF8'
CONNECTION LIMIT = -1;

CREATE SEQUENCE public.role_id_seq;

CREATE TABLE public.role (
  id INTEGER NOT NULL DEFAULT nextval('public.role_id_seq'),
  name VARCHAR(10) NOT NULL,
  CONSTRAINT role_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.role_id_seq OWNED BY public.role.id;

CREATE SEQUENCE public.category_id_seq;

CREATE TABLE public.category (
  id INTEGER NOT NULL DEFAULT nextval('public.category_id_seq'),
  name VARCHAR(30) NOT NULL,
  CONSTRAINT category_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.category_id_seq OWNED BY public.category.id;

CREATE SEQUENCE public.food_id_seq;

CREATE TABLE public.food (
  id INTEGER NOT NULL DEFAULT nextval('public.food_id_seq'),
  name VARCHAR(25) NOT NULL,
  protein NUMERIC(6,3) NOT NULL,
  fat NUMERIC(6,3) NOT NULL,
  carbohydrate NUMERIC(6,3) NOT NULL,
  calorie INTEGER NOT NULL,
  category_id INTEGER NOT NULL,
  CONSTRAINT food_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.food_id_seq OWNED BY public.food.id;

CREATE SEQUENCE public.users_id_seq;

CREATE TABLE public.users (
  id INTEGER NOT NULL DEFAULT nextval('public.users_id_seq'),
  login VARCHAR(30) NOT NULL,
  parole VARCHAR(30) NOT NULL,
  email VARCHAR(50) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  birthday DATE NOT NULL,
  age INTEGER NOT NULL,
  height INTEGER NOT NULL,
  weight INTEGER NOT NULL,
  sex VARCHAR(25) NOT NULL,
  lifestyle VARCHAR(150) NOT NULL,
  lifestyle_numeric NUMERIC(6,3) NOT NULL,
  calorie_rate INTEGER NOT NULL,
  role_id INTEGER NOT NULL,
  CONSTRAINT users_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;

CREATE SEQUENCE public.record_id_seq;

CREATE TABLE public.record (
  id INTEGER NOT NULL DEFAULT nextval('public.record_id_seq'),
  weight INTEGER NOT NULL,
  date DATE NOT NULL,
  food_id INTEGER NOT NULL,
  user_id INTEGER NOT NULL,
  CONSTRAINT record_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.record_id_seq OWNED BY public.record.id;

ALTER TABLE public.users ADD CONSTRAINT role_user_fk
FOREIGN KEY (role_id)
REFERENCES public.role (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.food ADD CONSTRAINT category_food_fk
FOREIGN KEY (category_id)
REFERENCES public.category (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.record ADD CONSTRAINT food_record_fk
FOREIGN KEY (food_id)
REFERENCES public.food (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.record ADD CONSTRAINT user_record_fk
FOREIGN KEY (user_id)
REFERENCES public.users (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
NOT DEFERRABLE;