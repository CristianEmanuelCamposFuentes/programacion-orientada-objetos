package Herencias.Ejercicios.Ejercicio2.Servicios;

public class ElectrodomesticoServices {
    public char comprobarConsumoEnergetico(char c) {
        if ((c >= 'A') && (c <= 'F')) {
                return c;
        }
        return 'F';
    }
}
