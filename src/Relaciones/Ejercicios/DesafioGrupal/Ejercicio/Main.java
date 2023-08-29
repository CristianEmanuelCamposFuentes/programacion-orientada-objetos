package Relaciones.Ejercicios.DesafioGrupal.Ejercicio;

import Relaciones.Ejercicios.DesafioGrupal.Servicios.TiendaServicios;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        TiendaServicios TS = new TiendaServicios();

        int choice;

        do {
            System.out.println("========== Menú ==========");
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
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de productos: ");
                    int cantidadProducto = scanner.nextInt();

                    TS.crearProducto(nombreProducto, precioProducto, cantidadProducto);
                    break;
                case 2:
                    // Mostrar Productos
                    TS.mostrarProductos();
                    break;
                case 3:
                    // Modificar Producto
                    TS.mostrarProductos();
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idProductoModificar = scanner.nextInt();

                    TS.modificarProducto(idProductoModificar);
                    break;
                case 4:
                    // Eliminar Producto
                    TS.mostrarProductos();
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idProductoEliminar = scanner.nextInt();
                    TS.eliminarProducto(idProductoEliminar);
                    break;
                case 5:
                    // Crear Tienda
                    System.out.print("Ingrese el nombre de la tienda: ");
                    String nombreTienda = scanner.next();
                    System.out.print("Ingrese la dirección de la tienda: ");
                    String direccionTienda = scanner.next();

                    TS.crearTienda(nombreTienda, direccionTienda);
                    break;
                case 6:
                    // Mostrar Tiendas
                    TS.mostrarTiendas();
                    break;
                case 7:
                    // Modificar Tienda
                    System.out.print("Ingrese el ID de la tienda que desea modificar: ");
                    int idTiendaModificar = scanner.nextInt();

                    System.out.print("Ingrese la nueva dirección de la tienda: ");
                    String nuevaDireccion = scanner.next();

                    System.out.print("Ingrese el nuevo nombre de la tienda: ");
                    String nuevoNombre = scanner.next();

                    TS.modificarTienda(idTiendaModificar, nuevaDireccion, nuevoNombre);
                    break;
                case 8:
                    // Eliminar Tienda
                    System.out.print("Ingrese el ID de la tienda que desea eliminar: ");
                    int idTiendaEliminar = scanner.nextInt();

                    TS.eliminarTienda(idTiendaEliminar);
                    break;
                case 9:
                    // Agregar Producto a Tienda
                    System.out.print("Ingrese el ID de la tienda: ");
                    int idTiendaAgregar = scanner.nextInt();
                    System.out.print("Ingrese el ID del producto: ");
                    int idProductoAgregar = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a agregar: ");
                    int cantidadAgregar = scanner.nextInt();

                    TS.agregarProductoATienda(idTiendaAgregar, idProductoAgregar, cantidadAgregar);
                    break;
                case 10:
                    // Vender Producto
                    System.out.print("Ingrese el ID de la tienda: ");
                    int idTiendaVender = scanner.nextInt();
                    System.out.print("Ingrese el ID del producto a vender: ");
                    int idProductoVender = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVender = scanner.nextInt();

                    TS.venderProducto(idTiendaVender, idProductoVender, cantidadVender);
                    break;
                case 11:
                    // Eliminar Producto de Tienda
                    System.out.print("Ingrese el ID de la tienda: ");
                    int idTiendaBuscada = scanner.nextInt();
                    System.out.print("Ingrese el ID del producto a eliminar de la tienda: ");
                    int idProductoAEliminar = scanner.nextInt();

                    TS.eliminarProductoDeTienda(idTiendaBuscada, idProductoAEliminar);
                    break;
                case 12:
                    // Stock de Producto en Tienda
                    System.out.print("Ingrese el ID de la tienda: ");
                    int idTiendaStock = scanner.nextInt();
                    System.out.print("Ingrese el ID del producto: ");
                    int idProductoStock = scanner.nextInt();

                    TS.mostrarStockProductoEnTienda(idTiendaStock, idProductoStock);
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

