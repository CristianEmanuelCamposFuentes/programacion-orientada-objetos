
package Colecciones.Ejercicios.ActividadExtra1.Entidades;


public class Producto {
    private String nombreProducto;
    private String categoria;
    private double precio;
    private int cantidad;
    
    //---------------------------- Constructores ------------

    public Producto() {
    }

    public Producto(String nombreProducto, String categoria, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }
   
     //-------------------------- Getters y Setters --------------------------//

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", categoria=" + categoria + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    
}
