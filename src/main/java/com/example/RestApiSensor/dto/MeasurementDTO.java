package com.example.RestApiSensor.dto;

import com.example.RestApiSensor.models.Sensor;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementDTO {
    private boolean raining;
    private double value;
    private Sensor sensor;

}
