package Actividades.actividad02.Servicios;

import Actividades.actividad02.Entidades.Circunferencia;

public class CircunferenciaServicios {
	public Circunferencia crearCircunferencia(int radioC){
		return new Circunferencia(radioC);
	}

	public double area(int radioC){
		double areaTotal = radioC * Math.PI;
//		System.out.println("El area de la circunferencia es de: " + areaTotal);
		return areaTotal;
	}

	public double perimetro(int radioC){
        double perimetroTotal = 2 * Math.PI * radioC;
//        System.out.println("El perimetro de la circunferencia es de: " + perimetroTotal);
        return perimetroTotal;
    }
}
