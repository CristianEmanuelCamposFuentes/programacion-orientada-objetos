package Actividades.actividad14.ejercicio;

import Actividades.actividad14.Entidades.Movil;
import Actividades.actividad14.Servicios.MovilServices;

/* * 14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
		posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
		almacenar cada producto con su información. Crear una entidad Movil con los atributos
		marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
		un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
		correspondiente al código. A continuación, se implementarán los siguientes métodos:
		 Un constructor por defecto.
		 Un constructor con todos los atributos como parámetro.
		 Métodos getters y setters de cada atributo.
		 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
		instanciar un objeto Celular y poder cargarlo en nuestro programa.
		 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
		números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
public class actividad14 {
	public static void main(String[] args) {
	// Instancia de servicios
		MovilServices MS = new MovilServices();

	// Instancia del celular y al retornar la funcion se invoca sola
	Movil celular = MS.cargarCelular();

	System.out.println("Celular creado correctamente. Datos: ");
	System.out.println(celular);
	}
}
