package com.example.RestApiSensor.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean raining;
    private double value;
    @ManyToOne
    @NonNull
    @JoinColumn(name = "sensor_name", referencedColumnName = "name")
    private Sensor sensor;
}
