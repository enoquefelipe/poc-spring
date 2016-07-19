package com.mycompany.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String cadastrar() {
		return "usuarios/cadastrar";
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ModelAndView cadastrar(Pessoa pessoa, RedirectAttributes redirectAttributes) {
		PessoaDao dao = new PessoaDao();
		try {
			dao.cadastrar(pessoa);
			redirectAttributes.addFlashAttribute("message", "Registro gravado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Falha ao gravar o registro!");
		}
		return new ModelAndView("redirect:listar");
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listar(RedirectAttributes redirectAttributes) {
		PessoaDao dao = new PessoaDao();
		ModelAndView mv = new ModelAndView("usuarios/listar");
		try {
			pessoas = dao.listar();
			if (pessoas.isEmpty()) {
				mv.addObject("message", "Nenhum registro encontrado!");
			}
		} catch (Exception e) {
			mv.addObject("message", "Erro ao consultar os registros, descrição: " + e.getMessage());
		}
		mv.addObject("pessoas", pessoas);
		return mv;
	}
}
