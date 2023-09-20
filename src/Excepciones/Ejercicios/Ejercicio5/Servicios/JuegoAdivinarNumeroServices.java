package Excepciones.Ejercicios.Ejercicio5.Servicios;

import Excepciones.Ejercicios.Ejercicio5.Entidades.JuegoAdivinarNumero;

import java.util.Random;

public class JuegoAdivinarNumeroServices {
    private int numeroSecreto;
    private int intentos;
    private JuegoAdivinarNumero juego;
    private boolean juegoTerminado;

    public JuegoAdivinarNumeroServices(JuegoAdivinarNumero juego) {
        Random random = new Random();
        numeroSecreto = random.nextInt(500) + 1; // Genera un número aleatorio entre 1 y 500
        intentos = 0;
        this.juego = juego;
        juegoTerminado = false;
    }

    public boolean adivinarNumero(String entradaUsuario) {
        if (juegoTerminado) {
            System.out.println("El juego ha terminado. ¡Gracias por jugar!");
            return true;
        }
        try {
            int numeroUsuario = Integer.parseInt(entradaUsuario);
            intentos++;

            if (numeroUsuario == numeroSecreto) {
                juegoTerminado = true;
                System.out.println("¡Felicidades! " + obtenerNombreJugador() + " has adivinado el número " + numeroSecreto +
                        " en " + intentos + " intentos.");
                return true;

            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número a adivinar es mayor que " + numeroUsuario + ". Intenta de nuevo.");
                return false;
            } else {
                System.out.println("El número a adivinar es menor que " + numeroUsuario + ". Intenta de nuevo.");
                return false;
            }
        } catch (NumberFormatException e) {
            intentos++; // Contar el carácter fallido como un intento
            System.out.println( "Error: Ingresa un número válido. Intento número " + intentos + ".");
            return false;
        }
    }

    private String obtenerNombreJugador() {
        int indiceJugador = (intentos - 1) % juego.getJugadores().size();
        return juego.getJugadores().get(indiceJugador);
    }
}
