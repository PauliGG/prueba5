<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<%@ include file="js/login.js" %>
	</script>	

</head>
<body>

	<s:authorize access="!isAuthenticated()">
		<%@ include file='menu/menu0.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('CLI')">
	     <%@ include file='menu/menu1.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('PRO')">
	     <%@ include file='menu/menu2.jsp'%>
	</s:authorize>
	
	<s:authorize access="hasRole('AD')">
	     <%@ include file='menu/menu3.jsp'%>
	</s:authorize>
 
 	<br>
 	
	<main class="main">

		<h1 class="titulo-principal">Login</h1>

		<div class="container formulario">
			
			<c:url value="/login" var="loginUrl"/>
			
			<form id="formLogin" class="form-signin" method="post" action="${loginUrl}">
			
				<!-- <s:csrfInput /> -->
				
				<c:if test="${param.error != null}">
               		<p class="alert alert-danger">Username y password incorrectos, intentalo nuevamente.</p>
                </c:if>

               	<c:if test="${param.logout != null}">
                	<p class="alert alert-info">La sesión ha sido cerrada correctamente.</p>
                </c:if>
				
				
				
		        <h2 class="form-signin-heading">Por favor, registrese</h2>
		        <p>
		          <label for="username" class="sr-only">Usuario</label>
		          <input type="text" id="username" name="username" class="form-control" placeholder="Username" >
		        </p>
		        <p>
		          <label for="password" class="sr-only">Clave</label>
		          <input type="password" id="password" name="password" class="form-control" placeholder="Password">
		        </p>
		        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
		      
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