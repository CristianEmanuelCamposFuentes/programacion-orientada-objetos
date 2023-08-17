package Relaciones.Ejercicios.EjercicioExtra1.Entidades;

public class Perro {
	private String nombre;
	private String raza;
	private int edad;
	private String tamanio;
	private boolean adoptado;

	public Perro(){
	}

	public Perro(String nombre, String raza, int edad, String tamanio, boolean adoptado) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamanio = tamanio;
		this.adoptado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public boolean isAdoptado() {
		return adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	@Override
	public String toString() {
		return "Perro{" +
				"nombre: '" + nombre + '\'' +
				", raza: '" + raza + '\'' +
				", edad: " + edad +
				", tamaño: '" + tamanio + '\'' +
				'}';
	}
}
