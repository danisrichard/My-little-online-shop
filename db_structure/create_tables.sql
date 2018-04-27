CREATE TABLE USER_TABLE(
    user_id VARCHAR2(20) PRIMARY KEY,
    user_firstname VARCHAR2(120) NOT NULL,
    user_lastname VARCHAR2(120) NOT NULL,
    user_password VARCHAR2(120),
    user_email VARCHAR2(120)
);

INSERT INTO USER_TABLE (user_id,user_firstname,user_lastname) VALUES ('1','Pelda','Janos');

COMMIT;