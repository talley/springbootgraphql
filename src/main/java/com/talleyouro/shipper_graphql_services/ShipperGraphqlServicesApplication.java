package com.talleyouro.shipper_graphql_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repositories")
@EntityScan(basePackages = "models")
public class ShipperGraphqlServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipperGraphqlServicesApplication.class, args);
	}

}
