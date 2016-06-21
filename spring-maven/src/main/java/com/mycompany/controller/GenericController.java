package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenericController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/olaMundo")
	public String olaMundo() {
		return "sucesso";
	}

}
