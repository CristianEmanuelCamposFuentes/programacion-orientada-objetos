package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Ejercicio.Main;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cuota;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioCuota {
    private static List<Cuota> cuotas;

    public ServicioCuota() {
        cuotas = new ArrayList<>();
    }

    public static void mostrarListaCuotas() {
        System.out.println("Lista de Cuotas:");
        for (Cuota cuota : cuotas) {
            System.out.println("Número de Cuota: " + cuota.getNumeroCuota() + " - Monto Total: " +
                    cuota.getMontoTotalCuota() + " - Pagada: " + cuota.isPagada() + " - Fecha de Vencimiento: " +
                    cuota.getFechaVencimiento() + " - Forma de Pago: " + cuota.getFormaPago());
        }
    }

    public void gestionarCuotas() {
        int opcion;
        do {
            mostrarMenuCuotas();
            opcion = Main.lector.nextInt();
            switch (opcion) {
                case 1:
                    mostrarListaCuotas();
                    break;
                case 2:
                    marcarCuotaComoPagada();
                    break;
                case 3:
                    agregarCuota();
                    break;
                case 4:
                    editarCuota();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }

    public void agregarCuota() {
        System.out.println("Agregar Nueva Cuota");

        System.out.print("Número de cuota: ");
        int numeroCuota = Main.lector.nextInt();

        System.out.print("Monto total de la cuota: ");
        double montoTotalCuota = Main.lector.nextDouble();

        System.out.print("¿Cuota pagada? (S/N): ");
        boolean pagada = Main.lector.next().equalsIgnoreCase("S");

        Main.lector.nextLine(); // Consumir la nueva línea

        System.out.print("Fecha de vencimiento (dd/MM/yyyy): ");
        String fechaVencimientoStr = Main.lector.nextLine();
        Date fechaVencimiento = parseFecha(fechaVencimientoStr);

        System.out.print("Forma de pago: ");
        String formaPago = Main.lector.nextLine();

        Cuota nuevaCuota = new Cuota(numeroCuota, montoTotalCuota, pagada, fechaVencimiento, formaPago);
        cuotas.add(nuevaCuota);

        System.out.println("Cuota agregada exitosamente.");
    }

    public void editarCuota() {
        mostrarListaCuotas();
        System.out.print("Seleccione el número de la cuota que desea editar: ");
        int numCuota = Main.lector.nextInt();
        Main.lector.nextLine(); // Consumir la nueva línea

        // Verifica si el número de cuota es válido
        if (numCuota >= 1 && numCuota <= cuotas.size()) {
            Cuota cuotaSeleccionada = cuotas.get(numCuota - 1);

            System.out.println("Editando cuota número: " + cuotaSeleccionada.getNumeroCuota());

            System.out.print("Nuevo monto total de la cuota: ");
            double nuevoMontoTotalCuota = Main.lector.nextDouble();

            System.out.print("¿Cuota pagada? (S/N): ");
            boolean nuevaPagada = Main.lector.next().equalsIgnoreCase("S");

            Main.lector.nextLine(); // Consumir la nueva línea

            System.out.print("Nueva fecha de vencimiento (dd/MM/yyyy): ");
            String nuevaFechaVencimientoStr = Main.lector.nextLine();
            Date nuevaFechaVencimiento = parseFecha(nuevaFechaVencimientoStr);

            System.out.print("Nueva forma de pago: ");
            String nuevaFormaPago = Main.lector.nextLine();

            editarCuota(cuotaSeleccionada.getNumeroCuota(), nuevoMontoTotalCuota, nuevaPagada,
                    nuevaFechaVencimiento, nuevaFormaPago);

            System.out.println("Cuota editada exitosamente.");
        } else {
            System.out.println("Número de cuota inválido.");
        }
    }

    public static void editarCuota(int numeroCuota, double nuevoMontoTotalCuota, boolean nuevaPagada,
                                   Date nuevaFechaVencimiento, String nuevaFormaPago) {
        for (Cuota cuota : cuotas) {
            if (cuota.getNumeroCuota() == numeroCuota) {
                cuota.setMontoTotalCuota(nuevoMontoTotalCuota);
                cuota.setPagada(nuevaPagada);
                cuota.setFechaVencimiento(nuevaFechaVencimiento);
                cuota.setFormaPago(nuevaFormaPago);
                break;
            }
        }
    }

    /**
     * Convierte una cadena de fecha en un objeto Date utilizando el formato "dd/MM/yyyy".
     *
     * @param fechaStr La cadena de fecha en formato "dd/MM/yyyy".
     * @return El objeto Date resultante de la conversión, o null si ocurre un error.
     */
    private Date parseFecha(String fechaStr) {
        // Crea un nuevo objeto SimpleDateFormat con el formato de fecha "dd/MM/yyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Intenta analizar la cadena de fecha usando el formato especificado
            // y retorna el objeto Date resultante si la conversión es exitosa
            return dateFormat.parse(fechaStr);
        } catch (ParseException e) {
            // Si ocurre un error durante la conversión, imprime información sobre el error
            // utilizando el método printStackTrace() y devuelve null para indicar que no se pudo
            // realizar la conversión correctamente
            e.printStackTrace();
            return null;
        }
    }


    public void mostrarMenuCuotas() {
        System.out.println("Menú de Gestionar Cuotas:");
        System.out.println("1. Mostrar lista de cuotas");
        System.out.println("2. Marcar cuota como pagada");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    public void marcarCuotaComoPagada() {
        mostrarListaCuotas();
        System.out.print("Seleccione el número de la cuota que desea marcar como pagada: ");
        int numCuota = Main.lector.nextInt();

        // Verifica si el número de cuota es válido
        if (numCuota >= 1 && numCuota <= cuotas.size()) {
            Cuota cuotaSeleccionada = cuotas.get(numCuota - 1);
            marcarCuotaComoPagada(cuotaSeleccionada);
            System.out.println("Cuota marcada como pagada exitosamente.");
        } else {
            System.out.println("Número de cuota inválido.");
        }
    }

    public void marcarCuotaComoPagada(Cuota cuota) {
        cuota.setPagada(true);
    }
}
