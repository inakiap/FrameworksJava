package curso.microforum.jee.spring;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class RajoyController {
	@RequestMapping("/rajoy")
	public String rajao(HttpServletRequest request, HttpServletResponse response){
		//RequestContextUtils.getLocaleResolver(request).setLocale(request, response, new Locale("es_ve"));
		return "rajoy";
	}

	@RequestMapping("/rajoyi")
	public String rajoDefecto (HttpServletRequest request, HttpServletResponse response){
		
		//Locale es el idioma de nuestro sistema, con esto puedo saber que idioma por defecto tiene mi equipo
		Locale locale = RequestContextUtils.getLocale(request);
		System.out.println(locale);
		
		RequestContextUtils.getLocaleResolver(request).setLocale(request, response, new Locale("es_ve"));
		
		return "rajoyi";
	}
}
