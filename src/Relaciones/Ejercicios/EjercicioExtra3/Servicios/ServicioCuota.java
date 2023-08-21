package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Ejercicio.Main;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cuota;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioCuota {
    private static List<Cuota> cuotas;

    public ServicioCuota() {
        cuotas = new ArrayList<>();
    }

    public static void agregarCuota(Cuota cuota) {
        cuotas.add(cuota);
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
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 3);
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
