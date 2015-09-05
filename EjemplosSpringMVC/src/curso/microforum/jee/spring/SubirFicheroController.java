package curso.microforum.jee.spring;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SubirFicheroController {
	
	@RequestMapping(value = "/subirUnFicheroSinNombre", method = RequestMethod.POST)
    @ResponseBody
    public String guardarFichero2(@RequestParam("file") MultipartFile file) {
    	String mensaje = null;
 
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
 
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                {
                	dir.mkdirs();
                }
                    
 
                File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
 
                System.out.println(serverFile.getAbsolutePath());
 
                mensaje = "Fichero subido guay =" + file.getOriginalFilename();
            } catch (Exception e) {
            	mensaje = "Se ha liado parda " + file.getOriginalFilename() + " => " + e.getMessage();
            }
        } else {
        	mensaje = "No me traigas ficheros vac�os ga�an";
        }
        return mensaje;
    }
}
