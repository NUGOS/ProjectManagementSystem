insert into companies (name, description, number_of_employees)
VALUES ('APPLE', 'Aмериканская корпорация,производитель персональных и планшетных компьютеров,
                аудиоплееров, смартфонов, программного обеспечения.', 10000),
       ('MICROSOFT', 'Oдна из крупнейших транснациональных компаний по производству проприетарного
                 программного обеспечения для различного рода вычислительной техники — персональных компьютеров,
                 игровых приставок, КПК, мобильных телефонов и прочего', 15000),
       ('GOOGLE', ' американская транснациональная корпорация в составе холдинга Alphabet,
                 инвестирующая в интернет-поиск, облачные вычисления и рекламные технологии', 20000);
insert into skills (id, industry, skill_level)
VALUES (11, 'Java', 'Junior'),
       (12, 'Java', 'Middle'),
       (13, 'Java', 'Senior'),
       (21, 'C++', 'Junior'),
       (22, 'C++', 'Middle'),
       (23, 'C++', 'Senior'),
       (31, 'C#', 'Junior'),
       (32, 'C#', 'Middle'),
       (33, 'C#', 'Senior'),
       (41, 'JS', 'Junior'),
       (42, 'JS', 'Middle'),
       (43, 'JS', 'Senior');

insert into customers (name, business)
VALUES ('Jhon', 'SpaceX Starship'),
       ('Ivan', 'UMZ'),
       ('Nikita', 'Pavlograd Chemical Plant (PCP)');

insert into developers (first_name, last_name, age, gender, mail, company_id)
VALUES ('Василий', 'Пяточкин', 25, 'male', 'piatockin@ukr.net', 1),
       ('Алексей', 'Войнич', 30, 'male', 'voinich@gmail.com', 2),
       ('Валера', 'Гречнев', 29, 'male', 'grechnev@mail.com', 2),
       ('Настя', 'Данина', 25, 'female', 'danina@mail.com', 3),
       ('Игорь', 'Щербина', 29, 'male', 'chrbina@gmail.com', 3),
       ('Сергей', 'Никитин', 35, 'male', 'nikitin@gmail.com', 2),
       ('Лена', 'Никитина', 32, 'female', 'nikitina@mail.com', 2);

insert into developers_skills
VALUES (1, 13),
       (1, 33),
       (1, 42),
       (2, 13),
       (2, 22),
       (3, 11),
       (4, 43),
       (5, 12),
       (5, 33),
       (6, 11),
       (7, 12);

insert into projects (name, description, company_id, customer_id)
VALUES ('Siri', 'improvement of the voice assistant', 1, 2),
       ('Cortana', 'improvement of the voice assistant', 2, 2),
       ('Translated', 'translation of the program into a new language', 3, 1),
       ('Send', 'sending packagesZ', 3, 3);

insert into developers_projects
VALUES (1, 1),
       (3, 1),
       (2, 3),
       (2, 2),
       (4, 4),
       (5, 3),
       (5, 1),
       (6, 3),
       (6, 2),
       (7, 3),
       (7, 2);

UPDATE developers
SET salary = 2000
WHERE id IN (1);
UPDATE developers
SET salary = 3500
WHERE id IN (2);
UPDATE developers
SET salary = 2200
WHERE id IN (3);
UPDATE developers
SET salary = 3000
WHERE id IN (4);
UPDATE developers
SET salary = 1900
WHERE id IN (5);
UPDATE developers
SET salary = 1700
WHERE id IN (6);
UPDATE developers
SET salary = 3100
WHERE id IN (7);

UPDATE projects
SET cost = 25000
WHERE name IN ('Siri');
UPDATE projects
SET cost = 15000
WHERE name IN ('Cortana');
UPDATE projects
SET cost = 10000
WHERE name IN ('Translated');
UPDATE projects
SET cost = 20000
WHERE name IN ('Send');

UPDATE projects
SET date = '2022-07-10'
WHERE id = 1;
UPDATE projects
SET date = '2022-01-03'
WHERE id = 2;
UPDATE projects
SET date = '2022-04-01'
WHERE id = 3;
UPDATE projects
SET date = '2021-01-21'
WHERE id = 4;