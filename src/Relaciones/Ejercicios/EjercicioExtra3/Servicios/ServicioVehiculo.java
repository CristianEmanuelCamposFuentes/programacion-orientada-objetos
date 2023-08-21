package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Ejercicio.Main;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class ServicioVehiculo {
    private List<Vehiculo> vehiculos;

    public ServicioVehiculo() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public static List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    public void gestionarVehiculos() {
        int opcion;
        do {
            mostrarMenuVehiculos();
            opcion = Main.lector.nextInt();

            switch (opcion) {
                case 1:
                    mostrarListaVehiculos();
                    break;
                case 2:
                    agregarNuevoVehiculo();
                    break;
                case 3:
                    editarVehiculo();
                    break;
                case 4:
                    eliminarVehiculo();
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

    public void mostrarListaVehiculos() {
        System.out.println("Lista de Vehículos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
    }

    private void agregarNuevoVehiculo() {
        System.out.println("Agregar Nuevo Vehículo");

        System.out.print("Marca: ");
        String marca = Main.lector.next();

        System.out.print("Modelo: ");
        String modelo = Main.lector.next();

        System.out.print("Año: ");
        int anio = Main.lector.nextInt();

        System.out.print("Número de Motor: ");
        String numeroMotor = Main.lector.next();

        System.out.print("Número de Chasis: ");
        String numeroChasis = Main.lector.next();

        System.out.print("Color: ");
        String color = Main.lector.next();

        System.out.print("Tipo: ");
        String tipo = Main.lector.next();

        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMarca(marca);
        nuevoVehiculo.setModelo(modelo);
        nuevoVehiculo.setAnio(anio);
        nuevoVehiculo.setNumeroMotor(numeroMotor);
        nuevoVehiculo.setNumeroChasis(numeroChasis);
        nuevoVehiculo.setColor(color);
        nuevoVehiculo.setTipo(tipo);

        vehiculos.add(nuevoVehiculo);

        System.out.println("Vehículo agregado exitosamente.");
    }

    private void editarVehiculo() {
        mostrarListaVehiculos();
        System.out.print("Seleccione el número del vehículo que desea editar: ");
        int numVehiculo = Main.lector.nextInt();
        Main.lector.nextLine(); // Consumir la nueva línea

        if (numVehiculo >= 1 && numVehiculo <= vehiculos.size()) {
            Vehiculo vehiculoSeleccionado = vehiculos.get(numVehiculo - 1);

            System.out.println("Editando vehículo: " + vehiculoSeleccionado.getMarca() + " " + vehiculoSeleccionado.getModelo());

            System.out.print("Nueva marca: ");
            String nuevaMarca = Main.lector.nextLine();

            System.out.print("Nuevo modelo: ");
            String nuevoModelo = Main.lector.nextLine();

            System.out.print("Nuevo año: ");
            int nuevoAnio = Main.lector.nextInt();
            Main.lector.nextLine(); // Consumir la nueva línea

            System.out.print("Nuevo número de motor: ");
            String nuevoNumeroMotor = Main.lector.nextLine();

            System.out.print("Nuevo número de chasis: ");
            String nuevoNumeroChasis = Main.lector.nextLine();

            System.out.print("Nuevo color: ");
            String nuevoColor = Main.lector.nextLine();

            System.out.print("Nuevo tipo: ");
            String nuevoTipo = Main.lector.nextLine();

            vehiculoSeleccionado.setMarca(nuevaMarca);
            vehiculoSeleccionado.setModelo(nuevoModelo);
            vehiculoSeleccionado.setAnio(nuevoAnio);
            vehiculoSeleccionado.setNumeroMotor(nuevoNumeroMotor);
            vehiculoSeleccionado.setNumeroChasis(nuevoNumeroChasis);
            vehiculoSeleccionado.setColor(nuevoColor);
            vehiculoSeleccionado.setTipo(nuevoTipo);

            System.out.println("Vehículo editado exitosamente.");
        } else {
            System.out.println("Número de vehículo inválido.");
        }
    }

    private void eliminarVehiculo() {
        mostrarListaVehiculos();
        System.out.print("Seleccione el número del vehículo que desea eliminar: ");
        int numVehiculo = Main.lector.nextInt();
        if (numVehiculo >= 1 && numVehiculo <= vehiculos.size()) {
            Vehiculo vehiculoSeleccionado = vehiculos.get(numVehiculo - 1);
            vehiculos.remove(vehiculoSeleccionado);
            System.out.println("Vehículo eliminado exitosamente.");
        } else {
            System.out.println("Número de vehículo inválido.");
        }
    }

    private void mostrarMenuVehiculos() {
        System.out.println("Menú de Gestión de Vehículos:");
        System.out.println("1. Mostrar lista de vehículos");
        System.out.println("2. Agregar nuevo vehículo");
        System.out.println("3. Editar vehículo");
        System.out.println("4. Eliminar vehículo");
        System.out.println("5. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

}

