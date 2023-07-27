package Main_actividadextra__colecciones;

import Entidades.Producto;
import Servicios.TiendaServicios;
import java.util.ArrayList;
import java.util.Scanner;

public class ActividadExtra__Colecciones {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Producto> productos = new ArrayList();

    public static void main(String[] args) {

        TiendaServicios ts = new TiendaServicios();

        boolean respuesta = true;

        do {
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto: ");
            producto.setNombreProducto(leer.next());
            System.out.println("Ingrese la categoria del producto: ");
            producto.setCategoria(leer.next());
            System.out.println("Ingrese el precio del producto: ");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese la cantidad del producto: ");
            producto.setCantidad(leer.nextInt());

            productos.add(producto);

            System.out.println("Desea agregar otro producto? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                respuesta = false;

            }
       
        } while (respuesta);
        
        
        respuesta = true;

        do {
            System.out.println("Elige la opción deseada");
            System.out.println("1- Comprar producto");
            System.out.println("2- Reponer producto");
            System.out.println("3- Mostrar productos");
            System.out.println("0- Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto a comprar: ");
                    String productoBuscar = leer.next();

                    Producto productoVenta = ts.buscarProducto(productoBuscar);
                    if (productoVenta != null) {
                        ts.venta(productoVenta);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a reponer: ");
                    productoBuscar = leer.next();

                    Producto productoReponer = ts.buscarProducto(productoBuscar);
                    if (productoReponer != null) {
                        ts.reposicion(productoReponer);
                    }
                    break;
                case 3:
                    System.out.println("La lista de productos es: ");
                    ts.mostrarProductos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    respuesta = false;
                    break;                   
                default:
                    System.out.println("Opción no valida");

            }

        } while (respuesta);


    }
}
