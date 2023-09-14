package Herencias.Ejercicios.Ejercicio3.Entidades;

import Herencias.Ejercicios.Ejercicio3.Servicios.ElectrodomesticoServicios;

public class Electrodomestico implements ElectrodomesticoServicios {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        //this.color = ElectrodomesticoServicios.comprobarColor(color);
        //this.consumoEnergetico = ElectrodomesticoServicios.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double precioFinal() {
        // Aquí puedes implementar la lógica para calcular el precio final de un electrodoméstico
        double precioConsumo = 0;
        double precioPeso = 0;

        // Obtener los valores de consumoEnergetico, peso y precio de la instancia de Electrodomestico
        char consumoEnergetico = this.getConsumoEnergetico();
        double peso = this.getPeso();
        double precio = this.getPrecio();

        // Calcular precio basado en el consumo energético
        switch (consumoEnergetico) {
            case 'A':
                precioConsumo = 1000;
                break;
            case 'B':
                precioConsumo = 800;
                break;
            case 'C':
                precioConsumo = 600;
                break;
            case 'D':
                precioConsumo = 500;
                break;
            case 'E':
                precioConsumo = 300;
                break;
            case 'F':
                precioConsumo = 100;
                break;
        }

        // Calcular precio basado en el peso
        if (peso >= 1 && peso <= 19) {
            precioPeso = 100;
        } else if (peso >= 20 && peso <= 49) {
            precioPeso = 500;
        } else if (peso >= 50 && peso <= 79) {
            precioPeso = 800;
        } else if (peso >= 80) {
            precioPeso = 1000;
        }

        // Calcular precio final sumando ambos precios
        return precio + precioConsumo + precioPeso;
    }

    @Override
    public void llenarElectrodomestico(Electrodomestico electrodomestico) {
        // Implementa el llenado de atributos específicos de Electrodomestico
        // No se implementa aquí, ya que no hay atributos específicos en Electrodomestico
    }

    @Override
    public double calcularPrecioFinal(Electrodomestico electrodomestico) {
        // Implementa el cálculo del precio final específico de Electrodomestico
        return 0.0;
    }
}