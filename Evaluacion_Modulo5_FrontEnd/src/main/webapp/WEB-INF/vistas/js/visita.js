/**
 * 
 */

$(document).ready(function () {

  	$("#formVisita").validate({
		rules: {
		
			idVisita: {
				required: true,
				max: 999999999
			},
			
			visFecha: {
				required: true
			},

			visHora: {
				maxlength: 5
			},

			visLugar: {
				required: true,
				maxlength: 50
			},
			visComentario: {
				required: true,
				maxlength: 250
			},

			clienteRutCliente: {
				required: true,
				max: 999999999,
			}

		},
		
		messages: {
		
			idVisita: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}"
			},
			
			visFecha: {
				required: "Obligatorio"
			},

			visHora: {
				maxlength: "Se requieren menos de {0} caracteres!"
			},

			visLugar: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
			},
			visComentario: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!"
			},

			clienteRutCliente: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}"
			}
 
		}
		
	});
	
});
	