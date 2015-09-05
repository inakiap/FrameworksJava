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
	@ResponseBody //le decimos que la respuesta irá en el body y usamos ResponseEntity<Object> a continuación para enviarlo
	public ResponseEntity<Persona> personaJSONPut(@RequestBody Persona p) {
		//la notación de @RequestBody quiere decir que el parámetro que entra, Persona p, va en el cuerpo

		System.out.println(p.toString());
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}
	

}
