<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Visitas</title>

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

	<%@ include file='menu/menu2.jsp'%>

	<br>

	<main class="main">

		<h1 class="titulo-principal">Listar Visitas</h1>

		<div class="container">
			 
			 <table class="listadoTabla">
                <thead>
                    <tr>
                        <th>Id_Visita</th>
                        <th>Fecha</th>
                        <th>Hora</th>
                        <th>Lugar</th>
                        <th>Comentario</th>
                        <th>Rut Cliente</th>      
                    </tr>
                </thead>
                
                <tbody>
                
                <c:forEach items="${listado}" var="visita">
                	  <tr>
						<td><c:out value="${visita.getIdVisita()}"></c:out></td>
						<td><c:out value="${visita.getVisFecha()}"></c:out></td>
						<td><c:out value="${visita.getVisHora()}"></c:out></td>
						<td><c:out value="${visita.getVisLugar()}"></c:out></td>
						<td><c:out value="${visita.getVisComentario()}"></c:out></td>
						<td><c:out value="${visita.getClienteRutCliente()}"></c:out></td>
						<td><a href="/chequeo/listar?dato=${visita.getClienteRutCliente()}"> Listas de Chequeo</a></td> 
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