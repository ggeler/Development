package com.crm.pharma.dao;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crm.pharma.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class EmployeeLoadData {
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
		};
	}
}
