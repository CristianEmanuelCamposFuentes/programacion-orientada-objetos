package Actividades.actividad06.Servicios;

import Actividades.actividad06.Entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicios {
    public Cafetera crearCafetera(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        int capMaxima = lector.nextInt();

        // Se ingresa 0 porque se da por hecho cuando se crea la cafetera empieza vacia.
        return new Cafetera(0,capMaxima);

    }
}
