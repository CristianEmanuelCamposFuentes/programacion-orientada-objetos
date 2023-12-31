package Relaciones.Ejercicios.EjercicioExtra2.Entidades;

public class Pelicula {
	private String titulo;
	private double duracion;
	private int edadMinima;
	private String director;

	public Pelicula(String titulo, double duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Película: " + titulo + "\n" +
				"Duración: " + duracion + " minutos\n" +
				"Edad Mínima: " + edadMinima + "+\n" +
				"Director: " + director;
	}
}
