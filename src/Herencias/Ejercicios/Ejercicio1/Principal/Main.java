package Herencias.Ejercicios.Ejercicio1.Principal;

import Herencias.Ejercicios.Ejercicio1.Entidades.Animal;
import Herencias.Ejercicios.Ejercicio1.Entidades.Caballo;
import Herencias.Ejercicios.Ejercicio1.Entidades.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del programa: ");
        // Declaracion del objeto Perro
        Animal perro1 = new Perro("Stitch", "Carne", 15, "Doberman");
        perro1.alimentarse();

        // Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        // Declaracion del objeto Gato
        Animal gato1 = new Animal("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();

        // Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

        System.out.println("Fin del programa. ");
    }
}
