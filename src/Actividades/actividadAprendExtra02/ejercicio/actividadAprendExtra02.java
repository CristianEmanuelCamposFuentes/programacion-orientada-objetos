package Actividades.actividadAprendExtra02.ejercicio;

import Actividades.actividadAprendExtra02.Entidades.Puntos;
import Actividades.actividadAprendExtra02.Servicios.PuntosServicios;

//2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//        atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//        usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//        los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//        que existe entre los dos puntos que existen en la clase Puntos.
public class actividadAprendExtra02 {
    public static void main(String[] args){
        PuntosServicios holis = new PuntosServicios();

        Puntos punto1 = holis.crearPuntos();

        System.out.println(punto1);

        double distancia = holis.distanciaEntreDosPuntos(punto1);
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }



}
