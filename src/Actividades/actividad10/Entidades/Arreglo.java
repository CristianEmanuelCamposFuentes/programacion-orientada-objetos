package Actividades.actividad10.Entidades;

import java.util.Arrays;

public class Arreglo {
	private double[] numeros;

	public Arreglo(int tamanio) {
        numeros = new double[tamanio];
    }

	public Arreglo() {
    }

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
        this.numeros = numeros;
    }

	@Override
	public String toString() {
		return "Arreglo{" +
				"numeros=" + Arrays.toString(numeros) +
				'}';
	}
}
