package Relaciones.Ejercicios.DesafioGrupal.Servicios;

import Relaciones.Ejercicios.DesafioGrupal.Entidades.Producto;
import Relaciones.Ejercicios.DesafioGrupal.Entidades.Tienda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Relaciones.Ejercicios.DesafioGrupal.Ejercicio.Main.scanner;

public class TiendaServicios {
    private List<Tienda> tiendas;
    private List<Producto> productos;
    private int ultimoIdProducto = productos.size();

    // Constructor, donde inicializo las listas cuando se crea TS en el main
    public TiendaServicios() {
        this.tiendas = new ArrayList<>();
        this.productos = new ArrayList<>();
        crearTiendas();
        crearProductos();
    }

    public void agregarProductoATienda(int idTienda, int idProducto, int cantidad) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {
                for (int i = 0; i < cantidad; i++) {
                    tienda.getProductos().add(producto);
                }
                System.out.println("Producto agregado a la tienda exitosamente.");
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public Producto encontrarProductoPorId(int idProducto) {
        for (Tienda tienda : tiendas) {
            for (Producto producto : tienda.getProductos()) {
                if (producto.getId() == idProducto) {
                    return producto;
                }
            }
        }
        // Si no se encuentra el producto con el ID dado en ninguna tienda
        return null;
    }

    public Tienda encontrarTiendaPorId(int idTienda) {
            for (Tienda tienda : tiendas) {
                if (tienda.getId() == idTienda) {
                    return tienda;
                }
            }
        // Si no se encuentra la tienda con el ID dado
            return null;
    }

    public void venderProducto(int idTienda, int idProducto, int cantidad) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {
                if (cantidad <= producto.getCantidad()) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Venta realizada exitosamente.");
                } else {
                    System.out.println("No hay suficientes productos en la tienda.");
                }
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }



    public void crearProducto(String nombreProducto, double precioProducto, int cantidadProducto) {
        int nuevoId = obtenerNuevoIdProducto(); // Implementa la lógica para obtener un nuevo ID único
        Producto nuevoProducto = new Producto(nuevoId, nombreProducto, precioProducto, cantidadProducto);

        for (Tienda tienda : tiendas) {
            tienda.getProductos().add(nuevoProducto);
        }
        System.out.println("Producto creado exitosamente.");
    }

    public int obtenerNuevoIdProducto() {
        ultimoIdProducto++;
        return ultimoIdProducto;
    }

    public void mostrarProductos() {
        for (Tienda tienda : tiendas) {
            System.out.println("Productos en la tienda '" + tienda.getNombre() + "':");
            for (Producto producto : tienda.getProductos()) {
                System.out.println(producto);
            }
            System.out.println();
        }
    }

    public void modificarProducto(int idProducto) {
        Producto producto = encontrarProductoPorId(idProducto);
        if (producto != null) {
            System.out.println("Ingrese nuevo nombre del producto: ");
            String nuevoNombre = scanner.next();
            producto.setNombre(nuevoNombre);
            System.out.println("Ingrese nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            producto.setPrecio(nuevoPrecio);
            System.out.println("Ingrese nueva cantidad del producto: ");
            int nuevaCantidad = scanner.nextInt();
            producto.setCantidad(nuevaCantidad);
            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(int idProductoEliminar) {
        boolean productoEliminado = false;

        for (Tienda tienda : tiendas) {
            Iterator<Producto> iter = tienda.getProductos().iterator();
            while (iter.hasNext()) {
                Producto producto = iter.next();
                if (producto.getId() == idProductoEliminar) {
                    iter.remove();
                    productoEliminado = true;
                    break;
                }
            }
        }

        if (productoEliminado) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProductoDeTienda(int idTienda, int idProducto) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Iterator<Producto> iter = tienda.getProductos().iterator();
            while (iter.hasNext()) {
                Producto producto = iter.next();
                if (producto.getId() == idProducto) {
                    iter.remove();
                    System.out.println("Producto eliminado de la tienda exitosamente.");
                    return;
                }
            }
            System.out.println("Producto no encontrado en la tienda.");
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void mostrarStockProductoEnTienda(int idTienda, int idProducto) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto producto = encontrarProductoPorId(idProducto);
            if (producto != null) {
                int cantidadEnTienda = contarProductosEnTienda(tienda, producto);
                System.out.println("Cantidad de " + producto.getNombre() + " en la tienda: " + cantidadEnTienda);
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }




    public void crearProductos() {
        // Crea los productos y los agrega a la lista
        productos.add(new Producto(1, "Lavadora", 299.99, 10));
        productos.add(new Producto(2, "Refrigerador", 499.99, 15));
        productos.add(new Producto(3, "Televisor", 199.99, 20));
        productos.add(new Producto(4, "Microondas", 89.99, 12));
        productos.add(new Producto(5, "Aspiradora", 129.99, 8));
        productos.add(new Producto(6, "Cafetera", 39.99, 25));
        productos.add(new Producto(7, "Licuadora", 49.99, 18));
        productos.add(new Producto(8, "Batidora", 34.99, 14));
        productos.add(new Producto(9, "Plancha de Ropa", 19.99, 30));
        productos.add(new Producto(10, "Tostadora", 24.99, 22));
        productos.add(new Producto(11, "Ventilador", 59.99, 20));
        productos.add(new Producto(12, "Ventilador de Techo", 89.99, 15));
        productos.add(new Producto(13, "Olla Eléctrica", 74.99, 10));
        productos.add(new Producto(14, "Máquina de Pan", 94.99, 8));
        productos.add(new Producto(15, "Freidora de Aire", 79.99, 12));
    }

    public void crearTiendas() {
        // Idem con las tiendas
        Tienda tienda1 = new Tienda(1, "Brasil 123", "Mercado Libre", new ArrayList<>());
        Tienda tienda2 = new Tienda(2, "Nicaragua 277", "Supermercados TOP", new ArrayList<>());
        Tienda tienda3 = new Tienda(3, "Avenida Colón 3001", "CETROGAR", new ArrayList<>());

        tiendas.add(tienda1);
        tiendas.add(tienda2);
        tiendas.add(tienda3);
    }
}





