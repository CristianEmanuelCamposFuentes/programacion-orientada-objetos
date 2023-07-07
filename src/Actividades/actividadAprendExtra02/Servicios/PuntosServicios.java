package Actividades.actividadAprendExtra02.Servicios;

import Actividades.actividadAprendExtra02.Entidades.Puntos;

import java.util.Scanner;

public class PuntosServicios {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPuntos(){
        System.out.println("Ingrese punto X1: ");
        double x1 = scanner.nextDouble();

        System.out.println("Ingrese punto X2: ");
        double x2 = scanner.nextDouble();

        System.out.println("Ingrese punto Y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese punto Y2: ");
        double y2 = scanner.nextDouble();


        return new Puntos(x1, y1, x2, y2);
    }

    public double distanciaEntreDosPuntos(Puntos punto){
        double difX = Math.pow(punto.getX2() - punto.getX1(),2);
        double difY = Math.pow(punto.getY2() - punto.getY1(),2);
        double raiz = Math.sqrt(difX + difY);

        return raiz;
    }
}
