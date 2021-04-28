<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Cliente</title>

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
		<%@ include file="js/cliente.js" %>
	</script>

</head>
<body>

	<%@ include file='menu/menu3.jsp'%>
		
	<br> 

	<main class="main">

		<h1 class="titulo-principal">Crear Cliente</h1>

		<div class="container formulario">
		
			<form action="crear" method="post" id="formCliente" modelAttribute="formCliente">
			
			<!-- Datos de acceso y rol  -->

                <h3>Datos de Acceso</h3>
                	
				<div class="form-dato">
                    <label for="idAcceso" class="form-label">ID acceso: </label>
                    <input type="number" id="idAcceso" name="usuario.acceso.idAcceso" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="accUsername" class="form-label">Username*: </label>
                    <input type="text" id="accUsername" name="usuario.acceso.accUsername" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="accPassword" class="form-label">Password: </label>
                    <input type="text" id="accPassword" name="usuario.acceso.accPassword" class="form-campo">
                </div>
               
                <div class="form-dato">
                    <label for="idRol" class="form-label">Id rol: </label>
                    <input type="number" id="idRol" name="usuario.acceso.rol.idRol" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="rolNombre" class="form-label">nombre rol: </label>
                    <input type="text" id="rolNombre" name="usuario.acceso.rol.rolNombre" class="form-campo">
                </div>
			

				<!-- Datos para todos los usuarios  -->
				<br>
                	<h3>Datos de usuario</h3>
                	
				<div class="form-dato">
                    <label for="runUsuario" class="form-label">RUN*: </label>
                    <input type="number" id="runUsuario" name="usuario.runUsuario" class="form-campo">
                </div>
                
                <div class="form-dato">
                    <label for="usNombre" class="form-label">Nombre*: </label>
                    <input type="text" id="usNombre" name="usuario.usNombre" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="usApellido" class="form-label">Apellido*: </label>
                    <input type="text" id="usApellido" name="usuario.usApellido" class="form-campo">
                </div>

                <div class="form-dato">
                    <label for="usNacimiento" class="form-label">Fecha de Nacimiento: </label>
                    <input type="date" id="usNacimiento" name="usuario.usNacimiento" class="form-campo">
                </div>
       
				<div id="cliente" >
                	<br>
                	<h3>Datos de Cliente</h3>
                
	                <div class="form-dato">
	                    <label for="rutCliente" class="form-label">Rut Cliente*: </label>
	                    <input type="number" id="rutCliente" name="rutCliente" class="form-campo">
	                </div>
	                
	                 <div class="form-dato">
	                    <label for="cliTelefono" class="form-label">Telefono*: </label>
	                    <input type="text" id="cliTelefono" name="cliTelefono" class="form-campo">
	                </div>
	                
	                <div class="form-dato">
	                    <label for="cliAfp" class="form-label">Afp: </label>
	                    <input type="text" id="cliAfp" name="cliAfp" class="form-campo">
	                </div>
	                
	                 <div class="form-dato">
	                    <label for="cliSistemaSalud" class="form-label">Sistema de salud: </label>
	                    <select id="cliSistemaSalud" name="cliSistemaSalud" class="form-campo">
							<option value="0"></option>
							<option value="1">Fonasa</option>
							<option value="2">Isapre</option>		 
						</select>
	                </div>                
	                
	                <div class="form-dato">
	                    <label for="cliDireccion" class="form-label">Direccion*: </label>
	                    <input type="text" id="cliDireccion" name="cliDireccion" class="form-campo">
	                </div>
	                
	                 <div class="form-dato">
	                    <label for="cliComuna" class="form-label">Comuna*: </label>
	                    <input type="text" id="cliComuna" name="cliComuna" class="form-campo">
	                </div> 
	                
	                <div class="form-dato">
	                    <label for="cliEdad" class="form-label">Edad*: </label>
	                    <input type="number" id="cliEdad" name="cliEdad" class="form-campo">
	                </div>  
                
                </div>       
                <br>
                <div class="form-dato">
                    <label for="" class="form-label">(*) Obligatorio </label>
                    <input class="submit" type="submit" value="Crear Cliente">
                </div>
                
            </form>
            
          <div class="form-dato">
                <label for="" class="form-label"> </label>
                <input type="button" onclick="location.href='/usuario/crear';" value="Volver">
           </div>
  <br>
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