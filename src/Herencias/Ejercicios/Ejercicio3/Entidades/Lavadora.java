package Herencias.Ejercicios.Ejercicio3.Entidades;

import Herencias.Ejercicios.Ejercicio3.Servicios.ElectrodomesticoServicios;

public class Lavadora extends Electrodomestico implements ElectrodomesticoServicios {
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

    @Override
    public double precioFinal() {
        double precioBase = calcularPrecioFinal(this);

        // Aplicar aumento de precio si la carga es mayor a 30kg
        if (carga > 30) {
            precioBase += 50;
        }
        return precioBase;
    }

    @Override
    public void llenarElectrodomestico(Electrodomestico electrodomestico) {
        // Implementa el llenado de atributos específicos de Lavadora
    }

    @Override
    public double calcularPrecioFinal(Electrodomestico electrodomestico) {
        // Implementa el cálculo del precio final específico de Lavadora
        return 0.0;
    }
}
