package com.ramjava.azur.github.aktioun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurGithubAktiounApplication {
	@GetMapping
	public String message() {
		return "Gratulatioun, Är Applikatioun ass erfollegräich an Azure ofgesat!";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzurGithubAktiounApplication.class, args);
	}

}
