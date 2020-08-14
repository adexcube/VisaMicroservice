package edu.miu.eshop.visabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class EshopVisabankApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EshopVisabankApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EshopVisabankApplication.class);
	}
}
