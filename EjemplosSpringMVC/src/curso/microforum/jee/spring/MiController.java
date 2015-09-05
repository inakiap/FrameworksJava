package curso.microforum.jee.spring;


import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

 
@Controller
public class MiController {
 
	@RequestMapping("/bienvenido")
	public ModelAndView holaMundo() {
 
		String mensaje = "Vamos a darle caña al Spring";
		return new ModelAndView("bienvenido", "mensaje", mensaje);
	}
	
	@RequestMapping("/micontrol")
	public String primeraPrueba (@RequestParam(value="name", required=false, defaultValue="Mundo") String name, Model model){
	        model.addAttribute("name", name);
	        return "salida";
	}
	
	@RequestMapping("/personaction")
	public String formularioPersona (@ModelAttribute Persona persona, Model model){
		System.out.println("Edad = "+ persona.getEdad());
		System.out.println("Nombre = "+ persona.getNombre());
		System.out.println("Descripción = " + persona.getDescripcion());
		
		model.addAttribute("p", persona);
		
		return "datospersona";
	}
}