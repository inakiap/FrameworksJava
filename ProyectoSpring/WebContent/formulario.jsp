<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="res/css/estilo.css">
    <link rel="stylesheet" href="res/css/bootstrap.css">
    <title>Formulario</title>
    <script type="text/javascript" src="res/js/scritp.js"></script>
</head>
 
<body>
<div class="container">
     <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" ><a href="persona?idioma=es"><img src="res/img/es.png"/></a></li>
            <li role="presentation" ><a href="persona?idioma=it"><img src="res/img/it.png"/></a></li>
            <li role="presentation" ><a href="persona?idioma=en"><img src="res/img/en.png"/></a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Introducir datos de la persona</h3>
      </div>
</div>
      
<div class="container">
	<div class="jumbotron">
    
    <form:form method="POST" modelAttribute="persona" enctype="multipart/form-data" >
		<div class="form-group">
                <label for="formnombre"><spring:message code="formnombre"></spring:message></label>
                <form:input type="text" path="nombre" id="nombre" class="form-control"/>
                <form:errors path="nombre" class="error"/><br><br>
        </div>        
        <div class="form-group">
                <label for="formedad"><spring:message code="formedad"></spring:message></label>
                <form:input type="text" path="edad" id="edad" class="form-control"/>
                <form:errors path="edad" class="error"/><br><br>
        </div>         
        <div class="form-group">        
                <label for="formdesc"><spring:message code="formdesc"></spring:message></label>
                <form:textarea path="descripcion" id="descripcion" class="form-control"/>
        		<form:errors path="descripcion" class="error"/><br><br>
        </div>		
        <div class="form-group">		
                <label for="formdni"><spring:message code="formdni"></spring:message></label>
                <form:input onchange="pedirLetra()" type="text" path="dni" id="dni" class="form-control"/>
                <form:errors path="dni" class="error"/><br><br>
    	</div>
    	<div class="form-group">
                <label for="formfoto"><spring:message code="formfoto"></spring:message></label>
                <form:input type="file" path="foto" class="form-control"/>
                <form:errors path="foto" class="error"/><br><br>
 		</div>
                <input type="submit" value="Submit" >
    </form:form>
	</div>
</div>
<div class="container">
		<footer class="footer">
       	 <p>Página web realizada por <a href="http://codigonatura.com" target="_blank"><img src="http://codigonatura.com/wp-content/uploads/2014/10/cn-logo1-e1413870836327.png" width="100px" style="vertical-align:middle;"></a></p>
      	</footer>
    </div>
</body>
</html>