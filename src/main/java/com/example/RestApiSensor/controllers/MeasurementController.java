package com.example.RestApiSensor.controllers;

import com.example.RestApiSensor.dto.MeasurementDTO;
import com.example.RestApiSensor.dto.mappers.MeasureMapper;
import com.example.RestApiSensor.models.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/measurements")
public class MeasurementController {
    private final MeasureMapper measureMapper;
    @Autowired

    public MeasurementController(MeasureMapper measureMapper) {
        this.measureMapper = measureMapper;
    }

    @PostMapping("/add")
    public ResponseEntity<MeasurementDTO> add(@RequestBody MeasurementDTO measurementDTO) {
        System.out.println(measurementDTO);
        Measurement measurement = measureMapper.measurementDTOMapToPOJO(measurementDTO);
        System.out.println(measurement);
        return ResponseEntity.ok(measurementDTO);
    }
    @GetMapping
    public ResponseEntity<List<MeasurementDTO>> getAllMes() {
        return null;
    }
    @GetMapping("/rainyDaysCount")
    public Long getAllRainyDays() {
        return 1L;
    }
}
