package curso.microforum.jee.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MiWsPutController {
	
	
	@RequestMapping(path = "/personaJSONPUT", produces="application/json", method=RequestMethod.PUT, consumes="application/json")
	@ResponseBody //le decimos que la respuesta ir� en el body y usamos ResponseEntity<Object> a continuaci�n para enviarlo
	public ResponseEntity<Persona> personaJSONPut(@RequestBody Persona p) {
		//la notaci�n de @RequestBody quiere decir que el par�metro que entra, Persona p, va en el cuerpo

		System.out.println(p.toString());
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}
	

}
