package Colecciones.Ejercicios.DesafioColecciones.Entidades;

import java.util.Date;

public class Habitacion {
	private int Numero;
	private Date fechaReserva;
	private int cantidadPersonasDisponible;
	private boolean ocupada = false;

	public Habitacion(){

	}
	public Habitacion(int Numero, Date fechaReserva, int cantidadPersonasDisponible) {
		this.Numero = Numero;
		this.fechaReserva = fechaReserva;
		this.cantidadPersonasDisponible = cantidadPersonasDisponible;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public int getCantidadPersonasDisponible() {
		return cantidadPersonasDisponible;
	}

	public void setCantidadPersonasDisponible(int cantidadPersonasDisponible) {
		this.cantidadPersonasDisponible = cantidadPersonasDisponible;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion{" +
				"Numero=" + Numero +
				", fechaReserva=" + fechaReserva +
				", cantidadPersonasDisponible=" + cantidadPersonasDisponible +
				", ocupada=" + ocupada +
				'}';
	}
}
