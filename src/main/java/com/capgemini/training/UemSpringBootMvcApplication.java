package com.capgemini.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.capgemini.training.entity")
@EnableJpaRepositories("com.capgemini.training.dao")
public class UemSpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UemSpringBootMvcApplication.class, args);
	}

}
