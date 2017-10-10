DROP TABLE IF EXISTS PET;

CREATE TABLE PET (id serial PRIMARY KEY, name varchar, quantity smallint);

INSERT INTO PET(name, quantity) VALUES ('tortoise', 5);
INSERT INTO PET(name, quantity) VALUES ('hamster', 10);
INSERT INTO PET(name, quantity) VALUES ('goldfish', 3);
INSERT INTO PET(name, quantity) VALUES ('lion', 9);
