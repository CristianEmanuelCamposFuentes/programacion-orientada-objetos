package Actividades.actividadAprendExtra05.Entidad;

public class MesJuego {
	private String[] meses;
	private String mesSecreto;

	// Como ya van a tener valores por defecto, los aplico en el constructor, no hace falta armar el juego pidiendo datos, solo adivinar el mes
	public MesJuego(){
		// Relleno el array con los meses
		meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo"
				, "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

		// Asigno uno de los meses para ganar el juego cuando se acierta
		mesSecreto = meses[9];
	}

	public String getMesSecreto() {
		return mesSecreto;
	}
}
