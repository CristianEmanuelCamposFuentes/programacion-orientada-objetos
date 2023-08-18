package Relaciones.Ejercicios.EjercicioExtra2.Entidades;

public class Cine {
	private Pelicula peliculaActual;
	private Espectador[][] salaAsientos;
	private double precioEntrada;

	public Cine(Pelicula peliculaActual, int filas, int columnas, double precioEntrada) {
		this.peliculaActual = peliculaActual;
		this.salaAsientos = new Espectador[filas][columnas];
		this.precioEntrada = precioEntrada;
	}

	public boolean asientoOcupado(int fila, int columna) {
		return salaAsientos[fila][columna] != null;
	}

	public boolean ubicarEspectador(Espectador espectador, int fila, int columna) {
		if (espectador.getEdad() >= peliculaActual.getEdadMinima() && espectador.getDineroDisponible() >= precioEntrada) {
			salaAsientos[fila][columna] = espectador;
			return true;
		}
		return false;
	}

	public void mostrarTablaAsientos() {
		for (int fila = 0; fila < salaAsientos.length; fila++) {
			for (int columna = 0; columna < salaAsientos[fila].length; columna++) {
				if (salaAsientos[fila][columna] != null) {
					System.out.print("X ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

	public Espectador[][] getSalaAsientos() {
		return salaAsientos;
	}
}
