package com.xoriant.Loginservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableAutoConfiguration
@SpringBootApplication
@EntityScan({"com.xoriant.Loginservice.api.entity.ManagerLogin", "com.xoriant.Loginservice.api.entity.CustomerLogin"})
@EnableJpaRepositories("com.xoraint.Loginservice.api.repository")
@ComponentScan({"com.xoriant.Loginservice.api.repository.CustomerLoginRepository"})
public class CustomerManagerLoginserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagerLoginserviceApplication.class, args);
	}

}
