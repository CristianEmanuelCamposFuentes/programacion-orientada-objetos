package Actividades.actividadExtra01.Entidad;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int year;
	private String tipo;

	public Vehiculo() {
	}


	public Vehiculo(String marca, String modelo, int year, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", year=" + year +
				", tipo='" + tipo + '\'' +
				'}';
	}
}
