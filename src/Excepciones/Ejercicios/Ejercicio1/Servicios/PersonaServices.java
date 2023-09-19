package Excepciones.Ejercicios.Ejercicio1.Servicios;

import Excepciones.Ejercicios.Ejercicio1.Entidades.Persona;

public class PersonaServices {
    public boolean esMayorDeEdad(Persona persona) throws MenorDeEdadException {
        if (persona.getEdad() < 18) {
            throw new MenorDeEdadException("La persona es menor de edad.");
        }
        return true;
    }
}
