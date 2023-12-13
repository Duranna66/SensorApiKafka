package com.example.RestApiSensor.dto.mappers;

import com.example.RestApiSensor.dto.SensorDTO;
import com.example.RestApiSensor.models.Sensor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorMapper {
    private final ModelMapper modelMapper;
    @Autowired

    public SensorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public Sensor sensorMapToDTO(SensorDTO sensorDTO) {
        return modelMapper.map(sensorDTO, Sensor.class);
    }
}
