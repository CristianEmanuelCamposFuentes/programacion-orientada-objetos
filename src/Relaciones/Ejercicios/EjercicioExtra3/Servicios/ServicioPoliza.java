package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Ejercicio.Main;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cliente;
import Relaciones.Ejercicios.EjercicioExtra3.Servicios.ServicioCliente;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cuota;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Poliza;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Vehiculo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioPoliza {
    private static List<Poliza> polizas;

    public ServicioPoliza() {
        polizas = new ArrayList<>();
    }

    public static void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }

    public List<Poliza> obtenerPolizas() {
        return polizas;
    }

    public void gestionarPolizas() {
        int opcion;
        do {
            mostrarMenuPolizas();
            opcion = Main.lector.nextInt();

            switch (opcion) {
                case 1:
                    mostrarListaPolizas();
                    break;
                case 2:
                    agregarNuevaPoliza();
                    break;
                case 3:
                    editarPoliza();
                    break;
                case 4:
                    eliminarPoliza();
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

    public void mostrarListaPolizas() {
        System.out.println("Lista de Pólizas:");
        for (int i = 0; i < polizas.size(); i++) {
            Poliza poliza = polizas.get(i);
            System.out.println((i + 1) + ". Número de Póliza: " + poliza.getNumeroPoliza() + " - Cliente: " +
                    poliza.getCliente().getNombre() + " " + poliza.getCliente().getApellido());
        }
    }

    private void agregarNuevaPoliza() {
        System.out.println("Agregar Nueva Póliza");

        System.out.print("Número de póliza: ");
        String numeroPoliza = Main.lector.next();

        System.out.print("Fecha de inicio (dd/mm/yyyy): ");
        String fechaInicioStr = Main.lector.next();
        Date fechaInicio = parseFecha(fechaInicioStr);

        System.out.print("Fecha de fin (dd/mm/yyyy): ");
        String fechaFinStr = Main.lector.next();
        Date fechaFin = parseFecha(fechaFinStr);

        System.out.print("Cantidad de cuotas: ");
        int cantidadCuotas = Main.lector.nextInt();

        Main.lector.nextLine(); // Consumir la nueva línea

        System.out.print("Forma de pago: ");
        String formaPago = Main.lector.nextLine();

        System.out.print("Monto total asegurado: ");
        double montoTotalAsegurado = Main.lector.nextDouble();

        System.out.print("Incluye granizo (true/false): ");
        boolean incluyeGranizo = Main.lector.nextBoolean();

        System.out.print("Monto máximo granizo: ");
        double montoMaximoGranizo = Main.lector.nextDouble();

        Main.lector.nextLine(); // Consumir la nueva línea

        System.out.print("Tipo de cobertura: ");
        String tipoCobertura = Main.lector.nextLine();

        System.out.print("Ingrese el documento del cliente para asociar a la póliza: ");
        String documentoCliente = Main.lector.next();
        Cliente clienteAsociado = ServicioCliente.buscarClientePorDocumento(documentoCliente);

        if (clienteAsociado == null) {
            System.out.println("Cliente no encontrado. La póliza no será asociada.");
            return;
        }

        ServicioCliente.mostrarListaClientes();

        // Solicita al usuario seleccionar un número de vehículo para asociarlo a la póliza
        System.out.print("Seleccione el número del vehículo para asociar a la póliza: ");
        int numVehiculo = Main.lector.nextInt();

        // Obtiene la instancia del servicio de vehículos y accede a la lista de vehículos,
        // toma el vehículo seleccionado en base al número proporcionado por el usuario (-1 porque las listas son 0-indexadas)
        Vehiculo vehiculoAsociado = ServicioVehiculo.obtenerVehiculos().get(numVehiculo - 1);

        Main.lector.nextLine(); // Consume la nueva línea después de leer el número del vehículo

        // Crea una nueva instancia de Poliza con los datos proporcionados y el vehículo asociado,
        // inicializa la lista de cuotas como una lista vacía
        Poliza nuevaPoliza = new Poliza(numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, formaPago, montoTotalAsegurado,
                incluyeGranizo, montoMaximoGranizo, tipoCobertura, clienteAsociado, vehiculoAsociado, new ArrayList<>());

        // Agrega la nueva póliza a la lista de pólizas en el servicio correspondiente
        ServicioPoliza.agregarPoliza(nuevaPoliza);

        // Muestra un mensaje para informar al usuario que la póliza ha sido agregada exitosamente
        System.out.println("Póliza agregada exitosamente.");
    }

        // Método para convertir una cadena de fecha en un objeto Date utilizando un formato específico
    private Date parseFecha(String fechaStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(fechaStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void editarPoliza() {
        mostrarListaPolizas();
        System.out.print("Seleccione el número de la póliza que desea editar: ");
        int numPoliza = Main.lector.nextInt();
        Main.lector.nextLine(); // Consumir la nueva línea

        // Verifica si el número de póliza es válido
        if (numPoliza >= 1 && numPoliza <= polizas.size()) {
            Poliza polizaSeleccionada = polizas.get(numPoliza - 1);

            System.out.println("Editando póliza: " + polizaSeleccionada.getNumeroPoliza());

            // Editar los atributos de la póliza
            System.out.print("Nuevo número de póliza: ");
            polizaSeleccionada.setNumeroPoliza(Main.lector.nextLine());

            System.out.print("Nueva fecha de inicio (dd/MM/yyyy): ");
            String nuevaFechaInicioStr = Main.lector.nextLine();
            Date nuevaFechaInicio = parseFecha(nuevaFechaInicioStr);
            if (nuevaFechaInicio != null) {
                polizaSeleccionada.setFechaInicio(nuevaFechaInicio);
            }

            System.out.print("Nueva fecha de fin (dd/MM/yyyy): ");
            String nuevaFechaFinStr = Main.lector.nextLine();
            Date nuevaFechaFin = parseFecha(nuevaFechaFinStr);
            if (nuevaFechaFin != null) {
                polizaSeleccionada.setFechaFin(nuevaFechaFin);
            }

            System.out.print("Nueva cantidad de cuotas: ");
            int nuevaCantidadCuotas = Main.lector.nextInt();
            polizaSeleccionada.setCantidadCuotas(nuevaCantidadCuotas);

            Main.lector.nextLine(); // Consumir la nueva línea

            System.out.print("Nueva forma de pago: ");
            String nuevaFormaPago = Main.lector.nextLine();
            polizaSeleccionada.setFormaPago(nuevaFormaPago);

            System.out.print("Nuevo monto total asegurado: ");
            double nuevoMontoTotalAsegurado = Main.lector.nextDouble();
            polizaSeleccionada.setMontoTotalAsegurado(nuevoMontoTotalAsegurado);

            Main.lector.nextLine(); // Consumir la nueva línea

            System.out.print("Incluye granizo? (S/N): ");
            String opcionIncluyeGranizo = Main.lector.nextLine();
            polizaSeleccionada.setIncluyeGranizo(opcionIncluyeGranizo.equalsIgnoreCase("S"));

            System.out.print("Nuevo monto máximo por granizo: ");
            double nuevoMontoMaximoGranizo = Main.lector.nextDouble();
            polizaSeleccionada.setMontoMaximoGranizo(nuevoMontoMaximoGranizo);

            Main.lector.nextLine(); // Consumir la nueva línea

            System.out.print("Nuevo tipo de cobertura: ");
            String nuevoTipoCobertura = Main.lector.nextLine();
            polizaSeleccionada.setTipoCobertura(nuevoTipoCobertura);


            // Editar cuotas si es necesario
            System.out.print("Desea editar las cuotas de esta póliza? (S/N): ");
            String opcionEditarCuotas = Main.lector.nextLine();
            if (opcionEditarCuotas.equalsIgnoreCase("S")) {
                List<Cuota> cuotasPoliza = polizaSeleccionada.getCuotas();

                // Recorrer todas las cuotas y modificar sus atributos
                for (Cuota cuota : cuotasPoliza) {
                    System.out.println("Editando cuota " + cuota.getNumeroCuota());

                    // Implementa la lógica para editar los atributos de la cuota
                    // Por ejemplo, marcar como pagada
                    System.out.print("¿Marcar cuota como pagada? (S/N): ");
                    String opcionPagada = Main.lector.nextLine();
                    cuota.setPagada(opcionPagada.equalsIgnoreCase("S"));
                }

                System.out.println("Cuotas editadas exitosamente.");
            }


            System.out.println("Póliza editada exitosamente.");
        } else {
            System.out.println("Número de póliza inválido.");
        }
    }

    private void eliminarPoliza() {
        mostrarListaPolizas();
        System.out.print("Seleccione el número de la póliza que desea eliminar: ");
        int numPoliza = Main.lector.nextInt();

        // Verifica si el número de póliza es válido
        if (numPoliza >= 1 && numPoliza <= polizas.size()) {
            Poliza polizaSeleccionada = polizas.get(numPoliza - 1);
            polizas.remove(polizaSeleccionada);
            System.out.println("Póliza eliminada exitosamente.");
        } else {
            System.out.println("Número de póliza inválido.");
        }
    }

    private void mostrarMenuPolizas() {
        System.out.println("Menú de Gestión de Pólizas:");
        System.out.println("1. Mostrar lista de pólizas");
        System.out.println("2. Agregar nueva póliza");
        System.out.println("3. Editar póliza");
        System.out.println("4. Eliminar póliza");
        System.out.println("5. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }
}

