package com.mycompany.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author Enoque Felipe 
 * Interface dao genérica para todas as entidades
 */
public interface Dao<T> {

	/**
	 * 
	 * Método responsável por salvar os registros
	 * 
	 * @param Object
	 * @throws SQLException 
	 */
	public void cadastrar(T t) throws SQLException;

	/**
	 * 
	 * Método responsável por editar os registros
	 * 
	 * @param Object
	 */
	public void editar(T t);

	/**
	 * 
	 * Método responsável por buscar uma lista de registros
	 * 
	 * @return List<Object>
	 * @throws SQLException 
	 */
	public List<T> listar() throws SQLException;

	/**
	 * 
	 * Método responsável por remover um registro
	 * 
	 * @param Object
	 */
	public void remover(T t);

}
