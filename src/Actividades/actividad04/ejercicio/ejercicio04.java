package Actividades.actividad04.ejercicio;

/* * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
		base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
		con los datos del Rectángulo dados por el usuario. También incluirá un método para
		calcular la superficie del rectángulo y un método para calcular el perímetro del
		rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
		asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
		setters y constructores correspondientes.
		Superficie = base * altura / Perímetro = (base + altura) * 2.*/

import Actividades.actividad04.Entidades.Rectangulo;
import Actividades.actividad04.Servicios.RectanguloServices;

public class ejercicio04 {
	public static void main(String[] args) {
        // Instancia de servicios
		RectanguloServices SV = new RectanguloServices();

        // Crear el rectángulo
		Rectangulo rectangulo = SV.crearRectangulo();

        // Calcular la superficie del rectángulo
		double superficie = SV.calcularSuperficie(rectangulo);
		System.out.println("Superficie: " + superficie);

		// Calcular el perímetro del rectángulo
		double perimetro = SV.calcularPerimetro(rectangulo);
        System.out.println("Perímetro: " + perimetro);

        // Dibujar el rectángulo
//        String dibujar = SV.dibujarRectangulo(rectangulo);
//        System.out.println(dibujar);
		SV.dibujarRectangulo(rectangulo);
    }
}
