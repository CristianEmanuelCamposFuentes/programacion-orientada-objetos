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
		System.out.println("\n------------------------");
		System.out.println("Tabla de Asientos del Cine");
		System.out.println("------------------------");


		for (int fila = salaAsientos.length - 1; fila >= 0; fila--) {
			for (int columna = 0; columna < salaAsientos[0].length; columna++) {
				if (salaAsientos[fila][columna] != null) {
					System.out.print((fila + 1) + " " + (char) ('A' + columna) + " X | ");
				} else {
					System.out.print((fila + 1) + " " + (char) ('A' + columna) + "   | ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------\n");
	}

	public Espectador[][] getSalaAsientos() {
		return salaAsientos;
	}
}
