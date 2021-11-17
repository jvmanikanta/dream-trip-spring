package com.maintenenceapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class TripMaintenenceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TripMaintenenceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();

}
	
}
