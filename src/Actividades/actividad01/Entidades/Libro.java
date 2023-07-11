package Actividades.actividad01.Entidades;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int cantidadPaginas;

	// Constructor vacio
	public Libro() {
	}

	// Constructor por parametros
	public Libro(int ISBN, String titulo, String autor, int cantidadPaginas) {{
		this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
		}
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
}
