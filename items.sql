DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (id serial PRIMARY KEY, item_id varchar, name varchar, description varchar, quantity smallint);

INSERT INTO ITEM(name, item_id, description, quantity) VALUES ('tortoise', 'dbf67f4d-f1c9-4fd4-96a8-65ee1a22b9ff', 'Slow friendly reptile', 5);
INSERT INTO ITEM(name, item_id, description, quantity) VALUES ('hamster', 'fc7ee3ea-8f82-4144-bcc8-9a71f4d871bd', 'Energetic rodent', 10);
INSERT INTO ITEM(name, item_id, description, quantity) VALUES ('goldfish', '725dfad2-0b4d-455c-9385-b46c9f356e9b', 'Will make your aquarium pretty', 3);
INSERT INTO ITEM(name, item_id, description, quantity) VALUES ('lion', 'a2aa1ca7-add8-4aae-b361-b7f92d82c3f5', 'Slightly bigger cat which loves cuddling', 9);
