<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<b>Lista Usuários</b>
	</div>
	<div class="panel-body">

		<br>

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a href="cadastraUsuario" class="btn btn-default navbar-btn" title="Adicionar pessoa"> <span class="glyphicon glyphicon-plus"
						aria-hidden="true"></span></a>
				</div>
			</div>
		</nav>

		<table class="table table-bordered">
			<tr>
				<th class="center">Nome</th>
				<th class="center">RG</th>
				<th class="center">CPF</th>
				<th class="center">Data</th>
			</tr>

			<c:forEach items="${pessoas}" var="pessoa">
				<tr>
					<td>${pessoa.nome}</td>
					<td>${pessoa.rg}</td>
					<td>${pessoa.cpf}</td>
					<td>${pessoa.nascimento}</td>
				</tr>
			</c:forEach>

		</table>

	</div>
</div>
