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
		boolean continuar = true;
		// Inicializar servicios
		FiguraServicios servicios = new FiguraServicios();

// Menu
		while (continuar) {
			System.out.println("Ingrese el numero que indica la figura geométrica deseada: ");
			System.out.println("(1). Cuadrado.");
			System.out.println("(2). Rectángulo.");
			System.out.println("(3). Triangulo.");
			System.out.println("(4). Circulo.");
			System.out.println("(5). Hexágono.");
			System.out.println("(6). Pentágono.");
			System.out.println("(7). Rombo.");
			System.out.println("(0). Salir.");
			int opcion = lector.nextInt();
//			servicios.validarOpcion(option);
//
//			public void validarOpcion(int opcionElegida){
				switch (opcion){
					case 0:
						continuar = false;
						System.out.println("Saliendo del programa...");
						break;
					case 1:
						System.out.println(servicios.crearFigura("cuadrado")); // fIGURA{3,3,0}
						System.out.println("===================================");
						break;
					case 2:
						System.out.println(servicios.crearFigura("rectangulo"));
						System.out.println("===================================");

						break;
					case 3:
						System.out.println(servicios.crearFigura("triangulo"));
						System.out.println("===================================");

						break;
					case 4:
						System.out.println(servicios.crearFigura("circulo"));
						System.out.println("===================================");

						break;
					case 5:
						System.out.println(servicios.crearFigura("hexagono"));
						System.out.println("===================================");

						break;
					case 6:
						System.out.println(servicios.crearFigura("pentagono"));
						System.out.println("===================================");

                        break;
                    case 7:
						System.out.println(servicios.crearFigura("rombo"));
						System.out.println("===================================");

						break;
					default:
						System.out.println("Opcion incorrecta, intente nuevamente.");
						break;
				}
			}
		}
    }

