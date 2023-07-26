package Colecciones.Videos.Video1.Entidades;

public class Mascota {
	private String nombre;
	private String apodo;
	private String tipo;

	public Mascota() {
	}

	public Mascota(String nombre, String apodo, String tipo) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Mascota{" +
				"nombre='" + nombre + '\'' +
				", apodo='" + apodo + '\'' +
				", tipo='" + tipo + '\'' +
				'}';
	}
}
