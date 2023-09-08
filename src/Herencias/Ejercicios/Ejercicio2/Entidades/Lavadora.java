package Herencias.Ejercicios.Ejercicio2.Entidades;


import Herencias.Ejercicios.Ejercicio2.Servicios.ElectrodomesticoServices;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        super();
        // Carga base
        this.carga = 5;
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public double precioFinal() {
        // Obtener el precio base llamando al método en la superclase (Electrodomestico)
        double precioBase = ElectrodomesticoServices.calcularPrecioFinal(this);

        // Aplicar aumento de precio si la carga es mayor a 30kg
        if(carga > 30) {
            precioBase += 50;
        }
        return precioBase;
    }
}
