package com.example.RestApiSensor.repo;

import com.example.RestApiSensor.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeasureRepo extends JpaRepository<Measurement,Long > {
    @Override
    <S extends Measurement> S save(S entity);
    List<Measurement> getAllBy() ;

}
