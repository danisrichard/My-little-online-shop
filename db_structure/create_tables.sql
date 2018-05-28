/*
DROP TABLE USER_TABLE;
DROP TABLE USERS_ROLE_TABLE;
DROP TABLE ALL_ROLE_TABLE;
DROP TABLE product_table;
DROP TABLE order_table;
DROP TABLE USER_ROLE;
*/

CREATE TABLE USER_TABLE(
    user_id VARCHAR2(150),
    email VARCHAR2(150),
    password VARCHAR2(150), 
    username VARCHAR2(150),  --USER
    first_name VARCHAR2(150), 
    last_name VARCHAR2(150),
    active INTEGER  --IS_ACTIVE_USER?
);

CREATE TABLE USERS_ROLE_TABLE(
    USER_ID VARCHAR2(150),
    ROLE_ID VARCHAR2(150)
);

CREATE TABLE ALL_ROLE_TABLE(
    role_id VARCHAR2(150) ,   --ID 1 OR 2
    role VARCHAR2(150)  -- ADMIN / USER
);

CREATE TABLE product_table (
    product_id VARCHAR2(150) PRIMARY KEY,
    product_name VARCHAR2(150),
    description VARCHAR2(150),
    quantity VARCHAR2(150),
    price VARCHAR2(150)
);

CREATE TABLE users_order_table(   -- user és rendelés_id segéd tábla
    user_id VARCHAR2(150),
    order_id VARCHAR2(150)
);

CREATE TABLE order_product_table(  -- rendelés tábla és product segéd tábla
    product_id VARCHAR2(150),
    order_id VARCHAR2(150)
);

CREATE TABLE order_table(  --rendelés tábla
    order_id VARCHAR2(150) PRIMARY KEY,  --UNIQUE
    order_date TIMESTAMP,
    user_id VARCHAR2(150)
);

COMMIT;

/* ROLE INSERTS */

INSERT INTO ALL_ROLE_TABLE (role_id, role)
VALUES (1, 'ROLE_ADMIN');
INSERT INTO ALL_ROLE_TABLE (role_id, role)
VALUES (2, 'ROLE_USER');

COMMIT;

CREATE SEQUENCE insertseq INCREMENT BY 1;

CREATE SEQUENCE item_insert_seq INCREMENT BY 1;

INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Taska', 'Lorem ipsum', 1, 2500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 1', 'Lorem ipsum', 1, 5500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 2', 'Lorem ipsum 1', 1, 4500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 3', 'Lorem ipsum 2', 1, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 4', 'Lorem ipsum 3', 1, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 5', 'Lorem ipsum 2', 1, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 6', 'Lorem ipsum 3', 2, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 7', 'Lorem ipsum 2', 3, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 8', 'Lorem ipsum 3', 4, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 9', 'Lorem ipsum 2', 10, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 10', 'Lorem ipsum 3s', 12, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 11', 'Lorem ipsum 2a', 15, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 12', 'Lorem ipsum 3n', 17, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 13', 'Lorem ipsum 2u', 19, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 14', 'Lorem ipsum 3z', 18, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 15', 'Lorem ipsum 2k', 10, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 16', 'Lorem ipsum 3p', 12, 6500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 17', 'Lorem ipsum 2p', 15, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 18', 'Lorem ipsum 3', 20, 6500); 
COMMIT;



