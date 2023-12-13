package com.example.RestApiSensor.services;

import com.example.RestApiSensor.dto.SensorDTO;
import com.example.RestApiSensor.dto.mappers.SensorMapper;
import com.example.RestApiSensor.models.Sensor;
import com.example.RestApiSensor.repo.SensorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    private final SensorRepo sensorRepo;

    private final SensorMapper sensorMapper;
    @Autowired
    public SensorService(SensorRepo sensorRepo, SensorMapper sensorMapper) {
        this.sensorRepo = sensorRepo;
        this.sensorMapper = sensorMapper;
    }
    public Sensor saveSensor(SensorDTO sensorDTO) {
        Sensor sensor = sensorMapper.sensorDTOMapToS(sensorDTO);
        return sensorRepo.save(sensor);
    }
}
