package funciones;

import java.io.File;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

public class Persona {
	
	@Size(min=3)
	@NotEmpty
	private String nombre;
	
	@Range (min=18, max=150)
	@NotNull
	private Integer edad;
	
	@NotEmpty
	private String descripcion;
	
	@NotEmpty
	private String dni;
	
	@NotNull
	private MultipartFile foto;
	
	private String photoOriginalName;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public MultipartFile getFoto() {
		return foto;
	}
	public void setFoto(MultipartFile foto) {
		this.foto = foto;
	}
	
	public String getPhotoOriginalName() {
		return photoOriginalName;
	}
	public void setPhotoOriginalName(String photoOriginalName) {
		this.photoOriginalName = photoOriginalName;
	}
	public Persona() {

	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad
				+ ", descripcion=" + descripcion + ", dni=" + dni + ", foto="
				+ foto + "]";
	}
	
}
