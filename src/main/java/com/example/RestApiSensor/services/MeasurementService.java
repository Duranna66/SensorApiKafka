package com.example.RestApiSensor.services;

import com.example.RestApiSensor.dto.MeasurementDTO;
import com.example.RestApiSensor.dto.mappers.MeasureMapper;
import com.example.RestApiSensor.models.Measurement;
import com.example.RestApiSensor.repo.MeasureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MeasurementService {
    private final MeasureMapper measureMapper;
    private final MeasureRepo measureRepo;
    @Autowired
    public MeasurementService(MeasureMapper measureMapper, MeasureRepo measureRepo) {
        this.measureMapper = measureMapper;
        this.measureRepo = measureRepo;
    }
    public Measurement saveMes(MeasurementDTO measurementDTO) {
        Measurement measurement = measureMapper.measurementDTOMapToPOJO(measurementDTO);
        System.out.println(measurement);
        return measureRepo.save(measurement);
    }
    public List<MeasurementDTO> getAll() {
        return measureMapper.measurementDTOList(measureRepo.getAllBy());
    }
    public int countOfRainy() {
        List<Measurement> measurements = measureRepo.getAllBy();
        AtomicInteger count = new AtomicInteger();
        measurements.forEach(x -> {
            if(x.isRaining()) {
                count.addAndGet(1);
            }
        });
        return count.get();
    }

}
