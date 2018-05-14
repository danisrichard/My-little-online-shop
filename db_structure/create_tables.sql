--DROP TABLE USER_TABLE;
--DROP TABLE USERS_ROLE_TABLE;
--DROP TABLE ALL_ROLE_TABLE;
--DROP TABLE product_table;
--DROP TABLE order_table;
--DROP TABLE USER_ROLE;

CREATE TABLE USER_TABLE(
    user_id VARCHAR2(150) PRIMARY KEY,
    email VARCHAR2(150),
    password VARCHAR2(150), 
    username VARCHAR2(150),  --USER
    first_name VARCHAR2(150), 
    last_name VARCHAR2(150),
    active INTEGER  --IS_ACTIVE_USER?
);

CREATE TABLE USERS_ROLE_TABLE(
    USER_ID VARCHAR2(150),
    ROLE_ID VARCHAR2(150),
    CONSTRAINT fk_user_table
    FOREIGN KEY (USER_ID)
    REFERENCES USER_TABLE(user_id)
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

INSERT INTO USERS_ROLE_TABLE (user_id, role_id)
VALUES (1, 1);
INSERT INTO USERS_ROLE_TABLE (user_id, role_id)
VALUES (1, 2);
INSERT INTO USERS_ROLE_TABLE (user_id, role_id)
VALUES (2, 2);
INSERT INTO USERS_ROLE_TABLE (user_id, role_id)
VALUES (3, 2);

/* DEMO INSERT */

INSERT INTO USER_TABLE (user_id, password, email, username, first_name, last_name, active)
VALUES
  (1, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'dsa@mail.com', 'user', 'Name', 'Surname',
   1);
INSERT INTO USER_TABLE (user_id, password, email, username, first_name, last_name, active)
VALUES
  (2, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'richard@gmail.com', 'ricskooo', 'Richard', 'Danis', 1);
INSERT INTO USER_TABLE (user_id, password, email, username, first_name, last_name, active)
VALUES 
  (3, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'test@gmail.com', 'namesurname', 'Name',
        'Surname', 1);
        
COMMIT;