/**
 * 
 */

$(document).ready(function () {
	
	 $.validator.addMethod("validarTelefono", function (value, element) {
        var pattern = /^\+569\d{8}$/ ;
        return this.optional(element) || pattern.test(value);
          }, "Se requieren formato [+569XXXXXXXX]");
	
	$("#formContacto").validate({
		rules: {
			conNombre: {
				required: true,
				maxlength: 50,
			},

			conMail: {
				required: true,
				email: true
			},
			
			conTelefono:  {
				required: true,
				validarTelefono: true
			},

			conMensaje: {
				required: true,
				maxlength: 250
			},

			conGenero: {
				required: true,
			},

			 
		},
		
		messages: {
			
			
			conNombre: {
				required: "Obligatorio",
				maxlength:"Se requieren menos de {0} caracteres!",
			},

			conMail: {
				required: "Obligatorio",
				email: "Se requiere email valido"
			},
			
			conTelefono: {
				required: "Obligatorio",
			},

			conMensaje: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
			},

			conGenero: {
				required: "Obligatorio",
			},

		}
	});
	
	 
   
 
});
