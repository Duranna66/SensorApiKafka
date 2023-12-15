package com.example.RestApiSensor.controllers;

import com.example.RestApiSensor.dto.SensorDTO;
import com.example.RestApiSensor.dto.mappers.MeasureMapper;
import com.example.RestApiSensor.dto.mappers.SensorMapper;
import com.example.RestApiSensor.models.Sensor;
import com.example.RestApiSensor.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
public class SensorController {
    private final SensorService service;
    @Autowired

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping("/registration")
    public ResponseEntity<SensorDTO> regSensor(@RequestBody SensorDTO sensorDTO) {
        service.saveSensor(sensorDTO);
        return ResponseEntity.ok(sensorDTO);
    }
}
