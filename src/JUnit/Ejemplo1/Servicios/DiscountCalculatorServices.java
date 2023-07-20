package JUnit.Ejemplo1.Servicios;

import JUnit.Ejemplo1.Entidad.DiscountCalculator;

public class DiscountCalculatorServices {
	public DiscountCalculator crearCalculadora(){
		return new DiscountCalculator();
	}
	public double calcularDescuento(double precio, double porcentajeDescuento) {
		if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
			System.out.println("El porcentaje de descuento debe estar entre 0 y 100.");
		}

		// El precio por
		return precio * (porcentajeDescuento / 100);
	}
}
