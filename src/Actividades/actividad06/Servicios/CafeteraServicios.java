package Actividades.actividad06.Servicios;

import Actividades.actividad06.Entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicios {
    Scanner lector = new Scanner(System.in);
    public Cafetera crearCafetera(){
        System.out.println("=== CREAR CAFETERA NUEVA ===");
        System.out.println("Ingrese la capacidad maxima de la cafetera en ml: ");
        int capMaxima = lector.nextInt();

        // Se ingresa 0 porque se da por hecho cuando se crea la cafetera empieza vacia.
        return new Cafetera(0,capMaxima);

    }

    public void llenarCafetera(Cafetera cafeteraUsada){
        System.out.println("=== LLENAR CAFETERA ===");

        System.out.println("Llenando cafetera:");
        cafeteraUsada.setCantidadActual(cafeteraUsada.getCapacidadMaxima());
        System.out.println("Cafetera llenada correctamente.");
    }

    public void vaciarCafetera(Cafetera cafeteraUsada){
        System.out.println("=== LLENAR CAFETERA ===");
        if((cafeteraUsada.getCantidadActual() == 0) && (cafeteraUsada.getCantidadCafe()== 0)){
            System.out.println("La cafetera ya se encuentra vacia y sin cafe.");
        } else if(cafeteraUsada.getCantidadActual() == 0){
            System.out.println("La cafetera esta vacia. Solo se quitaran los granos de cafe.");
            cafeteraUsada.setCantidadCafe(0);
        } else {
            cafeteraUsada.setCantidadActual(0);
            cafeteraUsada.setCantidadCafe(0);
        }
        System.out.println("Vaciando cafetera:");
        System.out.println("Cafetera vaciada correctamente.");
    }

    public void agregarCafe(Cafetera cafeteraUsada){
        System.out.println("=== AGREGAR CAFE ===");

        cafeteraUsada.setCantidadCafe(10);
        System.out.println("Granos de cafe agregados correctamente.");
    }

    public void servirTaza(Cafetera cafeteraUsada){
        System.out.println("=== SERVIR TAZA ===");

        System.out.println("Ingrese el tamanio de la taza: ");
        int tamanioTaza = lector.nextInt();

        if(cafeteraUsada.getCantidadCafe() == 0){
            System.out.print("La cafetera no posee granos de cafe. Rellenando: ");
            cafeteraUsada.setCantidadCafe(10);
            System.out.println("Granos de cafe repuestos completamente.");
        }

        if(cafeteraUsada.getCantidadActual() == 0){
            System.out.println("La cafetera esta vacia. Por favor, vuelva a llenarla.");

        } else if(tamanioTaza > cafeteraUsada.getCapacidadMaxima()){
            System.out.println("El tamaño de la taza no puede ser mayor al tamaño de la cafetera. Se servira la capacidad posible.");
            // Guardo la cantidad que tenia la Cafetera en ese momento y lo devuelvo
            int cantidadAgua = cafeteraUsada.getCantidadActual();
            cafeteraUsada.setCantidadActual(0);
            // Resto los granos de cafe con cada taza servida
            cafeteraUsada.setCantidadCafe(cafeteraUsada.getCantidadCafe()-5);

        } else {
            // Seteo la nueva cantidad de agua en la cafetera despues de servir
            cafeteraUsada.setCantidadActual(cafeteraUsada.getCantidadActual()-tamanioTaza);

            System.out.println("Taza servida completamente.");
            System.out.println("Cantidad de agua en la cafetera actual: "+ cafeteraUsada.getCantidadActual()+ ".");

            // Resto los granos de cafe con cada taza servida
            cafeteraUsada.setCantidadCafe(cafeteraUsada.getCantidadCafe()-5);
        }
    }
}
