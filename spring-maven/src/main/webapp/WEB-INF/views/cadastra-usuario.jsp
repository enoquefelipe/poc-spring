<div class="panel panel-default">
	<div class="panel-heading">
		<b>Cadastro de Usuário</b>
	</div>
	<div class="panel-body">

		<br>

		<form class="form-horizontal" action="cadastrar" method="GET">
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
		</form>

	</div>
</div>
