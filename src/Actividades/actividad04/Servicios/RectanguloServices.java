package Actividades.actividad04.Servicios;

import Actividades.actividad04.Entidades.Rectangulo;

import java.util.Scanner;

public class RectanguloServices {
	public Rectangulo crearRectangulo(){
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese la base:");
		int base = lector.nextInt();

        System.out.println("Ingrese la altura:");
		int altura = lector.nextInt();

        return new Rectangulo(base, altura);
	}

	public double calcularSuperficie(Rectangulo rectangulo){
		return rectangulo.getBase()*rectangulo.getAltura();
	}

	public double calcularPerimetro(Rectangulo rectangulo){
        return (rectangulo.getBase()+rectangulo.getAltura()) * 2;
    }

	public void dibujarRectangulo(Rectangulo rectangulo){
		int base = rectangulo.getBase();
		int altura = rectangulo.getAltura();

//		StringBuilder dibujo = new StringBuilder();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (i == 0 || j == 0 || i == altura - 1 || j == base -1 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
//				dibujo.append("|*|");
			}
			System.out.print("\n");
//			dibujo.append("\n");
		}

//		return dibujo.toString();
	}
}
