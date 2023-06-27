package Actividades.actividad09.ejercicio;

import Actividades.actividad09.Entidades.Matematica;
import Actividades.actividad09.Servicios.MatematicaServices;

// * 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//		los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//		constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//		Math.random para generar los dos números y se guardaran en el objeto con su
//		respectivos set. Deberá además implementar los siguientes métodos:
//
//		a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//		b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//		elevado al menor número. Previamente se deben redondear ambos valores.
//		c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//		Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
public class actividad09 {


	public static void main(String[] args) {
		MatematicaServices MS = new MatematicaServices();

		System.out.println("Comienzo del programa: ");

		Matematica valores = MS.crearNumero();

		int valor1 = (int) (Math.random() * 10);
		System.out.println("Numero aleatorio numero 1: " + valor1);
		valores.setNumero1(valor1);


		int valor2 = (int) (Math.random() * 10);
		System.out.println("Numero aleatorio numero 2: " + valor2);
		valores.setNumero2(valor2);

		System.out.println(MS.devolverMayor(valores));
		System.out.println(MS.calcularPotencia(valores));
		System.out.println(MS.calculaRaiz(valores));
		System.out.println("Fin del programa. ");
    }

}
