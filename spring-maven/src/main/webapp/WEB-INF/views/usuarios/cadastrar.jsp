<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Nav tabs -->
<ul class="nav nav-tabs" role="tablist">
	<li role="presentation" class="active"><a href="#user" aria-controls="user" role="tab" data-toggle="tab">Usuário</a></li>
	<li role="presentation"><a href="#address" aria-controls="address" role="tab" data-toggle="tab">Endereço</a></li>
	<li role="presentation"><a href="#contact" aria-controls="contact" role="tab" data-toggle="tab">Contato</a></li>
</ul>

<br>

<form action="cadastrar" method="POST">
	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane active" id="user">

			<div class="panel panel-default">
				<div class="panel-heading">
					<b>Usuário</b>
				</div>
				<div class="panel-body">

					<div class="form-horizontal">

						<br>

						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-8">
								<input name="nome" type="text" class="form-control" id="nome" placeholder="Nome..." required="required">
							</div>
						</div>

						<div class="form-group">
							<label for="rg" class="col-sm-2 control-label">RG</label>
							<div class="col-sm-4">
								<input name="rg" class="form-control" id="rg" placeholder="RG..." required="required">
							</div>
						</div>

						<div class="form-group">
							<label for="cpf" class="col-sm-2 control-label">CPF</label>
							<div class="col-sm-4">
								<input name="cpf" class="form-control" id="cpf" placeholder="CPF..." required="required">
							</div>
						</div>

						<div class="form-group">
							<label for="data" class="col-sm-2 control-label">Data de Nascimento</label>
							<div class="col-sm-2">
								<input name="nascimento" type="text" class="form-control" id="data" placeholder="Nascimento..." required="required">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-primary">Enviar</button>
							</div>
						</div>

					</div>

				</div>
			</div>

		</div>

		<div role="tabpanel" class="tab-pane" id="address">

			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="form-horizontal">
						<b>Endereço</b>
					</div>
				</div>
				<div class="panel-body">
					<div class="form-horizontal">

						<div class="form-group">
							<label for="cep" class="col-sm-2 control-label">CEP</label>
							<div class="col-sm-2">
								<input name="cep" type="text" class="form-control" id="cep" placeholder="Logradouro...">
							</div>
						</div>

						<div class="form-group">
							<label for="logradouro" class="col-sm-2 control-label">Logradouro</label>
							<div class="col-sm-8">
								<input name="logradouro" type="text" class="form-control" id="logradouro" placeholder="Logradouro...">
							</div>
						</div>

						<div class="form-group">
							<label for="estado" class="col-sm-2 control-label">Estado</label>
							<div class="col-sm-2">
								<select class="form-control" id="estado" name="estado" class="form-control">
									<option value="SP">SP</option>
									<option value="RJ">RJ</option>
									<option value="MG">MG</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="cidade" class="col-sm-2 control-label">Cidade</label>
							<div class="col-sm-3">
								<input name="cidade" type="text" class="form-control" id="cidade" placeholder="Cidade...">
							</div>
						</div>

						<div class="form-group">
							<label for="bairro" class="col-sm-2 control-label">Bairro</label>
							<div class="col-sm-4">
								<input name="bairro" type="text" class="form-control" id="bairro" placeholder="Bairro...">
							</div>
						</div>

						<div class="form-group">
							<label for="numero" class="col-sm-2 control-label">Numero</label>
							<div class="col-sm-2">
								<input name="numero" type="text" class="form-control" id="numero" placeholder="Numero...">
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<div role="tabpanel" class="tab-pane" id="contact">

			<div class="panel panel-default">
				<div class="panel-heading">
					<b>Contato</b>
				</div>
				<div class="panel-body">
					<div class="form-horizontal">

						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">E-mail</label>
							<div class="col-sm-5">
								<input name="email" type="email" class="form-control" id="cep" placeholder="E-mail...">
							</div>
						</div>

						<div class="form-group">
							<label for="celular" class="col-sm-2 control-label">Celular</label>
							<div class="col-sm-2">
								<input name="celular" type="text" class="form-control" id="celular" placeholder="Celular...">
							</div>
						</div>

						<div class="form-group">
							<label for="fixo" class="col-sm-2 control-label">Fixo</label>
							<div class="col-sm-2">
								<input name="fixo" type="text" class="form-control" id="fixo" placeholder="Fixo...">
							</div>
						</div>

					</div>
				</div>
			</div>

		</div>
	</div>
</form>




<ul class="nav nav-tabs">
	<li role="presentation" class="active" id="menu-usuario"><a href="#usuario">Usuário</a></li>
	<li role="presentation" class="" id="menu-endereco"><a href="#endereco">Endereço</a></li>
	<li role="presentation" class="" id="menu-contato"><a href="#contato">Contato</a></li>
</ul>

<br>

<div class="form-horizontal">

	<div class="panel panel-default" id="usuario">
		<div class="panel-heading">
			<b>A</b>
		</div>
		<div class="panel-body">

			<p>AAAAaaaa</p>

		</div>
	</div>

	<div class="panel panel-default" id="endereco">
		<div class="panel-heading">
			<b>B</b>
		</div>
		<div class="panel-body">

			<p>BBBBbbbb</p>

		</div>
	</div>

	<div class="panel panel-default" id="contato">
		<div class="panel-heading">
			<b>C</b>
		</div>
		<div class="panel-body">

			<p>CCCCcccc</p>

		</div>
	</div>
</div>