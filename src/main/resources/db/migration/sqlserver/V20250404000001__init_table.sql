CREATE TABLE cars
(
    id       bigint NOT NULL,
    car_name varchar(255),
    CONSTRAINT pk_cars PRIMARY KEY (id)
)

CREATE TABLE users
(
    id        bigint NOT NULL,
    user_name  varchar(255),
    birth_day date,
    CONSTRAINT pk_users PRIMARY KEY (id)
)