package com.example.LoveFactoryh;

import Controller.CController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class LoveFactoryhCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveFactoryhCrudApplication.class, args);

		CController controller = new CController();
		controller.controller();
	}
}
