package Actividades.actividadAprendExtra01.Entidades;

public class Cancion {
	private String titulo;
	private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Cancion{" +
				"titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				'}';
	}
}
