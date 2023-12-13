package com.example.RestApiSensor.repo;

import com.example.RestApiSensor.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepo extends JpaRepository<Sensor, Long> {
    @Override
    <S extends Sensor> S save(S entity);
    Sensor findByName(String name);
}
