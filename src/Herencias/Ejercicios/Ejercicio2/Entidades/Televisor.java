package Herencias.Ejercicios.Ejercicio2.Entidades;

import Herencias.Ejercicios.Ejercicio2.Servicios.ElectrodomesticoServices;

public class Televisor extends Electrodomestico{
    private int resolucion; // Resolución en pulgadas
    private boolean sintonizadorTDT;

    public Televisor() {
        super(); // Llama al constructor de la superclase para inicializar los atributos heredados
        this.resolucion = 32; // Valor predeterminado de resolución
        this.sintonizadorTDT = false; // Valor predeterminado de sintonizador TDT
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal() {
        // Obtener el precio base llamando al método de la superclase
        double precioBase = ElectrodomesticoServices.calcularPrecioFinal(this);

        // Aplicar aumento de precio según las condiciones específicas de Televisor
        if (resolucion > 40) {
            precioBase *= 1.3; // Aumentar el precio en un 30%
        }
        if (sintonizadorTDT) {
            precioBase += 500;
        }

        return precioBase;
    }
}
