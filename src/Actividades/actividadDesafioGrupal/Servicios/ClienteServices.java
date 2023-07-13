package Actividades.actividadDesafioGrupal.Servicios;

import Actividades.actividadDesafioGrupal.Entidades.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteServices {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    int id = 0;
    List<Cliente> listaClientes =  new ArrayList<>();

    public void listaLlena(){
        // Crear 5 clientes predefinidos
        Cliente cliente1 = new Cliente(1, "Juan", 30, 170, 70, "Perder peso");
        Cliente cliente2 = new Cliente(2, "María", 25, 165, 60, "Mantener forma física");
        Cliente cliente3 = new Cliente(3, "Carlos", 40, 180, 80, "Ganar masa muscular");
        Cliente cliente4 = new Cliente(4, "Ana", 28, 160, 55, "Tonificar el cuerpo");
        Cliente cliente5 = new Cliente(5, "Luis", 35, 175, 75, "Mejorar resistencia");

        // Agregar los clientes a la lista
//        List<Cliente> clientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
    }

    public void registrarCliente(){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        id++;
        System.out.println("Ingresa el Nombre");
        cliente.setNombre(sc.next());
        System.out.println("Ingresa la Edad");
        cliente.setEdad(sc.nextInt());
        System.out.println("Ingresa la Altura");
        cliente.setAltura(sc.nextDouble());
        System.out.println("Ingresa el peso");
        cliente.setPeso(sc.nextDouble());
        System.out.println("Ingresa el Objetivo");
        cliente.setObjetivo(sc.next());

        listaClientes.add(cliente);

    }

    public void obtenerClientes(){
        System.out.println(listaClientes);
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        boolean encontrada = false;
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getId() == id) {
                clienteActual.setNombre(nombre);
                clienteActual.setEdad(edad);
                clienteActual.setAltura(altura);
                clienteActual.setPeso(peso);
                clienteActual.setObjetivo(objetivo);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontro el id.");
        }
    }

    public void eliminarCliente(int id){
        Cliente clienteAEliminar = null;
        for (Cliente clienteActual : listaClientes) {

            if (clienteActual.getId() == id) {
                clienteAEliminar = clienteActual;
            }
        }listaClientes.remove(clienteAEliminar);
    }
}
