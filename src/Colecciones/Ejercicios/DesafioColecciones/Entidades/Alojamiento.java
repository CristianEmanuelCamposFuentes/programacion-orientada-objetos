package Colecciones.Ejercicios.DesafioColecciones.Entidades;

public class Alojamiento {
	private boolean reservaOcupada;
	private int IDReserva;

	public Alojamiento(int IDReserva) {
		this.reservaOcupada = false;
		this.IDReserva = IDReserva;
	}

	public boolean isReservaOcupada() {
		return reservaOcupada;
	}

	public void setReservaOcupada(boolean reservaOcupada) {
		this.reservaOcupada = reservaOcupada;
	}

	public int getIDReserva() {
		return IDReserva;
	}

	public void setIDReserva(int IDReserva) {
		this.IDReserva = IDReserva;
	}

	@Override
	public String toString() {
		return "Alojamiento{" +
				"reservaOcupada=" + reservaOcupada +
				", IDReserva=" + IDReserva +
				'}';
	}
}
