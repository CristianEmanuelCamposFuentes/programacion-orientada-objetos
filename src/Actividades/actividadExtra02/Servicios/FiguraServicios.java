package Actividades.actividadExtra02.Servicios;

import Actividades.actividadExtra02.Entidad.Figura;

import java.util.Scanner;

public class FiguraServicios {
	Scanner scanner = new Scanner(System.in);
	public Figura crearFigura(String figura) {

		switch (figura){
			case "cuadrado":
                return crearCuadrado(); // FIGURA{3,3,0}
            case "rectangulo":
                return crearRectangulo();
            case "triangulo":
                return crearTriangulo();
            case "circulo":
                return crearCirculo();
            case "hexagono":
                return crearHexagono();
			case "pentagono":
				return crearPentagono();
			case "rombo":
				return crearRombo();
            default:
				return new Figura();
		}
//		return new Figura();
	}

	public Figura crearCuadrado(){
		System.out.println("Ingrese el largo de cada lado:");
		int lado = scanner.nextInt();
		double area = lado * lado;
		double perimetro = 4 * lado;
		System.out.println("El area del rectángulo es: " + area);
		System.out.println("El permetro del rectángulo es: " + perimetro);

		return new Figura(lado,lado, 0);
	}

	public Figura crearRectangulo() {
		System.out.println("Ingrese la base del rectángulo:");
		int base = scanner.nextInt();
		System.out.println("Ingrese la altura del rectángulo:");
		int altura = scanner.nextInt();
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		System.out.println("El area del rectángulo es: " + area);
		System.out.println("El permetro del rectángulo es: " + perimetro);
		return new Figura(base, altura, 0.0);
	}

	public Figura crearTriangulo() {
		System.out.println("Ingrese la base del triángulo:");
		int base = scanner.nextInt();
		System.out.println("Ingrese la altura del triángulo:");
		int altura = scanner.nextInt();
		double area = (base * altura) / 2.0;

		System.out.println("Ingrese el lado 1 del triángulo:");
		int lado1 = scanner.nextInt();
		System.out.println("Ingrese el lado 2 del triángulo:");
		int lado2 = scanner.nextInt();
		double perimetro = base + lado1 + lado2;
		System.out.println("El área del triángulo es: " + area);
		System.out.println("El perimetro del triángulo es: " + perimetro);
		return new Figura(base, altura, 0.0);
	}

	public Figura crearCirculo() {
		System.out.println("Ingrese el radio del círculo:");
		double radio = scanner.nextDouble();
		double area = Math.PI * radio * radio;
		double perimetro = 2 * Math.PI * radio;
		System.out.println("El área del círculo es: " + area);
		System.out.println("El perímetro del círculo es: " + perimetro);
		return new Figura(0, 0, radio);
	}

	public Figura crearHexagono() {
		System.out.println("Ingrese el lado del hexágono:");
		int lado = scanner.nextInt();
		double area = (3 * Math.sqrt(3) * lado * lado) / 2.0;
		double perimetro = 6 * lado;
		System.out.println("El área del hexágono es: " + area);
		System.out.println("El perímetro del hexágono es: " + perimetro);
		return new Figura(lado, 0, 0.0);
	}

	public Figura crearPentagono() {
		System.out.println("Ingrese el lado del pentágono:");
		int lado = scanner.nextInt();
		double apotema = lado / (2 * Math.tan(Math.toRadians(36)));
		double area = (5 * lado * apotema) / 2.0;
		double perimetro = 5 * lado;
		System.out.println("El área del pentágono es: " + area);
		System.out.println("El perímetro del pentágono es: " + perimetro);
		return new Figura(lado, 0, 0.0);
	}

	public Figura crearRombo() {
		System.out.println("Ingrese el lado 1 del rombo:");
		int lado1 = scanner.nextInt();
		System.out.println("Ingrese el lado 2 del rombo:");
		int lado2 = scanner.nextInt();
		System.out.println("Ingrese el lado 3 del rombo:");
		int lado3 = scanner.nextInt();
		System.out.println("Ingrese el lado 4 del rombo:");
		int lado4 = scanner.nextInt();
		double perimetro = lado1 + lado2 + lado3 + lado4;


		System.out.println("Ingrese la diagonal mayor del rombo:");
		int diagonalMayor = scanner.nextInt();
		System.out.println("Ingrese la diagonal menor del rombo:");
		int diagonalMenor = scanner.nextInt();
		double area = (diagonalMayor * diagonalMenor) / 2.0;

		System.out.println("El área del rombo es: " + area);
		System.out.println("El perímetro del rombo es: " + perimetro);
		return new Figura(0, 0, 0.0);
	}
}
