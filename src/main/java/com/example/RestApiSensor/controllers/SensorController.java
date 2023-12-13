package com.example.RestApiSensor.controllers;

import com.example.RestApiSensor.dto.SensorDTO;
import com.example.RestApiSensor.dto.mappers.MeasureMapper;
import com.example.RestApiSensor.dto.mappers.SensorMapper;
import com.example.RestApiSensor.models.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sensors")
public class SensorController {
    private final SensorMapper sensorMapper;
    @Autowired

    public SensorController(SensorMapper sensorMapper) {
        this.sensorMapper = sensorMapper;
    }

    @PostMapping("/registration")
    public ResponseEntity<SensorDTO> regSensor(@RequestBody SensorDTO sensorDTO) {
        System.out.println(sensorDTO);
        Sensor sensor = sensorMapper.sensorMapToDTO(sensorDTO);
        System.out.println(sensor);
        return ResponseEntity.ok(sensorDTO);
    }
}
