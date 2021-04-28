/**
 * 
 */

$(document).ready(function () {

  	$("#formPago").validate({
		rules: {
		
			idPago: {
				required: true,
				max: 999999999
			},
			
			pagFecha: {
				required: true
			},

			pagMonto: {
				required: true,
				max: 999999999999
			},

			pagMes: {
				required: true
			},

			pagAnyo: {
				required: true,
				max: 9999
			},
			
			clienteRutCliente: {
				required: true,
				max: 999999999,
			}

		},
		
		messages: {
			idPago: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}"
			},
			
			pagFecha: {
				required: "Obligatorio"
			},

			pagMonto: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}"
			},

			pagMes: {
				required: "Obligatorio"
			},

			pagAnyo: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}"
			},
			
			clienteRutCliente: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
			}

		}
		
	});
	
});
	