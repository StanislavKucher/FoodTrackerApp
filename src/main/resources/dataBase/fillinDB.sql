# gonna be finished

INSERT INTO public.role (name) VALUES
                                  ('user'),
                                  ('admin');

# for insert into Categories : nuts \ fats \ grain \ confectionery \ milk \ meat \ beverages \ fish \ fruits \ vegetables

INSERT INTO public.users (login, parole, email, first_name, last_name, birthday, age, height, weight, sex, lifestyle, lifestyle_numeric, calorie_rate, role_id)
VALUES ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.915, 2250, 2),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 182, 75, 'female', 'active', 1.125, 1500, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.215, 1850, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.315, 1375, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.415, 1578, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.815, 2047, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.515, 2486, 1),
 ('haruko', 'qwerty123', 'haruko@ukr.net', 'Petro', 'Petrenko', '1995-01-08' , 23, 175, 70, 'male', 'lazy', 1.215, 1457, 1);