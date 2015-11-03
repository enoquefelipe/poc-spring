package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.entity.Pessoa;

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
		System.out.println("Não achei o master");
		return "porra";
	}
	
	@RequestMapping("paginaCadastraUsuario")
	public String paginaCadastraUsuario() {
		return "cadastra-usuario";
	}
	
	@RequestMapping("/cadUser")
	public String cadastra(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		return "index";
	}
}
