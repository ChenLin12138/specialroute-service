package com.chenlin.specialroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@ServletComponentScan(basePackages = "com.chenlin.specialroute.*")
public class SpecialrouteServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpecialrouteServiceApplication.class, args);
	}

}
