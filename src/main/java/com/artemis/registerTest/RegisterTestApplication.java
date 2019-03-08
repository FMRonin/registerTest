package com.artemis.registerTest;

import com.artemis.registerTest.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterTestApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(RegisterTestApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		// clear all record if existed before do the tutorial with new data
		repository.deleteAll();
	}
}
