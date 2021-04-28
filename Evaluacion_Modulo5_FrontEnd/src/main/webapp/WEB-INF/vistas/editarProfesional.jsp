<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Profesional</title>

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
		<%@ include file="js/profesional.js" %>
	</script>

</head>
<body>

	<%@ include file='menu/menu3.jsp'%>
		
	<br> 

	<main class="main">

		<h1 class="titulo-principal">Editar Profesional</h1>

		<div class="container formulario">
		
			<form action="modificar" method="post" id="formProfesional" modelAttribute="formProfesional">
			
			<!-- Datos de acceso y rol  -->

                <h3>Datos de Acceso</h3>
                	
				<div class="form-dato">
                    <label for="idAcceso" class="form-label">ID acceso: </label>
                    <input type="number" id="idAcceso" name="usuario.acceso.idAcceso" class="form-campo" value="${editar.getUsuario().getAcceso().getIdAcceso()}">
                </div>
                
                <div class="form-dato">
                    <label for="accUsername" class="form-label">Username*: </label>
                    <input type="text" id="accUsername" name="usuario.acceso.accUsername" class="form-campo" value="${editar.getUsuario().getAcceso().getAccUsername()}">
                </div>

                <div class="form-dato">
                    <label for="accPassword" class="form-label">Password: </label>
                    <input type="text" id="accPassword" name="usuario.acceso.accPassword" class="form-campo" value="${editar.getUsuario().getAcceso().getAccPassword()}">
                </div>
               
                <div class="form-dato">
                    <label for="idRol" class="form-label">Id rol: </label>
                    <input type="number" id="idRol" name="usuario.acceso.rol.idRol" class="form-campo" value="${editar.getUsuario().getAcceso().getRol().getIdRol()}">
                </div>
                
                <div class="form-dato">
                    <label for="rolNombre" class="form-label">nombre rol: </label>
                    <input type="text" id="rolNombre" name="usuario.acceso.rol.rolNombre" class="form-campo" value="${editar.getUsuario().getAcceso().getRol().getRolNombre()}">
                </div>
			

				<!-- Datos para todos los usuarios  -->
				<br>
                	<h3>Datos de usuario</h3>
                	
				<div class="form-dato">
                    <label for="runUsuario" class="form-label">RUN*: </label>
                    <input type="number" id="runUsuario" name="usuario.runUsuario" class="form-campo" value="${editar.getUsuario().getRunUsuario()}">
                </div>
                
                <div class="form-dato">
                    <label for="usNombre" class="form-label">Nombre*: </label>
                    <input type="text" id="usNombre" name="usuario.usNombre" class="form-campo" value="${editar.getUsuario().getUsNombre()}">
                </div>

                <div class="form-dato">
                    <label for="usApellido" class="form-label">Apellido*: </label>
                    <input type="text" id="usApellido" name="usuario.usApellido" class="form-campo" value="${editar.getUsuario().getUsApellido()}">
                </div>

                <div class="form-dato">
                    <label for="usNacimiento" class="form-label">Fecha de Nacimiento: </label>
                    <input type="date" id="usNacimiento" name="usuario.usNacimiento" class="form-campo" value="${editar.getUsuario().getUsNacimiento()}">
                </div>

				<div id="profesional" >
                
                	<br>
                	<h3>Datos de Profesional</h3>
                	
                	<div class="form-dato">
	                    <label for="idProfesional" class="form-label">Id_Profesional: </label>
	                    <input type="number" id="idProfesional" name="idProfesional" class="form-campo" value="${editar.getIdProfesional()}">
	                </div>
                
	                <div class="form-dato">
	                    <label for="proTelefono" class="form-label">Telefono: </label>
	                    <input type="text" id="proTelefono" name="proTelefono" class="form-campo"value="${editar.getProTelefono()}">
	                </div>
	                
	                <div class="form-dato">
	                    <label for="proTitulo" class="form-label">Titulo*: </label>
	                    <input type="text" id="proTitulo" name="proTitulo" class="form-campo" value="${editar.getProTitulo()}">
	                </div>
	
	                <div class="form-dato">
	                    <label for="proProyecto" class="form-label">Proyecto: </label>
	                    <input type="text" id="proProyecto" name="proProyecto" class="form-campo" value="${editar.getProProyecto()}">
	                </div>
                
                </div>
				<br>
                <div class="form-dato">
                    <label for="" class="form-label">(*) Obligatorio </label>
                    <input class="submit" type="submit" value="Editar Profesional">
                </div>
                <br>
            </form>
            
            <div class="form-dato">
                <label for="" class="form-label"> </label>
                <input type="button" onclick="location.href='/usuario/listar';" value="Volver">
           </div>
  
		</div>
		<br>
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