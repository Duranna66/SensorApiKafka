CREATE TABLE if not exists sensor (
                                      id bigserial PRIMARY KEY,
                                      name varchar(255) unique
);
DO $$
    DECLARE
        i integer := 0;
    BEGIN
        WHILE i < 1000 LOOP
                INSERT INTO sensor (name)
                VALUES ('F' || i);
                i := i + 1;
            END LOOP;
    END $$;
CREATE TABLE  if not exists measurement(id bigserial PRIMARY KEY,
                                    value float(53) not null,
                                    raining boolean not null,
                                    sensor_name varchar(255) not null REFERENCES sensor (name)

 );

