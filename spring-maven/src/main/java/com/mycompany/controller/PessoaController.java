package com.mycompany.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.dao.impl.PessoaDao;
import com.mycompany.entity.Pessoa;

/**
 * 
 * @author Enoque Felipe
 *
 */
@Controller
public class PessoaController {
	private List<Pessoa> pessoas;

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
		PessoaDao dao = new PessoaDao();
		dao.cadastrar(pessoa);
		return "redirect:listar";
	}

	@RequestMapping("/listar")
	public ModelAndView listarUsuario() {
		PessoaDao dao = new PessoaDao();
		pessoas = dao.listar();
		ModelAndView mv = new ModelAndView("lista-usuario");
		mv.addObject("pessoas", pessoas);
		return mv;
	}
}
