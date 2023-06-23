package Actividades.actividad06.Servicios;

import Actividades.actividad06.Entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicios {
    Scanner lector = new Scanner(System.in);
    public Cafetera crearCafetera(){

        System.out.println("Ingrese la capacidad maxima de la cafetera");
        int capMaxima = lector.nextInt();

        // Se ingresa 0 porque se da por hecho cuando se crea la cafetera empieza vacia.
        return new Cafetera(0,capMaxima);

    }

    public void llenarCafetera(Cafetera cafeteraUsada){
        System.out.println("Llenando cafetera:");
        cafeteraUsada.setCantidadActual(cafeteraUsada.getCapacidadMaxima());
        System.out.println("Cafetera llenada correctamente.");
    }

    public int servirTaza(int tamanioTaza, Cafetera cafeteraUsada){
        if(cafeteraUsada.getCantidadActual() == 0){
            System.out.println("La cafetera esta vacia. Por favor, vuelva a llenarla.");
            System.out.println("No se pudo llenar la taza.");
            return 0;
        } else if(tamanioTaza > cafeteraUsada.getCapacidadMaxima()){
            System.out.println("El tamaño de la taza no puede ser mayor al tamaño de la cafetera");
            return 0;
        } else {
            cafeteraUsada.setCantidadActual(cafeteraUsada.getCapacidadMaxima()-tamanioTaza);
            System.out.println("Taza servida completamente.");
            System.out.println("Cantidad de agua en la cafetera actual: "+ cafeteraUsada.getCantidadActual()+ ".");
            return 1;
        }
    }
}
