package Relaciones.Ejercicios.EjercicioExtra4.Servicios;

import Relaciones.Ejercicios.EjercicioExtra4.Entidades.Alumno;
import Relaciones.Ejercicios.EjercicioExtra4.Entidades.Voto;

import java.util.*;

public class Simulador {
    private List<String> nombres = Arrays.asList(
            "Juan", "Maria", "Carlos", "Ana", "Luis", "Pedro", "Laura", "Eduardo", "Sofia", "Diego",
            "Federico", "Valentina", "Miguel", "Lucia", "Mateo", "Camila", "Andres", "Martina", "Alejandro", "Isabella"
    );
    private List<String> apellidos = Arrays.asList(
            "Gomez", "Perez", "Lopez", "Martinez", "Rodriguez", "Fernandez", "Gonzalez", "Diaz", "Alvarez", "Hernandez",
            "Torres", "Ruiz", "Romero", "Sanchez", "Ramirez", "Flores", "Acosta", "Pereyra", "Molina", "Rojas"
    );
    private List<String> dnis = generarDnis();

    public List<Alumno> generarAlumnos(int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            // A medida que itera, va agregando el nombre junto al apellido aleatorios y el dni segun el indice,
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            String nombreCompleto = nombre + " " + apellido;
            String dni = dnis.get(i);
            // Y le asigna esos datos a Alumno y lo agrega a la lista de alumnos
            // dni es tipo String, asi que se convierte a Double por el atributo dni de Alumno
            alumnos.add(new Alumno(nombreCompleto, Double.parseDouble(dni)));
        }
        System.out.println("Alumnos generados correctamente.");
        return alumnos;
    }

    public List<String> generarDnis() {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            // Formatear para 8 digitos y aplicar el random de tipo int
            String dni = String.format("%08d", random.nextInt(100_000_000));
            // Aca el dni no se convierte porque dnis es una lista de Strings
            dnis.add(dni);
        }

        return dnis;
    }

    public void asignarDnis(List<Alumno> alumnos) {
        Random random = new Random();

        for (Alumno alumno : alumnos) {
            String dni = dnis.get(random.nextInt(dnis.size()));
            alumno.setDNI(Double.parseDouble(dni));
        }
        System.out.println("Dnis generados exitosamente.");
        mostrarAlumnos(alumnos);
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    public void realizarVotacion(List<Alumno> alumnos) {
        Random random = new Random();
        List<Voto> votosTotales = new ArrayList<>();

        System.out.println("Comenzando la votacion:");

            // Ahora con un foreach recorrer los alumnos para que voten
        for (Alumno votante : alumnos) {
            // Constructor de Voto con cada alumno que va votando en cada iteracion
            Voto voto = new Voto(votante);
            voto.setAlumnoVotante(votante);

            // Establecer los 3 alumnos votados por el votante
            Set<Alumno> alumnosVotados = new HashSet<>();


            // Los votados son 0 al principio, al tercer voto se termina la iteracion
          while(alumnosVotados.size() < 3) {
            // Generar el numero aleatorio del indice para usarlo despues en la lista de alumnos
            int indiceAleatorio = random.nextInt(alumnos.size());
            // Crea el objeto Alumno y le asigna al que esta ubicado en el indice aleatorio en la lista de alumnos
            Alumno alumnoVotado = alumnos.get(indiceAleatorio);

            // Ahora validamos que no sea el mismo votante y que no este duplicando el voto
            if (alumnoVotado != votante && !alumnosVotados.contains(alumnoVotado)) {
                // Agregamos el alumno a la lista de alumnos votados
                alumnosVotados.add(alumnoVotado);
                // Agregar el voto en la clase de Voto
                voto.agregarVoto(alumnoVotado);

                // Incrementar la cantidad de votos para el alumno votado
                alumnoVotado.incrementarVotos();
            }
        }

            // Agregar el alumno y sus 3 votos a la lista general de votados
            votosTotales.add(voto);

            System.out.println("Votante: " + votante.getNombreCompleto() + " - Votos realizados: " + alumnosVotados.size());
        }

        System.out.println("Votación realizada exitosamente.");
        mostrarResultadosDetallados(votosTotales);
    }

    public void mostrarResultadosDetallados(List<Voto> votosTotales) {
        System.out.println("=====================================");
        System.out.println("Detalle de las votaciones : ");
        for (Voto voto : votosTotales) {
            System.out.println("Votos de " + voto.getAlumnoVotante().getNombreCompleto() + ": " + '\n' + voto.getAlumnosVotados() + '\n');

        }
        System.out.println("=====================================");
    }

    public void mostrarResultadosVotacion(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }
    }

    public void mostrarFacilitadores(List<Alumno> alumnos) {
        // Primero validamos, si son menos de 5 alumnos los votados, no puede haber tantos facilitadores
        if (alumnos.size() < 5) {
            System.out.println("No hay suficientes alumnos para elegir a los facilitadores.");
            return;
        }


        // Ordenar los alumnos segun la cantidad de votos dada vuelta, asi aparecen los de mayor votacion
        alumnos.sort(Comparator.comparingInt(Alumno::getCantidadDeVotos).reversed());

        System.out.println("Facilitadores:");
        // Primeros 5 son facilitadores
        for (int i = 0; i < 5; i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i + 1) + "1. " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }
    }
}
