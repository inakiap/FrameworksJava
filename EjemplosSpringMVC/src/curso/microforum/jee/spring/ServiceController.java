package curso.microforum.jee.spring;

import java.awt.image.RescaleOp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServiceController {
	
	@RequestMapping (path="/personaJSON", produces = "application/json")
	public ResponseEntity<Persona> personaJSON (){
		Persona p = null;
		p = new Persona ("Juan", 44, "Es un cagón");
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}
	
}
