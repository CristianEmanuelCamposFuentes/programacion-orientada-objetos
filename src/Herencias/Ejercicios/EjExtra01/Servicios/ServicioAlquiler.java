package Herencias.Ejercicios.EjExtra01.Servicios;

import Herencias.Ejercicios.EjExtra01.Entidades.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static Herencias.Ejercicios.EjExtra01.Actividad.Main.scanner;

public class ServicioAlquiler {
    // Lista de botes
    List<Barco> botesDisponibles;

    // Crear un formateador para el formato "día-mes-anio"
    public static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public ServicioAlquiler() {
        this.botesDisponibles = new ArrayList<>();
        llenarListaBotes();
    }

    public void alquilarBarco() {
        mostrarBotes(); // Muestra la lista de botes disponibles

        // Solicitar al usuario que elija el tipo de barco a alquilar
        System.out.print("Seleccione el tipo de barco (1: Barco a Motor, 2: Velero, 3: Yate de Lujo): ");
        int seleccion = scanner.nextInt();

        if (seleccion >= 1 && seleccion <= 3) {
            // Filtrar los barcos disponibles segun el tipo de barco seleccionado
            List<Barco> barcosFiltrados = new ArrayList<>();
            for (Barco barco : botesDisponibles) {
                // Validaciones del tipo de barco
                if ((seleccion == 1 && barco instanceof BarcoMotor) ||
                        (seleccion == 2 && barco instanceof Velero) ||
                        (seleccion == 3 && barco instanceof YateLujo)) {
                    barcosFiltrados.add(barco);
                }
            }

            if (!barcosFiltrados.isEmpty()) {
                System.out.println("Barcos disponibles de la clase seleccionada: ");
                for (int i = 0; i < barcosFiltrados.size(); i++) {
                    System.out.println((i + 1) + ". " + barcosFiltrados.get(i));
                }

                // Solicitar al usuario que elija un barco
                System.out.print("Seleccione un barco para alquilar (ingrese el número): ");
                int numeroBarco = scanner.nextInt();
                if (numeroBarco >= 1 && numeroBarco <= barcosFiltrados.size()) {
                    Barco barcoElegido = barcosFiltrados.get(numeroBarco - 1);

                    // Solicitar al usuario que ingrese detalles del cliente.
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el documento del cliente:");
                    int documentoCliente = scanner.nextInt();
                    System.out.println("Ingrese la fecha de alquiler (DD-MM-AAAA):");
                    LocalDate fechaAlquiler = LocalDate.parse(scanner.next(), formato);
                    System.out.println("Ingrese la fecha de devolución (DD-MM-AAAA):");
                    LocalDate fechaDevolucion = LocalDate.parse(scanner.next(), formato);
                    System.out.println("Ingrese la posición del amarre:");
                    int posicionAmarre = scanner.nextInt();

                    // Crear una instancia de Alquiler con los datos del cliente y el barco alquilado.
                    Alquiler alquiler = new Alquiler(nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoElegido);

                    // Calcular el precio del alquiler e imprimirlo.
                    double precioAlquiler = alquiler.calcularAlquiler();
                    System.out.println("El precio del alquiler es: $" + precioAlquiler);
                } else {
                    System.out.println("Selección no válida. Por favor, elija un tipo de barco válido.");
                }
            }
        }
    }
    // Agregar un nuevo barco a la lista de botes disponibles
    public void agregarBarco() {
        // Solicitar al usuario que elija el tipo de barco a agregar
        System.out.print("Seleccione el tipo de barco a agregar (1: Barco a Motor, 2: Velero, 3: Yate de Lujo): ");
        int seleccion = scanner.nextInt();

        if (seleccion >= 1 && seleccion <= 3) {
            Barco nuevoBarco = null;

            switch (seleccion) {
                case 1:
                    // Solicitar detalles específicos de Barco a Motor y crear la instancia
                    System.out.println("Barco a Motor elegido, especificar detalles: ");
                    System.out.println("Ingrese la matrícula:");
                    int matriculaMotor = scanner.nextInt();
                    System.out.println("Ingrese la eslora en metros:");
                    double esloraMotor = scanner.nextDouble();
                    System.out.println("Ingrese el año de fabricación:");
                    int anioMotor = scanner.nextInt();
                    System.out.println("Ingrese la potencia del motor en CV:");
                    double potenciaCv = scanner.nextDouble();
                    nuevoBarco = new BarcoMotor(matriculaMotor, esloraMotor, anioMotor, potenciaCv);
                    break;
                case 2:
                    // Solicitar detalles específicos de Velero y crear la instancia
                    System.out.println("Velero elegido, especificar detalles: ");
                    System.out.println("Ingrese la matrícula:");
                    int matriculaVelero = scanner.nextInt();
                    System.out.println("Ingrese la eslora en metros:");
                    double esloraVelero = scanner.nextDouble();
                    System.out.println("Ingrese el año de fabricación:");
                    int anioVelero = scanner.nextInt();
                    System.out.println("Ingrese el número de mástiles:");
                    int numeroMastiles = scanner.nextInt();
                    nuevoBarco = new Velero(matriculaVelero, esloraVelero, anioVelero, numeroMastiles);
                    break;
                case 3:
                    // Solicitar detalles específicos de Yate de Lujo y crear la instancia
                    System.out.println("Yate de Lujo elegido, especificar detalles: ");
                    System.out.println("Ingrese la matrícula:");
                    int matriculaYate = scanner.nextInt();
                    System.out.println("Ingrese la eslora en metros:");
                    double esloraYate = scanner.nextDouble();
                    System.out.println("Ingrese el año de fabricación:");
                    int anioYate = scanner.nextInt();
                    System.out.println("Ingrese la potencia del motor en CV:");
                    double potenciaCvYate = scanner.nextDouble();
                    System.out.println("Ingrese el número de camarotes:");
                    int camarotes = scanner.nextInt();
                    nuevoBarco = new YateLujo(matriculaYate, esloraYate, anioYate, camarotes, potenciaCvYate);
                    break;
            }

            if (nuevoBarco != null) {
                // Agregar el nuevo barco a la lista de botesDisponibles
                botesDisponibles.add(nuevoBarco);
                System.out.println("Barco agregado con éxito.");
            }
        } else {
            System.out.println("Selección no válida. Por favor, elija un tipo de barco válido.");
        }
    }



