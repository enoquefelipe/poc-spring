package com.mycompany.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dao.Dao;
import com.mycompany.model.Pessoa;

/**
 * 
 * @author Enoque Felipe
 *
 */
public class PessoaDao implements Dao<Pessoa> {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#cadastrar(java.lang.Object)
	 */
	@Override
	public void cadastrar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#listar()
	 */
	@Override
	public List<Pessoa> listar() {
		return pessoas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#remover(java.lang.Object)
	 */
	@Override
	public void remover(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#editar(java.lang.Object)
	 */
	@Override
	public void editar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

}
