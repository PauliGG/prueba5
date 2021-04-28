
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Grupo 2</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNav">
		
			<li class="nav-item">
				<a class="nav-link" href="/">Inicio</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" href="/usuario/listar">Listado de Usuarios</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" href="/usuario/crear">Crear Usuario</a>
			</li>			
			
			<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown"
					aria-expanded="false">Pago</a>
					
					<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="/pago/listar">Listado de Pagos</a></li>
						<li><a class="dropdown-item" href="/pago/crear">Crear Pago</a></li>
						
					</ul>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" href="/confirmLogout">Logout</a>
			</li> 
 
		</div>
	</div>
</nav>