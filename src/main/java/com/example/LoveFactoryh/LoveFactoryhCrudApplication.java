package com.example.LoveFactoryh;

import Controller.CController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.Banner;


@SpringBootApplication
@RestController

public class LoveFactoryhCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveFactoryhCrudApplication.class, args);

	}

}
