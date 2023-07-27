package Colecciones.Ejercicios.Ejercicio2.Entidades;

public class Perro2 {
	private String raza;

	public Perro2() {
	}

	public Perro2(String raza) {
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro{" +
				"raza='" + raza + '\'' +
				'}';
	}
}
