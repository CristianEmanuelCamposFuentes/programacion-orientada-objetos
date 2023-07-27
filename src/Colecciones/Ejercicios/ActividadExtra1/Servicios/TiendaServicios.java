
package Servicios;

import Entidades.Producto;
import static Main_actividadextra__colecciones.ActividadExtra__Colecciones.leer;
import static Main_actividadextra__colecciones.ActividadExtra__Colecciones.productos;
import java.util.ArrayList;
import java.util.Iterator;


public class TiendaServicios {
    
    
    public Producto buscarProducto( String productoBuscar  ){
  
        for (Producto productoAux : productos) {
            if(productoAux.getNombreProducto().equalsIgnoreCase(productoBuscar)){
                return productoAux;   
            }
        }
        System.out.println("No se encontró el producto");
        return null; //validar que pasa cuando en el main se duelve este null
   
    }
    
    public boolean venta(Producto productoRecibido){
       //productoRecibido.setCantidad(productoRecibido.getCantidad()-1) 
       int inventario = productoRecibido.getCantidad();
       if(inventario>0){
             productoRecibido.setCantidad(inventario-1);
             System.out.println("La venta fue realizada exitosamente!");
             return true;
       }
       System.out.println("La venta no pudo ser efectuada!");
             return false;
     
 
    }
    
    public void reposicion(Producto productoRecibido){
        productoRecibido.setCantidad(productoRecibido.getCantidad()+1);    
    }
    
    
    public void mostrarProductos(){
        for(Producto producto: productos ){
            System.out.println(producto);
        }
        
    }
    
    
    
    
}
