package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o código abaixo vai ser um Controller da API
@RestController

//indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping //anotação precisa ficar em cima, por conta da leitura em cascata
	public String hello() {
		return "Hello world!";
	}
	//get vai trazer informação da API
	@GetMapping("/listabsm") //subrota, pois só pode ter um request por class
	public String listabsm() {
		return "Lista de BSM's da Generation Brazil:\n\n Comunicação \n Persistência \n Responsabilidade pessoal \n Trabalho em equipe \n Proatividade \n Orientação ao detalhe \n Orientação ao futuro \n Mentalidade de crescimento";
	}
	
	//o hello vai ser sempre o principal, as subrotas devem ser  uma por vez, ex: localhost:8080/hello/bsm2 ou localhost:8080/hello/bsm
	@GetMapping("/objetivosemana") 
	public String objetivosemana() {
		return "Objetivos da minha semana:\n\n Persistência para aprender o Spring Boot \n Trabalho em equipe para apoiar meu grupo \n Comunicação para aprimorar todas as áreas da minha vida";
	}
	
}
