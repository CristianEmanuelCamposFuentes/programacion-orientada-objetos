package Actividades.actividadDesafioGrupal.Servicios;

import Actividades.actividadDesafioGrupal.Entidades.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;


public class RutinaServices {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    int id = 0;
    List<Rutina> listaRutinas = new ArrayList<>();
    public void llenarRutina(){
        // Crear todas las rutinas predefinidas
        Rutina rutina1 = new Rutina(1, "Rutina de cardio", 60, "Intermedio", "Ejercicios de cardio para quemar grasa");
        Rutina rutina2 = new Rutina(2, "Rutina de fuerza", 45, "Avanzado", "Ejercicios de fuerza para ganar masa muscular");
        Rutina rutina3 = new Rutina(3, "Rutina de yoga", 30, "Principiante", "Secuencia de posturas de yoga para relajación");
        Rutina rutina4 = new Rutina(4, "Rutina de Pilates", 60, "Intermedio", "Ejercicios de Pilates para fortalecer el core");
        Rutina rutina5 = new Rutina(5, "Rutina de estiramientos", 20, "Todos los niveles", "Estiramientos para mejorar la flexibilidad");

        // Agregar las rutinas a la lista
        listaRutinas.add(rutina1);
        listaRutinas.add(rutina2);
        listaRutinas.add(rutina3);
        listaRutinas.add(rutina4);
        listaRutinas.add(rutina5);
    }

    public void registrarRutina(){
        Rutina rutina = new Rutina();
        rutina.setId(id);
        id++;
        System.out.println("Ingresa el Nombre");
        rutina.setNombre(sc.next());
        System.out.println("Ingresa la Duracion");
        rutina.setDuracion(sc.nextInt());
        System.out.println("Ingresa la Nivel");
        rutina.setNivel(sc.nextLine());
        System.out.println("Ingresa el Descripcion");
        rutina.setDescripcion(sc.nextLine());


        listaRutinas.add(rutina);

    }

    public void obtenerRutinas(){
        System.out.println(listaRutinas);
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        boolean encontrada = false;
        for (Rutina rutinaActual: listaRutinas) {
            if (rutinaActual.getId() == id){
                rutinaActual.setNombre(nombre);
                rutinaActual.setDuracion(duracion);
                rutinaActual.setNivel(nivelDificultad);
                rutinaActual.setDescripcion(descripcion);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontro el id.");
        }
    }

    public void eliminarRutina(int id){
        Rutina rutinaAEliminar = null;
        for (Rutina rutinaActual : listaRutinas) {

            if (rutinaActual.getId() == id) {
                rutinaAEliminar = rutinaActual;
            }
        }listaRutinas.remove(rutinaAEliminar);
    }

}
