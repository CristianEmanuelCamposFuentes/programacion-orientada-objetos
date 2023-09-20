package Excepciones.Ejercicios.Ejercicio5.Actividad;

import Excepciones.Ejercicios.Ejercicio5.Entidades.JuegoAdivinarNumero;
import Excepciones.Ejercicios.Ejercicio5.Servicios.JuegoAdivinarNumeroServices;

import java.util.Scanner;

public class Main {
    public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        // Instancias nuevas del juego y sus servicios para acceder a los metodos
        JuegoAdivinarNumero juego = new JuegoAdivinarNumero();
        JuegoAdivinarNumeroServices JS = new JuegoAdivinarNumeroServices(juego);

        System.out.println("¡Bienvenido al juego de adivinar el número !");
        boolean numeroAdivinado = false;

        while (!numeroAdivinado) {
            System.out.print("Ingresa un número (o escribe 'salir' para finalizar): ");
            String entradaUsuario = lector.nextLine();

            if (entradaUsuario.equalsIgnoreCase("salir")) {
                System.out.println("¡Gracias por jugar!");
                break;
            }

            numeroAdivinado = JS.adivinarNumero(entradaUsuario);

        }
        lector.close();
    }
}
