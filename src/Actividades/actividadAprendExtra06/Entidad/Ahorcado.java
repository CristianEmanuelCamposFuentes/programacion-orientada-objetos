package Actividades.actividadAprendExtra06.Entidad;

import java.util.Arrays;

public class Ahorcado {
	private String[] palabraBuscada;
	private int letrasEncontradas;
	private int cantJugadasMax;

	public Ahorcado() {
	}

	public Ahorcado(String[] palabraBuscada, int letrasEncontradas, int cantJugadasMax) {
		this.palabraBuscada = palabraBuscada;
		this.letrasEncontradas = letrasEncontradas;
		this.cantJugadasMax = cantJugadasMax;
	}

	public String[] getPalabraBuscada() {
		return palabraBuscada;
	}

	public void setPalabraBuscada(String[] palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}

	public int getLetrasEncontradas() {
		return letrasEncontradas;
	}

	public void setLetrasEncontradas(int letrasEncontradas) {
		this.letrasEncontradas = letrasEncontradas;
	}

	public int getCantJugadasMax() {
		return cantJugadasMax;
	}

	public void setCantJugadasMax(int cantJugadasMax) {
		this.cantJugadasMax = cantJugadasMax;
	}

	@Override
	public String toString() {
		return "Ahorcado{" +
				"palabraBuscada=" + Arrays.toString(palabraBuscada) +
				", letrasEncontradas=" + letrasEncontradas +
				", cantJugadasMax=" + cantJugadasMax +
				'}';
	}
}
