package Colecciones.Ejercicios.DesafioColecciones.Entidades;

public class Persona {
	private String Nombre;
	private int Edad;
	private double DNI;
	private String Pais;

	public Persona(String nombre, int edad, double DNI, String pais) {
		Nombre = nombre;
		Edad = edad;
		this.DNI = DNI;
		Pais = pais;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public double getDNI() {
		return DNI;
	}

	public void setDNI(double DNI) {
		this.DNI = DNI;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	@Override
	public String toString() {
		return "Persona{" +
				"Nombre='" + Nombre + '\'' +
				", Edad=" + Edad +
				", DNI=" + DNI +
				", Pais='" + Pais + '\'' +
				'}';
	}
}
