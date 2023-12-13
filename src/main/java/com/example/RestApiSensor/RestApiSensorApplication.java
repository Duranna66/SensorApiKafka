package com.example.RestApiSensor;

import com.example.RestApiSensor.models.Sensor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiSensorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiSensorApplication.class, args);//test
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
//	@Bean
//	public SessionFactory sessionFactory() {
//		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//	}

}
