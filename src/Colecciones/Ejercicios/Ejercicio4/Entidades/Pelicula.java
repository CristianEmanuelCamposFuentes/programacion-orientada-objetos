package Colecciones.Ejercicios.Ejercicio4.Entidades;

public class Pelicula {
	private String titulo;
	private String director;
	private double duracionEnHoras;

	public Pelicula() {
	}

	public Pelicula(String titulo, String director, double duracionEnHoras) {
		this.titulo = titulo;
		this.director = director;
		this.duracionEnHoras = duracionEnHoras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(double duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}

	@Override
	public String toString() {
		return "Pelicula{" + "\n" +
				"titulo='" + titulo + "' " +"\n" +
				"director='" + director + "' " + "\n" +
				"duracionEnHoras=" + duracionEnHoras + "' " +
				'}';
	}
}
