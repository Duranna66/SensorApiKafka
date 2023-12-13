package com.example.RestApiSensor.dto.mappers;

import com.example.RestApiSensor.dto.MeasurementDTO;
import com.example.RestApiSensor.models.Measurement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasureMapper {
    public ModelMapper modelMapper;
    @Autowired

    public MeasureMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MeasurementDTO measurementMapToDTO(Measurement measurement) {
        return modelMapper.map(measurement, MeasurementDTO.class);
    }
    public Measurement measurementDTOMapToPOJO(MeasurementDTO measurementDTO) {
        return modelMapper.map(measurementDTO, Measurement.class);
    }
    public List<MeasurementDTO> measurementDTOList(List<Measurement> measurements) {
        return measurements.stream().map(x -> modelMapper.map(x, MeasurementDTO.class)).toList();
    }
}
