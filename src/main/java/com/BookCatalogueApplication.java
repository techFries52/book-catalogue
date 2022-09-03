package com;

import com.services.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogueApplication.class, args);
	}

	CommandLineRunner run(AppUserService userService){
		return args -> {

		};
	}
}
