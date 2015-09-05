<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">

var xmlHttp = new XMLHttpRequest();

function llamadaRest()
{
	var name = document.getElementById("nombre").value;
	var age = document.getElementById("edad").value;
	var description = document.getElementById("descripcion").value;
	
	var persona = {
		    nombre:name,
		    edad:age, 
		    descripcion:description
		};
	
	xmlHttp.onreadystatechange = procesarEvento;
	xmlHttp.open('PUT', 'personaJSONPUT', true); //primer par�metro = protocolo http que se usa; el segundo par�metro la url que se crea; el tercer par�metro indica si es as�ncrono o no true es as�ncrono
	xmlHttp.setRequestHeader('Content-Type', 'application/json'); //en la petici�n acepta este formato, si no pongo nada ser�a cualquiera
	xmlHttp.send(JSON.stringify(persona)); //se hace la llamada, en este caso serializamos la persona a un JSON
	
}

function procesarEvento()
{
   
  if(xmlHttp.readyState==4) //ya hemos recibido respuesta del servidor
  {
      if(xmlHttp.status==200)// y el c�digo de la cabecera http es bueno
          {
    	  	muestraPersona(xmlHttp.responseText);
          }
      else
      {
          alert("Ha ocurrido un error"+ xmlHttp.status +":"+ xmlHttp.statusText);
      }
  }

}

function muestraPersona(texto)
{
	alert("He recibido " + texto);
	var objetoJson = JSON.parse(texto);
	document.getElementById("nombre").value = objetoJson.nombre;
	document.getElementById("edad").value = objetoJson.edad;
	document.getElementById("descripcion").value = objetoJson.descripcion;
	
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Bienvenido</title>
</head>
<body>

	<label for="nombre">Nombre</label><input type = "text" name = "nombre" id="nombre"/>
	<label for="edad">Edad</label><input type = "text" name = "edad" id="edad"/>
	<label for="descripcion">Descripci�n</label><textarea name= "descripcion" rows="3" cols="8" id="descripcion"></textarea>
<input type="button" onclick="llamadaRest();" value="Trae Persona"></input>
</body>
</html>