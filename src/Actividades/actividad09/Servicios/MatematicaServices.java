package Actividades.actividad09.Servicios;

import Actividades.actividad09.Entidades.Matematica;

public class MatematicaServices {
	public Matematica crearNumero() {
		System.out.println("Numero creado exitosamente.");
		return new Matematica();
	}

	public String devolverMayor(Matematica matematica) {
		int num1 = (int) matematica.getNumero1();
		int num2 = (int) matematica.getNumero2();
		return "El numero mayor es: " + Math.max(num1, num2);
	}

	public String calcularPotencia(Matematica matematica) {
		double num1 = matematica.getNumero1();
		double num2 = matematica.getNumero2();

		double base = Math.max(num1, num2);
		double exponente = Math.min(num1, num2);

        return "La potencia es: " + (int) Math.pow(base, exponente);
	}

	public String calculaRaiz(Matematica matematica) {
		int num1 = (int) matematica.getNumero1();
		int num2 = (int) matematica.getNumero2();

		int base = Math.abs(Math.min(num1, num2));

		return "La raiz cuadrada del valor menor es: " + Math.sqrt(base);

	}

}
