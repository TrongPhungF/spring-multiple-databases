
CREATE TABLE products
(
    id           BIGINT NOT NULL,
    product_name VARCHAR(255) NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE users
(
    id        BIGINT NOT NULL,
    username  VARCHAR(255) NULL,
    birth_day date NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);
