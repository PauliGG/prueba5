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
		<%@ include file="css/estilo.css" %>
	</style>

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

		<h1 class="titulo-principal">Inicio</h1>

		<div class="container">
			<h2>�Cu�l es el objetivo del sistema de informaci�n?</h2>
			<p>Este sistema de informaci�n est� realizado para la mejora de gesti�n, control,
			seguridad y disponibilidad de informaci�n de una empresa de asesor�as de prevenci�n
			de riesgos.
 
			Contiene m�dulos de gesti�n de informaci�n para los clientes y para la empresa
			que provee el servicio, a trav�s de un conjunto de p�ginas web.

			</p>

			<h3>�Quienes deber�an usarlo?</h3>
			<p>Esta provisto de un acceso seguro restringido para cada tipo de usuario, mediante
 			un nombre de usuario y contrase�a. Cada Usuario se le es asignado un �nico rol.</p>
 			
 			<p>UserName: cliente  , Clave : 123456</p>
 			<p>UserName: profesional  , Clave : 123456</p>
 			<p>UserName: administrativo  , Clave : 123456</p>

			<h4>�Qu� procesos considera la plataforma actualmente?</h4>

			<ol type="1">
 				<li>Login (Cliente/Administrativo/Profesional): Pagina para iniciar sesi�n.</li>

<li>Contacto (Cliente): Formulario de contacto para realizar consultas. </li>

<li>Crear Capacitaci�n (Cliente): Formulario para crear una capacitaci�n en el sistema. </li>

<li>Listar Capacitaci�n (Cliente): Listado de capacitaciones registradas. </li>

<li>Listado de Usuarios (Administrativo): Listado de Usuarios existentes y
 permite acceder a editar el registro de cada tipo de usuario. </li>

<li>Crear Usuario (Administrativo): Crear Nuevo Usuario al sistema.</li>

				<li>Editar cliente (Administrativo): Formulario que permite modificar los
datos de un usuario de tipo cliente.</li>
				<li>Editar Profesional (Administrativo): Formulario que permite modificar los
datos  de  un  usuario  de  tipo profesional.</li>
				<li>Editar Administrativo (Administrativo): Formulario que permite modificar los
datos  de  un  usuario  de  tipo administrativo.</li>
				<li>Listado de Visitas (Profesional): Lista de todas las visitas realizadas a
cada uno de los clientes.</li>
				<li>Responder Checklist (Profesional): Listado de chequeos de una visita.</li>
				<li>Listado Pago (Administrativo): Lista de todos los pagos realizados por los clientes.</li>
				<li>Crear Pago (Administrativo): Permitir� agregar un pago al sistema. 

-Logout: Cierre de sesi�n.</li> 
			</ol>

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