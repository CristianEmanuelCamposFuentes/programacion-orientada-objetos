package JUnit.EjemploVideo1.Servicios;

import JUnit.EjemploVideo1.Entidades.Rectangulo;

public class RectanguloServicios {
	public double calcularArea(Rectangulo rectangulo ) {
		return rectangulo.getAncho() * rectangulo.getLargo();
	}

	public double calcularPerimetro(Rectangulo rectangulo){
		return 2 * (rectangulo.getAncho() + rectangulo.getLargo());
	}
}
