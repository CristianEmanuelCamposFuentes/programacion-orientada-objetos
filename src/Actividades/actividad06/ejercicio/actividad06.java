package Actividades.actividad06.ejercicio;
//
// * 6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//        cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//        métodos:
//         Constructor predeterminado o vacío
//         Constructor con la capacidad máxima y la cantidad actual
//
//         Métodos getters y setters.
//         Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//        máxima.
//         Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//        cuanto quedó la taza.
//         Método vaciarCafetera(): pone la cantidad de café actual en cero.
//         Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//        recibe y se añade a la cafetera la cantidad de café indicada.

import Actividades.actividad06.Entidades.Cafetera;
import Actividades.actividad06.Servicios.CafeteraServicios;

import java.util.Scanner;

public class actividad06 {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");
    // Inicializa instancia de los servicios
        CafeteraServicios servicios = new CafeteraServicios();

        System.out.println("COMIENZO DEL PROGRAMA NESPRESSO:");

        // Ingresar el menu
        menu(servicios);
    }

    public static void menu(CafeteraServicios SV){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");
        boolean opcion = true;
        Cafetera nuevaCafetera = SV.crearCafetera();
        System.out.println(nuevaCafetera);
//      * MENU
        while(opcion){
            System.out.println("=================================");
            System.out.println("====  ==== === MENU === ==== ====");
            System.out.println("1. Crear una cafetera nueva.");
            System.out.println("2. Llenar la cafetera.");
            System.out.println("3. Vaciar la cafetera.");
            System.out.println("4. Agregar granos de cafe.");
            System.out.println("5. Servir una taza.");
            System.out.println("6. Salir.");
            System.out.println("=================================");
            System.out.println("Ingrese una opcion: ");
            int opcionMenu = lector.nextInt();
//      * OPCIONES
            switch (opcionMenu){
                case 1:
                    nuevaCafetera = SV.crearCafetera();
                    System.out.println(nuevaCafetera);
                    break;
                case 2:
                    SV.llenarCafetera(nuevaCafetera);
                    System.out.println(nuevaCafetera);
                    break;
                case 3:
                    SV.vaciarCafetera(nuevaCafetera);
                    System.out.println(nuevaCafetera);
                    break;
                case 4:
                    SV.agregarCafe(nuevaCafetera);
                    System.out.println(nuevaCafetera);
                    break;
                case 5:
                    SV.servirTaza(nuevaCafetera);
                    System.out.println(nuevaCafetera);
                    break;
                case 6:
                    opcion = false;
                    break;
                default:
                    System.out.println("Opcion no válida. Ingrese una opcion correcta.");
                    break;
            }
        }
    }
}
