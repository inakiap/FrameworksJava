<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="res/css/bootstrap.min.css">

<!-- Optional theme 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">-->
<!-- Jumbotron theme -->
<link href="res/css/style.css" rel="stylesheet">

<!-- Latest compiled and minified JavaScript -->
<script src="res/js/bootstrap.min.js"></script>
<title>Empleado</title>
</head>
<body>
<div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" class="active"><a href="index.jsp" >Volver</a></li>
            
          </ul>
        </nav>
        <h3 class="text-muted">Ejemplos Struts2</h3>
      </div>

</div>
   <div class="container">
     <div class="jumbotron">
		<h1>Empleado</h1>
		<h3>Nombre: <s:property value="empleado.firstName"/></h3>
		<h3>Edad: <s:property value="empleado.lastName"/></h3>
	</div>

 <div class="container">
		<footer class="footer">
       	 <p>P�gina web realizada por <a href="http://codigonatura.com" target="_blank"><img src="http://codigonatura.com/wp-content/uploads/2014/10/cn-logo1-e1413870836327.png" width="100px" style="vertical-align:middle;"></a></p>
      	</footer>
    </div>
<script src="res/js/jquery.js"></script>

</body>
</html>