CREATE TABLE shipping
(
    id        NUMBER(38, 0) NOT NULL,
    ship_name VARCHAR2(255),
    CONSTRAINT pk_shipping PRIMARY KEY (id)
);

CREATE TABLE shipping_user
(
    id        NUMBER(38, 0) NOT NULL,
    user_name VARCHAR2(255),
    birth_day date,
    CONSTRAINT pk_shipping_user PRIMARY KEY (id)
);