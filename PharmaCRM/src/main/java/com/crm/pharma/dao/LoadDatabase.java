package com.crm.pharma.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crm.pharma.entity.Employee;
import com.crm.pharma.entity.Order;
import com.crm.pharma.entity.Status;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
			log.info("Preloading " + orderRepository.save(new Order("MacBook Pro", Status.COMPLETED)));
			log.info("Preloading " + orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));

			//orderRepository.findAll().forEach(order -> {
			//	log.info("Preloaded " + order);
			//});
		};
	}
}
