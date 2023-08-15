package Relaciones.Ejercicios.Ejercicio1.Entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private double documento;
	private Perro perrito;

	public Persona() {
	}

	public Persona(String nombre, String apellido, int edad, double documento, Perro perrito) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
		this.perrito = perrito;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDocumento() {
		return documento;
	}

	public void setDocumento(double documento) {
		this.documento = documento;
	}

	public Perro getPerrito() {
		return perrito;
	}

	public void setPerrito(Perro perrito) {
		this.perrito = perrito;
	}
}
