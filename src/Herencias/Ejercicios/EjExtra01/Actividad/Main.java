package Herencias.Ejercicios.EjExtra01.Actividad;

import Herencias.Ejercicios.EjExtra01.Servicios.ServicioAlquiler;

import java.util.Scanner;

/*
* 1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
* */
public class Main {
    public static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ServicioAlquiler SA = new ServicioAlquiler();
        System.out.println("Inicio del programa:");

        while (true) {
            System.out.println("Menú de Alquiler de Barcos");
            System.out.println("1. Alquilar Barco a Motor");
            System.out.println("2. Alquilar Velero");
            System.out.println("3. Alquilar Yate de Lujo");
            System.out.println("4. Agregar Nuevo Barco");
            System.out.println("5. Mostrar Lista de Botes Disponibles");
            System.out.println("6. Actualizar Información de Barco");
            System.out.println("7. Eliminar Barco de la Lista");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    SA.alquilarBarcoMotor();
                    break;
                case 2:
                    SA.alquilarVelero();
                    break;
                case 3:
                    SA.alquilarYateLujo();
                    break;
                case 4:
                    SA.agregarBarco();
                    break;
                case 5:
                    SA.mostrarBotes();
                    break;
                case 6:
                    SA.actualizarBarco();
                    break;
                case 7:
                    SA.eliminarBarco();
                    break;
                case 8:
                    System.out.println("Gracias por utilizar nuestro servicio de alquiler.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
}
