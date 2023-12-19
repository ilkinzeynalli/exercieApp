package com.example.msmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;


@EnableKafka
@EnableScheduling
@SpringBootApplication
public class MsMainApplication {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String healthUrl = "http://localhost:8200//v1/sys/health";
		String result = restTemplate.getForObject(healthUrl, String.class);

		System.out.println("Vault Health: " + result);
		SpringApplication.run(MsMainApplication.class, args);
	}

}
