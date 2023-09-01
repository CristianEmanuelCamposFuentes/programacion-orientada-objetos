package Herencias.Ejercicios.Ejercicio2.Servicios;


public class ElectrodomesticoServices {
    private static final String[] coloresDisponibles = { "blanco", "negro", "rojo", "azul","gris"};
    public static char comprobarConsumoEnergetico(char consumo) {
        if ((consumo >= 'A') && (consumo <= 'F')) {
                return consumo;
        }
        return 'F';
    }

    public static String comprobarColor(String color){
        for (String colorActual : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorActual)){
                return colorActual;
            }
        }
        return "blanco";
    }

}
