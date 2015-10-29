<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="">
<link href="./resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<title>Index</title>
</head>
<body>

	<div class="container">

		<!-- Static navbar -->
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				 <span class="icon-bar"></span> <span class="icon-bar"></span> 
				 <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Spring Web MVC</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index">Home</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Opções<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="olaMundo">Olá Mundo</a></li>
							<li><a href="templateMaster">Master</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Opção 2</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Sair</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid --> </nav>

		<div class="jumbotron">
			<h2>Bem Vindo!</h2>
			<p>
				<a href="olaMundo.action">Clique aqui!</a>
			</p>
		</div>

	</div>

	<script src="./resources/js/jquery-min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
</body>
</html>