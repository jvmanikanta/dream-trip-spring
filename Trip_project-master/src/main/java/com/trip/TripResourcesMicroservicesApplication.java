package com.trip;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.trip.model.Priority;
import com.trip.model.Status;
import com.trip.model.Trip;
import com.trip.service.ITripService;

@SpringBootApplication
@EnableDiscoveryClient
public class TripResourcesMicroservicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TripResourcesMicroservicesApplication.class, args);
	}

	@Autowired
	ITripService tripService;

	@Override
	public void run(String... args) throws Exception {

		
		


	}

    @Bean
  //  @LoadBalanced
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
}
