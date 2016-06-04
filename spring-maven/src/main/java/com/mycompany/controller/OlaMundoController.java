package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("olaMundo")
	public String olaMundo() {
		System.out.println("Executando a lógica com Spring MVC");
		return "sucesso";
	}

	@RequestMapping("/paginaCadastraUsuario")
	public String paginaCadastraUsuario() {
		return "cadastra-usuario";
	}

}
