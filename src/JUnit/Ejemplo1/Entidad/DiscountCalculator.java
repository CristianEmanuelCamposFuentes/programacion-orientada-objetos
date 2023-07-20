package JUnit.Ejemplo1.Entidad;

public class DiscountCalculator {
	private double precio;
	private double descuento;

	public DiscountCalculator() {
	}

	public DiscountCalculator(double precio, double descuento) {
		this.precio = precio;
		this.descuento = descuento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
