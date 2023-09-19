package Excepciones.Ejercicios.Ejercicio1.Actividad;

import Excepciones.Ejercicios.Ejercicio1.Entidades.Persona;
import Excepciones.Ejercicios.Ejercicio1.Servicios.MenorDeEdadException;
import Excepciones.Ejercicios.Ejercicio1.Servicios.PersonaServices;

public class Main {
    public static void main(String[] args) {
        PersonaServices PS = new PersonaServices();
        Persona personaEjemplo = null;

        try {
            boolean mayorDeEdad = PS.esMayorDeEdad(personaEjemplo);
            System.out.println("Es mayor de edad? " + mayorDeEdad);
        } catch (MenorDeEdadException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (NullPointerException ex) {
            throw new NullPointerException("No existe la persona.");
        }
    }
}
