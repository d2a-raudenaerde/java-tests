CREATE DATABASE testdb;


CREATE TABLE test(phone VARCHAR(32), firstname VARCHAR(32), lastname VARCHAR(32), address VARCHAR(64));

INSERT INTO test(phone, firstname, lastname, address) VALUES('+1 123 456 7890', 'John', 'Doe', 'North America');
INSERT INTO test(phone, firstname, lastname, address) VALUES('+1 123 456 7891', 'Jane', 'Doe', 'North America');
