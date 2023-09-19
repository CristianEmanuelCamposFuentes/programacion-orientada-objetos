package Excepciones.Ejercicios.Ejercicio1.Actividad;

import Excepciones.Ejercicios.Ejercicio1.Entidades.Persona;
import Excepciones.Ejercicios.Ejercicio1.Servicios.MenorDeEdadException;
import Excepciones.Ejercicios.Ejercicio1.Servicios.PersonaServices;

/*
* Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
* */

public class Main {
    public static void main(String[] args) {
        PersonaServices PS = new PersonaServices();
        Persona personaEjemplo = null;

        try {
            personaEjemplo = new Persona(11);
            boolean mayorDeEdad = PS.esMayorDeEdad(personaEjemplo);
            System.out.println("Es mayor de edad? " + mayorDeEdad);
        } catch (MenorDeEdadException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (NullPointerException ex) {
            throw new NullPointerException("No existe la persona.");
        }
    }
}
