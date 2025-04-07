CREATE TABLE authors
(
    id        BIGINT NOT NULL,
    username  VARCHAR(255) NULL,
    birth_day date NULL,
    CONSTRAINT pk_author PRIMARY KEY (id)
);

CREATE TABLE books
(
    id        BIGINT NOT NULL,
    book_name VARCHAR(255) NULL,
    CONSTRAINT pk_book PRIMARY KEY (id)
);

