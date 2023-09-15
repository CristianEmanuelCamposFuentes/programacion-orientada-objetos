package Herencias.Ejercicios.DesafioExtra.Actividad;

import Herencias.Ejercicios.DesafioExtra.entidades.Familia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        List<Familia> familias = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Crear nueva familia");
            System.out.println("2. Mostrar cantidad de personas");
            System.out.println("3. Mostrar distribución por sexo");
            System.out.println("4. Mostrar resumen de problemas de salud");
            System.out.println("5. Mostrar resumen de abordaje nutricional");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    // Crear una nueva familia y agregarla a la lista de familias
                    Familia familia = crearNuevaFamilia();
                    familias.add(familia);
                    break;
                case 2:
                    // Implementa la lógica para mostrar cantidad de personas
                    break;
                case 3:
                    // Implementa la lógica para mostrar distribución por sexo
                    mostrarDistribucionPorSexo(familias);
                    break;
                case 4:
                    // Implementa la lógica para mostrar resumen de problemas de salud
                    mostrarResumenProblemasSalud(familias);
                    break;
                case 5:
                    // Implementa la lógica para mostrar resumen de abordaje nutricional
                    mostrarResumenAbordajeNutricional(familias);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}