<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacto</title>

<!-- BootStrap -->
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- BootStrap fin -->

	<style type="text/css">
		<%@ include file="css/estilo.css" %>
	</style>
	
	<style type="text/css">
		<%@ include file="css/error.css" %>
	</style>
		
	<!-- Jquery y Validate-->

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.js"></script>
	<!-- Jquery y Validate - fin-->
	
	<script type="text/javascript">
		<%@ include file="js/contacto.js" %>
	</script>

</head>
<body>

	<%@ include file='menu/menu1.jsp'%>
	
	<br> 

	<main class="main">
	
		<h1 class="titulo-principal">Contacto</h1>

		<div class="container formulario">
			<form action="PostContacto" method="post" id="formContacto" modelAttribute="formContacto">

                <div class="form-dato">
                    <label for="conNombre" class="form-label">Nombres*: </label>
                    <input type="text" id="conNombre" name="conNombre" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="conMail" class="form-label">Correo Electronico*: </label>
                    <input type="text" id="conMail" name="conMail" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="conTelefono" class="form-label">Telefono*: </label>
                    <input type="text" id="conTelefono" name="conTelefono" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="conMensaje" class="form-label">Mensaje*: </label>
                    <input type="text" id="conMensaje" name="conMensaje" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="conGenero" class="form-label">Genero*: </label>
                    <select id="conGenero" name="conGenero" class="form-campo">
						<option value=""></option>
						<option value="hombre">Hombre</option>
						<option value="mujer">Mujer</option>
					</select>
                </div>
                <br>

                <div class="form-dato">
                    <label for="" class="form-label">(*) Obligatorio </label>
                    <input class="submit" type="submit" value="Enviar">
                </div>

            </form>
  
		</div>
		
	</main>
	

<!-- BootStrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous"></script>
<!-- BootStrap fin -->

</body>
</html>