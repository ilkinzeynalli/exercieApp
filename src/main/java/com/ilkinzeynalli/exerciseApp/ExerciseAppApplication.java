package com.ilkinzeynalli.exerciseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableKafka
@EnableScheduling
@SpringBootApplication
public class ExerciseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseAppApplication.class, args);
	}

}
