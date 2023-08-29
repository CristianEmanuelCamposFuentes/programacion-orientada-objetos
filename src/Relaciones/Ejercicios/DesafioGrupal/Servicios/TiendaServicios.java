package Relaciones.Ejercicios.DesafioGrupal.Servicios;

import Relaciones.Ejercicios.DesafioGrupal.Entidades.Producto;
import Relaciones.Ejercicios.DesafioGrupal.Entidades.Tienda;

import java.util.ArrayList;
import java.util.List;

public class TiendaServicios {
    private List<Tienda> tiendas;

    public TiendaServicios() {
        this.tiendas = new ArrayList<>();
        crearTiendas();
        crearProductos();
    }

    private void crearProductos() {
        Producto producto1 = new Producto(1, "Lavadora", 299.99);
        Producto producto2 = new Producto(2, "Refrigerador", 499.99);
        Producto producto3 = new Producto(3, "Televisor", 199.99);
        Producto producto4 = new Producto(4, "Microondas", 89.99);
        Producto producto5 = new Producto(5, "Aspiradora", 129.99);
        Producto producto6 = new Producto(6, "Cafetera", 39.99);
        Producto producto7 = new Producto(7, "Licuadora", 49.99);
        Producto producto8 = new Producto(8, "Batidora", 34.99);
        Producto producto9 = new Producto(9, "Plancha de Ropa", 19.99);
        Producto producto10 = new Producto(10, "Tostadora", 24.99);
        Producto producto11 = new Producto(11, "Ventilador", 59.99);
        Producto producto12 = new Producto(12, "Ventilador de Techo", 89.99);
        Producto producto13 = new Producto(13, "Olla Eléctrica", 74.99);
        Producto producto14 = new Producto(14, "Máquina de Pan", 94.99);
        Producto producto15 = new Producto(15, "Freidora de Aire", 79.99);
    }

    private void crearTiendas() {
        Tienda tienda1 = new Tienda(1, "Dirección 1", "Supermercado A", new ArrayList<>());
        Tienda tienda2 = new Tienda(2, "Dirección 2", "Supermercado B", new ArrayList<>());
        Tienda tienda3 = new Tienda(3, "Dirección 3", "Supermercado C", new ArrayList<>());

        tiendas.add(tienda1);
        tiendas.add(tienda2);
        tiendas.add(tienda3);
    }
}
