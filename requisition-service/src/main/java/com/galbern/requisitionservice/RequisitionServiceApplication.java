package com.galbern.requisitionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class RequisitionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequisitionServiceApplication.class, args);
	}

}
