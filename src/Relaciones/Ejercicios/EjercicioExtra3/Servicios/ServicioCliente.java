package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Ejercicio.Main;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ServicioCliente {
    private List<Cliente> clientes;

    public ServicioCliente() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public void gestionarClientes() {
        int opcion;
        do {
            mostrarMenuClientes();
            opcion = Main.lector.nextInt();

            switch (opcion) {
                case 1:
                    mostrarListaClientes();
                    break;
                case 2:
                    agregarNuevoCliente();
                    break;
                case 3:
                    editarCliente();
                    break;
                case 4:
                    eliminarCliente();
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

    public static void mostrarListaClientes() {
        System.out.println("Lista de Clientes:");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". " + cliente.getNombre() + " " + cliente.getApellido());
        }
    }

    private void agregarNuevoCliente() {
        System.out.println("Agregar Nuevo Cliente");

        System.out.print("Nombre: ");
        String nombre = Main.lector.next();

        System.out.print("Apellido: ");
        String apellido = Main.lector.next();

        System.out.print("Documento: ");
        String documento = Main.lector.next();

        System.out.print("Correo: ");
        String correo = Main.lector.next();

        System.out.print("Domicilio: ");
        String domicilio = Main.lector.next();

        System.out.print("Teléfono: ");
        String telefono = Main.lector.next();

        Cliente nuevoCliente = new Cliente(nombre, apellido, documento, correo, domicilio, telefono);

        clientes.add(nuevoCliente);

        System.out.println("Cliente agregado exitosamente.");
    }

    private void editarCliente() {
        mostrarListaClientes();
        System.out.print("Seleccione el número del cliente que desea editar: ");
        int numCliente = Main.lector.nextInt();
        Main.lector.nextLine(); // Consumir la nueva línea

        // Si la opcion elegida esta dentro de la cantidad de clientes, se elige para editar, sino da aviso
        if (numCliente >= 1 && numCliente <= clientes.size()) {
            Cliente clienteSeleccionado = clientes.get(numCliente - 1);

            System.out.println("Editando cliente: " + clienteSeleccionado.getNombre() + " " + clienteSeleccionado.getApellido());

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = Main.lector.nextLine();

            System.out.print("Nuevo apellido: ");
            String nuevoApellido = Main.lector.nextLine();

            System.out.print("Nuevo documento: ");
            String nuevoDocumento = Main.lector.nextLine();

            System.out.print("Nuevo correo: ");
            String nuevoCorreo = Main.lector.nextLine();

            System.out.print("Nuevo domicilio: ");
            String nuevoDomicilio = Main.lector.nextLine();

            System.out.print("Nuevo teléfono: ");
            String nuevoTelefono = Main.lector.nextLine();

            // Actualizar los datos del cliente
            clienteSeleccionado.setNombre(nuevoNombre);
            clienteSeleccionado.setApellido(nuevoApellido);
            clienteSeleccionado.setDocumento(nuevoDocumento);
            clienteSeleccionado.setCorreo(nuevoCorreo);
            clienteSeleccionado.setDomicilio(nuevoDomicilio);
            clienteSeleccionado.setTelefono(nuevoTelefono);

            System.out.println("Cliente editado exitosamente.");
        } else {
            System.out.println("Número de cliente inválido.");
        }
    }


    private void eliminarCliente() {
        mostrarListaClientes();
        System.out.print("Seleccione el número del cliente que desea eliminar: ");
        int numCliente = Main.lector.nextInt();
        if (numCliente >= 1 && numCliente <= clientes.size()) {
            Cliente clienteSeleccionado = clientes.get(numCliente - 1);
            clientes.remove(clienteSeleccionado);
            System.out.println("Cliente eliminado exitosamente.");
        } else {
            System.out.println("Número de cliente inválido.");
        }
    }

    public static Cliente buscarClientePorDocumento(String documento) {
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente;
            }
        }
        return null;
    }


    private void mostrarMenuClientes() {
        System.out.println("Menú de Gestión de Clientes:");
        System.out.println("1. Mostrar lista de clientes");
        System.out.println("2. Agregar nuevo cliente");
        System.out.println("3. Editar cliente");
        System.out.println("4. Eliminar cliente");
        System.out.println("5. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }
}
