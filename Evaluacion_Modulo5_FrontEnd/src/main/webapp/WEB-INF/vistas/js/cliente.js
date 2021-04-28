/**
 * 
 */

 $(document).ready(function () {
 
 	 $.validator.addMethod("validarTelefono", function (value, element) {
        var pattern = /^\+569\d{8}$/ ;
        return this.optional(element) || pattern.test(value);
          }, "Se requieren formato [+569XXXXXXXX]");
	
	$("#formCliente").validate({
		rules: {
 
			rutCliente: {
				required: true,
				max: 999999999,
				},

			cliTelefono: {
				required: true,
				validarTelefono: true
				},

			cliAfp: {
				maxlength: 30
				},

			cliSistemasalud: {
				max: 2
				},
				
			cliDireccion: {
				required: true,
				maxlength: 100
				},

			cliComuna: {
				required: true,
				maxlength: 50
				},

			cliEdad: {
				required: true,
				max: 999,
				},
				
			usuarioRunUsuario: {
				required: true,
				max: 999999999,
				},
				
		},
		
		messages: {
		
			rutCliente: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},

			cliTelefono: {
				required: "Obligatorio"
				},

			cliAfp: {
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			cliSistemasalud: {
				max:"Ingrese un valor menor o igual que {0}"
				},
				
			cliDireccion: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			cliComuna: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
				},

			cliEdad: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},
				
			usuarioRunUsuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				},
		
		}
		
	});
 
});
 