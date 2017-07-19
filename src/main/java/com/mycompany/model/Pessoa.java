package com.mycompany.model;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author Enoque Felipe
 *
 */
public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar nascimento;

	public String getCpf() {
		return cpf;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
