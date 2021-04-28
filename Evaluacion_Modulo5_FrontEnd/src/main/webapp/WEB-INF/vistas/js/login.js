/**
 * 
 */

 
$(document).ready(function () {

 	$("#formLogin").validate({
		rules: {
			username: {
				required: true,
			},

			password: {
				required: true,
			},
 
		},
		
		messages: {
			
			username: {
				required: "Obligatorio",
			},

			password: {
				required: "Obligatorio",
			},

		}
	});
	
});
	