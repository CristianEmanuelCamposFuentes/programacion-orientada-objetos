package Actividades.actividadAprendExtra01.ejercicio;

import Actividades.actividadAprendExtra01.Entidades.Cancion;
import Actividades.actividadAprendExtra01.Servicios.CancionServices;

//1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//		definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//		vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//		además definir los métodos getters y setters correspondientes.
public class actividadAprendExtra01 {
public static void main(String[] args){
	System.out.println("Inicio del programa: " );
	// Instancia de los servicios
	CancionServices CS = new CancionServices();

	// Creamos el objeto cancion
	Cancion cancionNueva = CS.crearCancion();

	System.out.println(cancionNueva);

	System.out.println("Fin del programa.");
	}
}
