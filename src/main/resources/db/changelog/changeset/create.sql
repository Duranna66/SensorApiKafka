CREATE TABLE if not exists sensor (
                                      id bigserial PRIMARY KEY,
                                      name varchar(255)
);
INSERT INTO sensor (name) values ('H200');