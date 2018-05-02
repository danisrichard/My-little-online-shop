DROP TABLE USER_TABLE;

CREATE TABLE USER_TABLE(
    user_id VARCHAR2(150) PRIMARY KEY,
    email VARCHAR2(150),
    password VARCHAR2(150),
    username VARCHAR2(150),
    first_name VARCHAR2(150),
    last_name VARCHAR2(150),
    active INTEGER
);

INSERT INTO USER_TABLE VALUES('1','DSA@GMAIL.COM','1234','USERNAME','RICHARD',' DANIS',1);

COMMIT;

DROP TABLE USER_ROLE;

CREATE TABLE USER_ROLE(
    role_id VARCHAR2(150) ,
    role VARCHAR2(150) UNIQUE,
    CONSTRAINT fk_user_table
        FOREIGN KEY (role_id)
        REFERENCES USER_TABLE(user_id)
);

COMMIT;

DROP TABLE  product_table;

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