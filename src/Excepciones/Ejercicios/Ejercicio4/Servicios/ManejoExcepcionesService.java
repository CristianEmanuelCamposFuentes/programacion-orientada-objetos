package Excepciones.Ejercicios.Ejercicio4.Servicios;

public class ManejoExcepcionesService {
    public static double dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }
}
