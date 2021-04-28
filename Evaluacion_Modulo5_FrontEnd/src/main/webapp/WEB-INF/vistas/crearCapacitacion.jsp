<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitacion</title>

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
		<%@ include file="js/capacitacion.js" %>
	</script>

</head>
<body>

	<%@ include file='menu/menu1.jsp'%>
		
	<br> 

	<main class="main">
	
		<h1 class="titulo-principal">Crear Capacitacion</h1>

		<div class="container formulario">
		
			<form action="crear" method="post" id="formCapacitacion" modelAttribute="formCapacitacion">

				<div class="form-dato">
                    <label for="idCapacitacion" class="form-label">ID*: </label>
                    <input type="number" id="idCapacitacion" name="idCapacitacion" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="capFecha" class="form-label">Fecha*: </label>
                    <input type="date" id="capFecha" name="capFecha" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="capHora" class="form-label">Hora: </label>
                    <input type="time" id="capHora" name="capHora" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="capLugar" class="form-label">Lugar*: </label>
                    <input type="text" id="capLugar" name="capLugar" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="capDuracion" class="form-label">Duracion: </label>
                    <input type="number" id="capDuracion" name="capDuracion" class="form-campo">
                </div>
                
                 <div class="form-dato">
                    <label for="clienteRutCliente" class="form-label">Rut Cliente*: </label>
                    <input type="number" id="clienteRutCliente" name="clienteRutCliente" class="form-campo">
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