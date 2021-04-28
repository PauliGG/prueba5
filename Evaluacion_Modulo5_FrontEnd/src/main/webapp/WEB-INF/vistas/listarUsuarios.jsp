<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Usuarios</title>

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

</head>
<body>

	<%@ include file='menu/menu3.jsp'%>
	
	<br>

	<main class="main">

		<h1 class="titulo-principal">Listar Usuarios</h1>

		<div class="container">
			 
			 <table class="listadoTabla">
                <thead>
                    <tr>
                        <th>RunUsuario</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Fecha Nacimiento</th>
                        <th>Username</th>
                        <th>Rol</th> 
                        <th>Editar</th>     
                    </tr>
                </thead>
                
                <tbody>
                
                <c:forEach items="${listado}" var="usuario">
                	  <tr>
						<td><c:out value="${usuario.getRunUsuario()}"></c:out></td>
						<td><c:out value="${usuario.getUsNombre()}"></c:out></td>
						<td><c:out value="${usuario.getUsApellido()}"></c:out></td>
						<td><c:out value="${usuario.getUsNacimiento()}"></c:out></td>
						<td><c:out value="${usuario.getAcceso().getAccUsername()}"></c:out></td>
						<td><c:out value="${usuario.getAcceso().getRol().getRolNombre()}"></c:out></td>

						<c:if test="${usuario.getAcceso().getRol().getRolNombre() == 'CLIENTE'}">
							<td><a href="/cliente/editar?dato=${usuario.getRunUsuario()}"> Editar</a></td>
						</c:if>
						
						<c:if test="${usuario.getAcceso().getRol().getRolNombre() == 'PROFESIONAL'}">
							<td><a href="/profesional/editar?dato=${usuario.getRunUsuario()}"> Editar</a></td>
						</c:if>
						
						<c:if test="${usuario.getAcceso().getRol().getRolNombre() == 'ADMINISTRATIVO'}">
							<td><a href="/administrativo/editar?dato=${usuario.getRunUsuario()}"> Editar</a></td>
						</c:if>
						 
					</tr>
                </c:forEach>
                	
                </tbody>

                <tfoot>
                    <tr>
                        <td colspan="5"></td>
                        <td><br>
                        
                            <!-- <input type="button" onclick="location.href='CrearCapacitacion';"
                                value="Crear capacitacion"> -->
                        </td>
                    </tr>
                </tfoot>

            </table>
 
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