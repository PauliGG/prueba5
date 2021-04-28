<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Chequeo</title>

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

		<h1 class="titulo-principal">Listar Chequeo</h1>

		<div class="container">
			 
			 <table class="listadoTabla">
                <thead>
                    <tr>
                        <th>Id_Chequeo</th>
                        <th>Nombre</th>
                        <th>Detalle</th>
                        <th>Estado</th>
                        <th>Rut Cliente</th>      
                    </tr>
                </thead>
                
                <tbody>
                
                <c:forEach items="${listado}" var="chequeo">
                
                
                <c:if test="${param.error != null}">
                
                </c:if>
                
                <c:if test="${chequeo.getClienteRutCliente() == param.dato }">
                
                 <tr>
						<td><c:out value="${chequeo.getIdChequeo()}"></c:out></td>
						<td><c:out value="${chequeo.getNombre()}"></c:out></td>
						<td><c:out value="${chequeo.getDetalle()}"></c:out></td>
						<td><c:out value="${chequeo.getEstado()}"></c:out></td>
						<td><c:out value="${chequeo.getClienteRutCliente()}"></c:out></td> 
				</tr>
						
				</c:if>
                
                	 
					
					
                </c:forEach>
                	
                </tbody>

                <tfoot>
                    <tr>
                         
                        <td td colspan="4"><br>
               
                        	<strong> Estado:1 - sin problemas / Estado:2 - con observaciones / Estado:3 - no aprueba</strong>

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