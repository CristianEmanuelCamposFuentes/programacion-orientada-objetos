package Actividades.actividadExtra02.ejercicio;

/*  Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
		Cuadrado
		Rectángulo
		Triangulo
		Circulo
		Hexágono
		Pentágono
		Rombo

		El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
		mostrar por pantalla el área y el perímetro.
		Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
		para luego mostrar en pantalla.*/


import Actividades.actividadExtra02.Servicios.FiguraServicios;

import java.util.Scanner;

public class actividadExtra02 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		// Inicializar servicios
		FiguraServicios servicios = newFiguraServicios();


        System.out.println("Ingrese el numero que indica la figura geométrica deseada: ");
		System.out.println("(1). Cuadrado.");
		System.out.println("(2). Rectángulo.");
		System.out.println("(3). Triangulo.");
		System.out.println("(4). Circulo.");
		System.out.println("(5). Hexágono.");
		System.out.println("(6). Pentágono.");
		System.out.println("(7). Rombo.");
		int option = lector.nextInt();
		servicios.validarOpcion(option);


    }
}
