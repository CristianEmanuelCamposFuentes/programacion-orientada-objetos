package Actividades.actividadDesafioGrupal.ejercicio;

import Actividades.actividadDesafioGrupal.Servicios.ClienteServices;
import Actividades.actividadDesafioGrupal.Servicios.RutinaServices;

/*
Ejercicio 1 (Actividad para el día n° 18)

Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
clases y metodos;
CLASES:
Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo
(cadena de caracteres)
Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
descripcion
Crea una clase ServicioCliente y una clase ServicioRutina.

La clase "ServicioCliente" debe tener los siguientes métodos de CRUD:
registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.

La clase "ServicioRutina" debe tener los siguientes métodos de CRUD:
crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
En el método principal (Ejercicio1):

Crea al menos cinco clientes con datos ficticios.
Crea al menos cinco rutinas con datos ficticios.
Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
Elimina uno de los clientes existentes y muestra la lista de clientes final.
Elimina una de las rutinas existentes y muestra la lista de rutinas final.
Una vez terminado de codear, realizar lo siguiente:
Nota adicional: Puedes agregar más funcionalidades y métodos a las clases de entidad y servicio según consideres
necesario para incrementar aún más la complejidad del ejercicio.
* */
public class actividadDesafioGrupal {
    public static void main(String[] args) {
        ClienteServices servC = new ClienteServices();
        RutinaServices servR = new RutinaServices();

        System.out.println("Inicio del programa: ");
        System.out.println("Lista de clientes activa: ");
        servC.listaLlena();

        servC.obtenerClientes();

        System.out.println("Editar cliente Pepe: ");
        servC.actualizarCliente(2, "pepe", 200, 2, 250, "inmortal");

        servC.obtenerClientes();

        System.out.println("Eliminar cliente con id 1: ");
        servC.eliminarCliente(1);

        servC.obtenerClientes();

        System.out.println("Lista de rutinas activas: ");
        servR.llenarRutina();

        servR.obtenerRutinas();

    }
}
