function pedirLetra() {
	var dniBox = document.getElementById("dni");
	if (dniBox.value.length == 8) {
		getLetraFromServer(dniBox.value);
	}
}

function getLetraFromServer(dni) {
	xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = procesarRespuesta;
	xmlHttp.open('GET', 'http://172.16.1.209:8090/Spring/calculaLetraDni?dni=' + dni, true);
	xmlHttp.send(null);
}

function procesarRespuesta() {
	var dniBox = document.getElementById("dni");
	var letraDNI = null;
	if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
		letraDNI = xmlHttp.responseText;
		dniBox.value = dniBox.value + letraDNI;
	}
}