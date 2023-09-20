package Excepciones.Ejercicios.Ejercicio5.Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JuegoAdivinarNumero {
    private List<String> jugadores;

    public JuegoAdivinarNumero() {
        // Lista predeterminada de jugadores
        jugadores = new ArrayList<>(Arrays.asList("Jugador1", "Jugador2", "Jugador3"));
    }

    public List<String> getJugadores() {
        return jugadores;
    }
}
