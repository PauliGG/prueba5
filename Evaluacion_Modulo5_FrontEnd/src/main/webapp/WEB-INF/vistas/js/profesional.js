/**
 * 
 */

 $(document).ready(function () {
 
	$.validator.addMethod("validarTelefono", function (value, element) {
        var pattern = /^\+569\d{8}$/ ;
        return this.optional(element) || pattern.test(value);
          }, "Se requieren formato [+569XXXXXXXX]");
	
	$("#formProfesional").validate({
		rules: {
		
			runUsuario: {
				required: true,
				max: 999999999,
				},

			usNombre: {
				required: true,
				maxlength: 30
				},

			usApellido: {
				required: true,
				maxlength: 50
				},

			usNacimiento: {
				required: true,
				},

			idProfesional: {
				required: true,
				max: 999999999,
				},

			proTelefono: {
				validarTelefono: true
				},

			proTitulo: {
				required: true,
				maxlength: 50
				},

			proProyecto: {
				maxlength: 50
				},
				
			usuarioRunUsuario: {
				required: true,
				max: 999999999,
				},
		},
		
		messages: {
		
			runUsuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},

			usNombre: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			usApellido: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			usNacimiento: {
				required: "Obligatorio"
				},
		
			idProfesional: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},

			proTelefono: {
				validarTelefono: "Obligatorio"
				},

			proTitulo: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			proProyecto: {
				maxlength: "Se requieren menos de {0} caracteres!"
				},
				
			usuarioRunUsuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},
 
		}
		
	});

});
 