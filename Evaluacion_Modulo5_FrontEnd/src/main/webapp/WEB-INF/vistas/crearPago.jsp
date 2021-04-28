<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Pago</title>

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
		<%@ include file="js/pago.js" %>
	</script>

</head>
<body>

	<%@ include file='menu/menu3.jsp'%>
		
	<br> 

	<main class="main">
	
		<h1 class="titulo-principal">Crear Pago</h1>

		<div class="container formulario">
		
			<form action="crear" method="post" id="formPago" modelAttribute="formPago">

				<div class="form-dato">
                    <label for="idPago" class="form-label">Id_Pago*: </label>
                    <input type="number" id="idPago" name="idPago" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="pagFecha" class="form-label">Fecha*: </label>
                    <input type="date" id="pagFecha" name="pagFecha" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="pagMonto" class="form-label">Monto: </label>
                    <input type="number" id="pagMonto" name="pagMonto" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="pagMes" class="form-label">Mes*: </label>
                   <select id="pagMes" name="pagMes" class="form-campo">
						<option value=""></option>
						<option value="1"> Enero </option>
						<option value="2"> Febrero </option>
						<option value="3"> Marzo </option>
						<option value="4"> Abril </option>	
						<option value="5"> Mayo </option>
						<option value="6"> Junio </option>
						<option value="7"> Julio </option>
						<option value="8"> Agosto </option>
						<option value="9"> Septiembre </option>
						<option value="10"> Octubre </option>	
						<option value="11"> Noviembre </option>
						<option value="12"> Diciembre </option>	 
					</select>
                </div>

                <div class="form-dato">
                    <label for="pagAnyo" class="form-label">Año: </label>
                    <input type="number" id="pagAnyo" name="pagAnyo" class="form-campo">
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