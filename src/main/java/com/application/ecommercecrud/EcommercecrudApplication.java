package com.application.ecommercecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EcommercecrudApplication {

	public static void main(String[] args) {

		Dotenv dotEnv = Dotenv.configure().load();
		dotEnv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));
		SpringApplication.run(EcommercecrudApplication.class, args);
	}

}
