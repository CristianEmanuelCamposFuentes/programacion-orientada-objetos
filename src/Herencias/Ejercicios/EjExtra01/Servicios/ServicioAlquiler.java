package Herencias.Ejercicios.EjExtra01.Servicios;

import Herencias.Ejercicios.EjExtra01.Entidades.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static Herencias.Ejercicios.EjExtra01.Actividad.Main.scanner;

public class ServicioAlquiler {

    // Crear un formateador para el formato "día-mes-anio"
    public static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static void alquilarBarcoMotor() {

        // Solicitar al usuario que ingrese detalles del cliente y el alquiler.
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el documento del cliente:");
        int documentoCliente = scanner.nextInt();

        System.out.println("Ingrese la fecha de alquiler (dd-MM-aaaa):");
        String fechaInput = scanner.next();

        // Parsear la fecha ingresada al formato LocalDate
        LocalDate fechaAlquiler = LocalDate.parse(fechaInput, formato);

        System.out.println("Ingrese la fecha de devolución (dd-MM-aaaa):");
        String fechaDev = scanner.next();

        // Parsear la fecha ingresada
        LocalDate fechaDevolucion = LocalDate.parse(fechaDev, formato);

        System.out.println("Ingrese la posición del amarre:");
        int posicionAmarre = scanner.nextInt();

        System.out.println("Ingrese la potencia del motor en CV:");
        double potenciaCv = scanner.nextDouble();

        // Crear una instancia de BarcoMotor con los datos ingresados.
        Barco barco = new BarcoMotor(1,4 , 2001, potenciaCv);

        // Crear una instancia de Alquiler con los datos del cliente y el barco alquilado.
        Alquiler alquiler = new Alquiler(nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);

        // Calcular el precio del alquiler e imprimirlo.
        double precioAlquiler = alquiler.calcularAlquiler();
        System.out.println("El precio del alquiler es: $" + precioAlquiler);
    }

    public static void alquilarVelero() {

        // Solicitar al usuario que ingrese detalles del cliente y el alquiler.
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el documento del cliente:");
        int documentoCliente = scanner.nextInt();

        System.out.println("Ingrese la fecha de alquiler (dd-mm-aaaa):");
        LocalDate fechaAlquiler = LocalDate.parse(scanner.next(), formato);

        System.out.println("Ingrese la fecha de devolución (dd-mm-aaaa):");
        LocalDate fechaDevolucion = LocalDate.parse(scanner.next(), formato);

        System.out.println("Ingrese la posición del amarre:");
        int posicionAmarre = scanner.nextInt();

        System.out.println("Ingrese el número de mástiles:");
        int numeroMastiles = scanner.nextInt();

        // Crear una instancia de Velero con los datos ingresados.
        Barco barco = new Velero(1, 3, 1992, numeroMastiles);

        // Crear una instancia de Alquiler con los datos del cliente y el barco alquilado.
        Alquiler alquiler = new Alquiler(nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);

        // Calcular el precio del alquiler e imprimirlo.
        double precioAlquiler = alquiler.calcularAlquiler();
        System.out.println("El precio del alquiler es: $" + precioAlquiler);
    }

    public static void alquilarYateLujo() {

        // Solicitar al usuario que ingrese detalles del cliente y el alquiler.
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el documento del cliente:");
        int documentoCliente = scanner.nextInt();

        System.out.println("Ingrese la fecha de alquiler (AAAA-MM-DD):");
        LocalDate fechaAlquiler = LocalDate.parse(scanner.next(),formato);

        System.out.println("Ingrese la fecha de devolución (AAAA-MM-DD):");
        LocalDate fechaDevolucion = LocalDate.parse(scanner.next(), formato);

        System.out.println("Ingrese la posición del amarre:");
        int posicionAmarre = scanner.nextInt();

        System.out.println("Ingrese la potencia del motor en CV:");
        double potenciaCv = scanner.nextDouble();

        System.out.println("Ingrese el número de camarotes:");
        int camarotes = scanner.nextInt();

        // Crear una instancia de YateLujo con los datos ingresados.
        Barco barco = new YateLujo(1, 7, 2019, camarotes, potenciaCv);

        // Crear una instancia de Alquiler con los datos del cliente y el barco alquilado.
        Alquiler alquiler = new Alquiler(nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);

        // Calcular el precio del alquiler e imprimirlo.
        double precioAlquiler = alquiler.calcularAlquiler();
        System.out.println("El precio del alquiler es: $" + precioAlquiler);
    }
}