    public void actualizarBarco() {
        // Solicitar al usuario que ingrese la matrícula del barco a actualizar.
        System.out.println("Ingrese la matrícula del barco a actualizar:");
        int matricula = scanner.nextInt();

        // Buscar el barco en la lista de botesDisponibles.
        for (Barco barco : botesDisponibles) {
            if (barco.getMatriculaBarco() == matricula) {
                System.out.println("Barco encontrado. Matrícula: " + matricula);

                // Permitir al usuario actualizar los datos específicos del tipo de barco.
                if (barco instanceof BarcoMotor) {
                    // Actualizar Barco a Motor
                    System.out.println("Ingrese la nueva potencia del motor en CV:");
                    double potenciaCv = scanner.nextDouble();
                    ((BarcoMotor) barco).setPotenciaCv(potenciaCv);
                } else if (barco instanceof Velero) {
                    // Actualizar Velero
                    System.out.println("Ingrese el nuevo número de mástiles:");
                    int numeroMastiles = scanner.nextInt();
                    ((Velero) barco).setNumeroMastiles(numeroMastiles);
                } else if (barco instanceof YateLujo) {
                    // Actualizar Yate de Lujo
                    System.out.println("Ingrese la nueva potencia del motor en CV:");
                    double potenciaCvYate = scanner.nextDouble();
                    System.out.println("Ingrese el nuevo número de camarotes:");
                    int camarotes = scanner.nextInt();
                    ((YateLujo) barco).setPotenciaCv(potenciaCvYate);
                    ((YateLujo) barco).setCamarotes(camarotes);
                }

                System.out.println("Datos actualizados con éxito.");
                return; // Terminar la búsqueda una vez que se actualiza el barco.
            }
        }

        // Si no se encuentra la matrícula del barco, mostrar un mensaje de error.
        System.out.println("Barco no encontrado.");
    }


    // Eliminar un barco de la lista de botes disponibles
    public void eliminarBarco() {
        // Solicitar al usuario que ingrese la matrícula del barco a eliminar.
        System.out.println("Ingrese la matrícula del barco a eliminar:");
        int matricula = scanner.nextInt();

        // Buscar el barco en la lista de botesDisponibles y eliminarlo si se encuentra.
        for (Barco barco : botesDisponibles) {
            if (barco.getMatriculaBarco() == matricula) {
                botesDisponibles.remove(barco);
                System.out.println("Barco eliminado con éxito.");
                return; // Terminar la búsqueda una vez que se elimina el barco.
            }
        }

        // Si no se encuentra la matrícula del barco, mostrar un mensaje de error.
        System.out.println("Barco no encontrado.");
    }
    public void llenarListaBotes() {
        // Agregar algunos botes disponibles al puerto
        botesDisponibles.add(new BarcoMotor(1, 4, 2001, 100));
        botesDisponibles.add(new BarcoMotor(2, 5, 1995, 150));
        botesDisponibles.add(new BarcoMotor(3, 6, 2005, 80));

        botesDisponibles.add(new Velero(4, 7, 1990, 3));
        botesDisponibles.add(new Velero(5, 8, 2000, 2));
        botesDisponibles.add(new Velero(6, 9, 1985, 4));

        botesDisponibles.add(new YateLujo(7, 10, 2018, 4, 250));
        botesDisponibles.add(new YateLujo(8, 11, 2022, 5, 300));
        botesDisponibles.add(new YateLujo(9, 12, 2015, 3, 200));

    }

    public void mostrarBotes() {
        System.out.println("Lista de barcos disponibles: ");
        for (Barco bote : botesDisponibles) {
            System.out.println(bote);
        }
    }
}
