package Excepciones.Ejercicios.Ejercicio3.Servicios;

import Excepciones.Ejercicios.Ejercicio3.Entidades.Division;

public class DivisionServices {

    public static double realizarDivision(Division numeros) {
        try {
            double num1 = Integer.parseInt(numeros.getNumero1());
            double num2 = Integer.parseInt(numeros.getNumero2());
            if(num2 == 0) {
                throw new ArithmeticException("Division por cero no esta permitida.");
            }
            return num1 / num2;
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Formato de numero no permitido." + nfe.getMessage());
        }

    }
}
