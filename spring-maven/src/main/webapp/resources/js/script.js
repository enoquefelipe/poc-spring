$(document).ready(function() {
	$("#cpf").mask("999.999.999-99");
	$("#data").mask("99/99/9999");
	$("#cep").mask("99999-999");
	$("#celular").mask("(99)99999-9999");
	$("#fixo").mask("(99)9999-9999");

	$("#menu-usuario").click(function() {
		$("#menu-usuario").addClass("active");
		$("#menu-endereco").removeClass("active");
		$("#menu-contato").removeClass("active");

		$('#usuario').css('display', 'block');
		$('#endereco').css('display', 'none');
		$('#contato').css('display', 'none');
	});

	$("#menu-endereco").click(function() {
		$("#menu-endereco").addClass("active");
		$("#menu-usuario").removeClass("active");
		$("#menu-contato").removeClass("active");

		$('#usuario').css('display', 'none');
		$('#endereco').css('display', 'block');
		$('#contato').css('display', 'none');
	});

	$("#menu-contato").click(function() {
		$("#menu-contato").addClass("active");
		$("#menu-endereco").removeClass("active");
		$("#menu-usuario").removeClass("active");

		$('#usuario').css('display', 'none');
		$('#endereco').css('display', 'none');
		$('#contato').css('display', 'block');
	});

});
