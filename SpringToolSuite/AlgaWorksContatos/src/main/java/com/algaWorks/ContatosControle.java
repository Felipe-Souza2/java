package com.algaWorks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "353123456789"));
		LISTA_CONTATOS.add(new Contato("2", "João", "353123456789"));
		LISTA_CONTATOS.add(new Contato("3", "Felipe", "353123456789"));
		LISTA_CONTATOS.add(new Contato("4", "Marcos", "353123456789"));
		LISTA_CONTATOS.add(new Contato("5", "Ana", "353123456789"));
	}
	
	@GetMapping("/")  // isso aqui é uma anotação
	public String index() {
		return  "index";
	}
	
	@GetMapping("/contatos") 
	public ModelAndView listar() {
		ModelAndView modelAndView = new  ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return  modelAndView;
	}
	
	@GetMapping("/contatos/novo") 
	public ModelAndView novo() {
		ModelAndView modelAndView = new  ModelAndView("formulario");
		
		modelAndView.addObject("contato", new Contato());
		return  modelAndView;
	}
	
	@PostMapping("/contatos")
	public String cadastrar() {
		return "";
	}
}
