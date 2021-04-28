/**
 * 
 */

 $(document).ready(function () {
	
	$("#formAdministrativo").validate({
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
 
			idAdministrativo: {
				required: true,
				max: 999999999
				},

			adCorreo: {
				required: true,
				maxlength: 70
				},

			adArea: {
				required: true,
				maxlength: 20
				},
				
			usuarioRunUsuario: {
				required: true,
				max: 999999999
				}
	 
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
			
			idAdministrativo: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},

			adCorreo: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			adArea: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},
				
			usuarioRunUsuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				}
 
		}
		
	});

});
 