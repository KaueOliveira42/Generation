package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/BSM")
	public String teste() {
		return "Mentalidade de crescimento<br>" +
		       "Orientação ao futuro<br>" +
		       "Responsabilidade pessoal<br>" +
		       "Persistência<br>" +
		       "Trabalho em equipe<br>" +
		       "Comunicação<br>" +
		       "Proatividade<br>" +
		       "Orientação ao detalhe<br>" +
		       "Proatividade<br>" +
		       "Persistência";
	}

	@GetMapping("/Objetivos-de-aprendizagem")
	public String objetivos() {
		return "Revisar o conteúdo de SQL<br>" +
		       "Continuar aprendendo sobre SPRING e API's<br>" +
		       "Revisar o conteúdo de SPRING e API<br>";
	}
}
