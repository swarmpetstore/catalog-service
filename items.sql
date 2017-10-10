DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (id serial PRIMARY KEY, name varchar, quantity smallint);

INSERT INTO ITEM(name, quantity) VALUES ('tortoise', 5);
INSERT INTO ITEM(name, quantity) VALUES ('hamster', 10);
INSERT INTO ITEM(name, quantity) VALUES ('goldfish', 3);
INSERT INTO ITEM(name, quantity) VALUES ('lion', 9);
