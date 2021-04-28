/**
 * 
 */

 $(document).ready(function () {

	$("#cliente").hide();
	$("#profesional").hide();
	$("#administrativo").show();
	
	$("#perfil").change(function(){
		
		if($("#perfil").val()==1){
			$("#cliente").show();
			$("#profesional").hide();
			$("#administrativo").hide();
			$('#formUsuario').attr('action', 'crearCliente');
			$("#profesional").remove();
			$("#administrativo").remove();
				
		}else if($("#perfil").val()==2){
			$("#cliente").hide();
			$("#profesional").show();
			$("#administrativo").hide();
			$('#formUsuario').attr('action', 'crearProfesional');
			$("#cliente=").remove();
			$("#administrativo").remove();
				
		}else if($("#perfil").val()==3){
			
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").show();
			$('#formUsuario').attr('action', 'crearAdministrativo');
			$("#cliente").remove();
			$("#profesional").remove();

		}else if($("#perfil").val()==0) {
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").hide();
			 
		} 
		
	});	
	
	
	$("#formUsuario").validate({
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
				
			perfil: {
				required: true
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
				
			perfil: {
				required: "Obligatorio",
				}
		}
	});
	
	
 
});
 