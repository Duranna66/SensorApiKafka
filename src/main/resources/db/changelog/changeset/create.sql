CREATE TABLE if not exists sensor (
                                      id bigserial PRIMARY KEY,
                                      name varchar(255) unique
);
INSERT INTO sensor (name) values ('H200');
INSERT INTO sensor (name) values ('H300');
INSERT INTO sensor (name) values ('Lambo');
INSERT INTO sensor (name) values ('Ferr');
INSERT INTO sensor (name) values ('Tayota');
INSERT INTO sensor (name) values ('Volkswagen');
CREATE TABLE if not exists measurement(id bigserial PRIMARY KEY,
                                    value float(53) not null,
                                    raining boolean not null,
                                    sensor_name varchar(255) REFERENCES sensor (name)

 );