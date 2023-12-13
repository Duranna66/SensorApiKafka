package com.example.RestApiSensor.controllers;

import com.example.RestApiSensor.dto.MeasurementDTO;
import com.example.RestApiSensor.dto.mappers.MeasureMapper;
import com.example.RestApiSensor.models.Measurement;
import com.example.RestApiSensor.services.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/measurements")
public class MeasurementController {
    private MeasurementService service;
    @Autowired

    public MeasurementController(MeasurementService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<MeasurementDTO> add(@RequestBody MeasurementDTO measurementDTO) {
        System.out.println(measurementDTO);
        service.saveMes(measurementDTO);
        return ResponseEntity.ok(measurementDTO);
    }
    @GetMapping
    public ResponseEntity<List<MeasurementDTO>> getAllMes() {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/rainyDaysCount")
    @ResponseBody
    public Integer getAllRainyDays() {
        return service.countOfRainy();
    }
}
