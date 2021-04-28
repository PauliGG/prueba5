<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>

<!-- BootStrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- BootStrap fin -->

	<style type="text/css">
		<%@ include file="../css/estilo.css" %>
	</style>

</head>
<body>

	<s:authorize access="!isAuthenticated()">
		<%@ include file='../menu/menu0.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('CLI')">
	     <%@ include file='../menu/menu1.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('PRO')">
	     <%@ include file='../menu/menu2.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('AD')">
	     <%@ include file='../menu/menu3.jsp'%>
	</s:authorize>

	<main class="main">

		<h1 class="titulo-principal">Error</h1>

		<div class="container formulario" style=" text-align:center; ">
			<h1 style="color:gray;"> [ 403 ]</h1>
			<p>Lo sentimos, acceso denegado.</p>		
			<p>Prohibido: Usuario no autorizado</p>
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