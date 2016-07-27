<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="message" class="" role="alert">${message}</div>

<div class="panel panel-default">
	<div class="panel-heading">
		<b>Lista Usuários</b>
	</div>
	<div class="panel-body">

		<br>

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a href="cadastrar" class="btn btn-default navbar-btn" title="Cadastrar pessoa">Novo</a>
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
					<td class="center">${pessoa.rg}</td>
					<td class="center">${pessoa.cpf}</td>
					<td class="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${pessoa.nascimento.time}"/></td>
				</tr>
			</c:forEach>

		</table>

	</div>
</div>
