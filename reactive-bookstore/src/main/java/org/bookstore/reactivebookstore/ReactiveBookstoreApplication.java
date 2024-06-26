package org.bookstore.reactivebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class ReactiveBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveBookstoreApplication.class, args);
	}
}
