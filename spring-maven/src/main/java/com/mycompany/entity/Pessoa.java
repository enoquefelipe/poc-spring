package com.mycompany.entity;

/**
 * 
 * @author Enoque Felipe
 *
 */
public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	private String nascimento;

	public String getCpf() {
		return cpf;
	}

	public String getNascimento() {
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

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
