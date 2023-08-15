package Relaciones.Ejercicios.Ejercicio2.Entidades;

public class Jugador {
	private double ID;
	private String nombre;
	private boolean mojado;

	public Jugador(int ID){
		this.ID = ID;
		this.nombre = "Jugador " + ID;
		this.mojado = false;
	}

	public boolean disparo(RevolverDeAgua revolver){

		// Pasa a la siguiente posicion del revolver
		revolver.siguienteChorro();

		// El jugador se apunta y dispara, si se moja, mojado es verdadero
		if(revolver.mojar()){
			mojado = true;
			// Se moja, devuelve true
			return true;
		}
		// Si no se moja, devuelve false
		return false;


	}
}
