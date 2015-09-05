
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="res/css/estilo.css">
    <link rel="stylesheet" href="res/css/bootstrap.css">
	<title>Perfil de ${persona.nombre}</title>
	<script type="text/javascript" src="res/js/scritp.js"></script>

</head>
<body>
<div class="container">
     <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
          </ul>
        </nav>
        <h3 class="text-muted">Perfil de ${persona.nombre}</h3>
      </div>
</div>
<div class="container">
	<div class="jumbotron">
		<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Nombre</th>
				<th>Edad</th>
				<th>DNI</th>
				<th>Descripción</th>
				<th>Imágen de perfil</th>
			</tr>
			<tr>
				<td>${persona.nombre}</td>
				<td>${persona.edad}</td>
				<td>${persona.dni}</td>
				<td>${persona.descripcion}</td>
				<td><img alt="fotoPerfil" src="res/img/${persona.photoOriginalName}" width="150px" height="150px"></td>
			</tr>
		</table>
		</div>
	</div>
</div>
<div class="container">
		<footer class="footer">
       	 <p>Página web realizada por <a href="http://codigonatura.com" target="_blank"><img src="http://codigonatura.com/wp-content/uploads/2014/10/cn-logo1-e1413870836327.png" width="100px" style="vertical-align:middle;"></a></p>
      	</footer>
    </div>
</body>
</html>