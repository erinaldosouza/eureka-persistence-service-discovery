package br.com.tcc.persistence.service.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
public class EurekaPeristenceServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeristenceServiceDiscoveryApplication.class, args);
	}

}
