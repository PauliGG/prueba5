/**
 * 
 */

$(document).ready(function () {

  	$("#formCapacitacion").validate({
		rules: {
		
			idCapacitacion: {
				required: true,
				max: 999999999
			},
			
			capFecha: {
				required: true
			},

			capLugar: {
				required: true,
				maxlength: 100
			},

			capDuracion: {
				max: 9999
			},

			clienteRutCliente: {
				required: true,
				max: 999999999,
			}

		},
		
		messages: {
		
			idCapacitacion: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
			},
			
			capFecha: {
				required: "Obligatorio",
			},

			capLugar: {
				required: "Obligatorio",
				maxlength: "Se requieren menos de {0} caracteres!" 
			},

			capDuracion: {
				max: "Ingrese un valor menor o igual que {0}"
			},

			clienteRutCliente: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
			}


		}
	});
	
});
	