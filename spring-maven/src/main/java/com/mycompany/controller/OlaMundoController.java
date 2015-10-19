package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("olaMundo")
	public String execute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "sucesso";
	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
