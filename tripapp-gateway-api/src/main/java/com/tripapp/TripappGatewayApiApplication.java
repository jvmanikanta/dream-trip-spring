package com.tripapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin("http://localhost:4200")
public class TripappGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripappGatewayApiApplication.class, args);
	}

	@Bean
	public RouteLocator customRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("workerAPI", r->
				r.path("/workers-service/**")
				.uri("lb://WORKERS-SERVICE"))
				.route("taskAPI", r->
				r.path("/task-service/**")
				.uri("lb://TASK-SERVICE"))
				.route("maintainenceAPI", r->
				r.path("/maintenence-service/**")
				.uri("lb://MAINTENENCE-SERVICE"))
				.route("tripsAPI", r -> 
				r.path("/trip-service/**")
				.uri("lb://TRIP-SERVICE"))
				.build();
	}
}
