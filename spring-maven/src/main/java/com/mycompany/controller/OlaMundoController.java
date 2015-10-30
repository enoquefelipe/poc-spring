package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("olaMundo")
	public String olaMundo() {
		System.out.println("Executando a lógica com Spring MVC");
		return "sucesso";
	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("templateMaster")
	public String master() {
		System.out.println("Não achei caraiii!");
		return "template/master";
	}
	
	@RequestMapping("paginaCadastraUsuario")
	public String cadastraUsuario() {
		return "cadastra-usuario";
	}
}
