package com.mycompany.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mycompany.dao.Dao;
import com.mycompany.data.ConnectionFactory;
import com.mycompany.model.Pessoa;

/**
 * 
 * @author Enoque Felipe
 *
 */
public class PessoaDao implements Dao<Pessoa> {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private Connection connection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#cadastrar(java.lang.Object)
	 */
	@Override
	public void cadastrar(Pessoa pessoa) throws SQLException {
		connection = new ConnectionFactory().getConnection();
		String sql = "insert into pessoas" + " (cpf,nome,rg,nascimento)" + " values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, pessoa.getCpf());
			stmt.setString(2, pessoa.getNome());
			stmt.setString(3, pessoa.getRg());
			stmt.setDate(4, new java.sql.Date(pessoa.getNascimento().getTimeInMillis()));
			stmt.execute();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			connection.close();
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.dao.Dao#listar()
	 */
	@Override
	public List<Pessoa> listar() throws SQLException {
		try {
			connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement("select * from pessoas");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("nascimento"));
				pessoa.setNascimento(data);
				pessoas.add(pessoa);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (connection != null){
				connection.close();
			}
		}
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

}
