package Relaciones.Ejercicios.DesafioGrupal.Entidades;

import java.util.List;


public class Tienda {
    private int id;
    private String direccion;
    private String representante;
    private List<Producto> productos;

    public Tienda(int id, String direccion, String representante, List<Producto> productos) {
        this.id = id;
        this.direccion = direccion;
        this.representante = representante;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", representante='" + representante + '\'' +
                ", productos=" + productos +
                '}';
    }
}
