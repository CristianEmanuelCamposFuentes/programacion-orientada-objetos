package Relaciones.Ejemplos.Ejemplo1.Entidades;

public class Alumno {
	private String nombre;
	private String apellido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				'}';
	}
}
