package com.katmanl.mimari.katmanliMimariDeneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KatmanliMimariDenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatmanliMimariDenemeApplication.class, args);
	}
	@Bean
	public SecondClass getSecondClass(){
		return new SecondClass();
	}
}
