package com.te.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMSApplication.class, args);
	}
	@Bean
public CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("commandLineRunner() is Executed!");
		};
}
}
