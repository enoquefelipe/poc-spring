package com.mycompany.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.dao.impl.PessoaDao;
import com.mycompany.model.Pessoa;

/**
 * 
 * @author Enoque Felipe
 *
 */
@Controller
public class UsuarioController {
	private List<Pessoa> pessoas;

	@RequestMapping("/cadastra-usuario-form")
	public String cadastrar() {
		return "usuarios/cadastrar";
	}

	@RequestMapping("/cadastrar")
	public String cadastrar(Pessoa pessoa) {
		PessoaDao dao = new PessoaDao();
		dao.cadastrar(pessoa);
		return "redirect:listar";
	}

	@RequestMapping("/listar")
	public ModelAndView listar() {
		PessoaDao dao = new PessoaDao();
		pessoas = dao.listar();
		ModelAndView mv = new ModelAndView("usuarios/listar");
		mv.addObject("pessoas", pessoas);
		return mv;
	}
}
