package Actividades.actividad02.ejercicio;

/*
*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
* */

import Actividades.actividad02.Servicios.CircunferenciaServicios;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
        // Lector
		Scanner lector = new Scanner(System.in);

		System.out.print("Ingrese el radio: ");
		int radio = lector.nextInt();

		// Creamos el servicio para obtener los accesos a los metodos
		CircunferenciaServicios SV = new CircunferenciaServicios();
		// Creamos la circunferencia enviando como parametro
		SV.crearCircunferencia(radio);

		System.out.println("Circunferencia de radio: " + radio + ".");
		double areaCalculada = SV.area(radio);
		double perimetroCalculado = SV.perimetro(radio);
		System.out.println("El área es: " + areaCalculada);
		System.out.println("El perímetro es: " + perimetroCalculado);


    }
}
