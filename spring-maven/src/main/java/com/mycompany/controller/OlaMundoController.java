package com.mycompany.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView cadastrar(Pessoa pessoa) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa);
		ModelAndView mv = new ModelAndView("lista-usuario");
		mv.addObject("pessoas", pessoas);
		return mv;
	}

	@RequestMapping("/listar")
	public ModelAndView listarUsuario() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		ModelAndView mv = new ModelAndView("lista-usuario");
		mv.addObject("pessoas", pessoas);
		return mv;
	}
}
