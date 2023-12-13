CREATE TABLE if not exists sensor (
                                      id bigserial PRIMARY KEY,
                                      name varchar(255)
);
INSERT INTO sensor (name) values ('H200');
CREATE TABLE if not exists measurement(id bigserial PRIMARY KEY,
                                    value float(53) not null,
                                    raining boolean not null,
                                    sensor_name bigint REFERENCES sensor (name)

 );
INSERT INTO measurement(value, raining, sensor_name) VALUES (15.3, true, 'Kurwa')