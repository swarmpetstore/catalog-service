DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (id serial PRIMARY KEY, name varchar, description varchar, quantity smallint);

INSERT INTO ITEM(name, quantity) VALUES ('tortoise', 'Slow friendly reptile', 5);
INSERT INTO ITEM(name, quantity) VALUES ('hamster', 'Energetic rodent', 10);
INSERT INTO ITEM(name, quantity) VALUES ('goldfish', 'Will make your aquarium pretty', 3);
INSERT INTO ITEM(name, quantity) VALUES ('lion', 'Slightly bigger cat which loves cuddling', 9);
