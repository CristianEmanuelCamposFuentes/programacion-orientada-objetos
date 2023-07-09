package Actividades.actividadAprendExtra03.ejercicio;

import Actividades.actividadAprendExtra03.Entidad.Raices;
import Actividades.actividadAprendExtra03.Servicios.RaicesServices;

import java.util.Scanner;

//3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//        ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//        Hay que insertar estos 3 valores para construir el objeto a través de un método
//        constructor. Luego, las operaciones que se podrán realizar son las siguientes:
//         Método getDiscriminante(): devuelve el valor del discriminante (double). El
//        discriminante tiene la siguiente formula: (b^2)-4*a*c
//         Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//        que esto ocurra, el discriminante debe ser mayor o igual que 0.
//         Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//        que esto ocurra, el discriminante debe ser igual que 0.
//         Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//        posibles soluciones.
//         Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//        Es en el caso en que se tenga una única solución posible.
//         Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//        de no existir solución, se mostrará un mensaje.
//
//        Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//        delante de -b
public class actividadAprendExtra03 {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Iniciando el programa...");

		// Instancia de los Servicios para acceder a los metodos
		RaicesServices RS = new RaicesServices();

		// Primero vamos a pedir los valores para despues crear el objeto Raices
		System.out.println("Ingrese el valor de A:");
		int valorA = lector.nextInt();

		System.out.println("Ingrese el valor de B:");
		int valorB = lector.nextInt();

		System.out.println("Ingrese el valor de C:");
		int valorC = lector.nextInt();

		// Instancia del nuevo objeto de tipo Raices para analizar con los puntos dados
		Raices nuevaEcuacion = new Raices(valorA, valorB, valorC);
		System.out.println(nuevaEcuacion);
		System.out.println("================================================");
		System.out.println("============ INICIO DE PROCESOS ================");

		// Calcular
		RS.calcular(nuevaEcuacion);

	}
}
