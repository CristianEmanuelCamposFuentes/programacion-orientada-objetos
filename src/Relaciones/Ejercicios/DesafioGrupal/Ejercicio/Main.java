package Relaciones.Ejercicios.DesafioGrupal.Ejercicio;

import Relaciones.Ejercicios.DesafioGrupal.Servicios.TiendaServicios;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        TiendaServicios TS = new TiendaServicios();

        int choice;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Crear Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Modificar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Crear Tienda");
            System.out.println("6. Mostrar Tiendas");
            System.out.println("7. Modificar Tienda");
            System.out.println("8. Eliminar Tienda");
            System.out.println("9. Agregar Producto a Tienda");
            System.out.println("10. Vender Producto");
            System.out.println("11. Eliminar Producto de Tienda");
            System.out.println("12. Stock de Producto en Tienda");
            System.out.println("13. Salir");
            System.out.print("Ingrese su opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Crear Producto
                    // ... Código para crear producto ...
                    break;
                case 2:
                    // Mostrar Productos
                    // ... Código para mostrar productos ...
                    break;
                case 3:
                    // Modificar Producto
                    // ... Código para modificar producto ...
                    break;
                case 4:
                    // Eliminar Producto
                    // ... Código para eliminar producto ...
                    break;
                case 5:
                    // Crear Tienda
                    // ... Código para crear tienda ...
                    break;
                case 6:
                    // Mostrar Tiendas
                    // ... Código para mostrar tiendas ...
                    break;
                case 7:
                    // Modificar Tienda
                    // ... Código para modificar tienda ...
                    break;
                case 8:
                    // Eliminar Tienda
                    // ... Código para eliminar tienda ...
                    break;
                case 9:
                    // Agregar Producto a Tienda
                    // ... Código para agregar producto a tienda ...
                    break;
                case 10:
                    // Vender Producto
                    // ... Código para vender producto ...
                    break;
                case 11:
                    // Eliminar Producto de Tienda
                    // ... Código para eliminar producto de tienda ...
                    break;
                case 12:
                    // Stock de Producto en Tienda
                    // ... Código para mostrar stock de producto en tienda ...
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (choice != 13);
        System.out.println("Fin del programa.");
    }

}

