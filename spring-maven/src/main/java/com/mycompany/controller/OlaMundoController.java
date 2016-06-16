package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.entity.Pessoa;

/**
 * 
 * @author Enoque Felipe
 *
 */
@Controller
public class OlaMundoController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/olaMundo")
	public String olaMundo() {
		return "sucesso";
	}

	@RequestMapping("/cadastraUsuario")
	public String cadastraUsuario() {
		return "cadastra-usuario";
	}

	@RequestMapping("/cadastrar")
	public String cadastrar(Pessoa pessoa) {
		return "index";
	}
}
