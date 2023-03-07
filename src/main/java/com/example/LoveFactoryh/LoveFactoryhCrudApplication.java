package com.example.LoveFactoryh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RequestMapping
public class LoveFactoryhCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveFactoryhCrudApplication.class, args);}
	@GetMapping("/hola")
	public String controller(){
		//model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
		return "Funciona de una puta vez";
	}

	}

