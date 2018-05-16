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

CREATE TABLE order_table(
    order_id VARCHAR2(150) PRIMARY KEY,  
    item_id VARCHAR2(150) ,
    user_id VARCHAR2(150)
);

COMMIT;

/* ROLE INSERTS */

INSERT INTO ALL_ROLE_TABLE (role_id, role)
VALUES (1, 'ROLE_ADMIN');
INSERT INTO ALL_ROLE_TABLE (role_id, role)
VALUES (2, 'ROLE_USER');

COMMIT;

INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Taska', 'Lorem ipsum', 1, 2500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 1', 'Lorem ipsum', 1, 5500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 2', 'Lorem ipsum 1', 1, 4500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 3', 'Lorem ipsum 2', 1, 3500); 
INSERT INTO product_table (product_id,product_name,description,quantity,price) VALUES (item_insert_seq.NEXTVAL , 'Lorem 4', 'Lorem ipsum 3', 1, 6500); 

COMMIT;

CREATE SEQUENCE insertseq INCREMENT BY 1;

CREATE SEQUENCE item_insert_seq INCREMENT BY 1;

