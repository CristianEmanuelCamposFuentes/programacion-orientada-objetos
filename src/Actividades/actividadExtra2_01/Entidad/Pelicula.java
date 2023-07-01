package Actividades.actividadExtra2_01.Entidad;

public class Pelicula {
	private String titulo;
	private String genero;
	private int anio;
	private int duracion;

	private boolean estaAlquilada;

	public Pelicula() {
	}

	public Pelicula(String titulo, String genero, int anio, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
		this.estaAlquilada = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean getEstaAlquilada() {
		return estaAlquilada;
	}

	public void setEstaAlquilada(boolean estaAlquilada) {
		this.estaAlquilada = estaAlquilada;
	}

	@Override
	public String toString() {
		return "Pelicula{" +
				"titulo='" + titulo + '\'' +
				", genero='" + genero + '\'' +
				", anio=" + anio +
				", duracion=" + duracion +
				", estaAlquilada=" + estaAlquilada +
				'}';
	}
}
