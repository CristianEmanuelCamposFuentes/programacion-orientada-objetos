package Relaciones.Ejercicios.EjercicioExtra4.Servicios;

import Relaciones.Ejercicios.EjercicioExtra4.Entidades.Alumno;

import java.util.*;

public class Simulador {
    private List<String> nombres = Arrays.asList("Juan", "Maria", "Carlos", "Ana", "Luis", "Pedro", "Laura", "Eduardo", "Sofia", "Diego");
    private List<String> apellidos = Arrays.asList("Gomez", "Perez", "Lopez", "Martinez", "Rodriguez", "Fernandez", "Gonzalez", "Diaz", "Alvarez", "Hernandez");
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

        return alumnos;
    }

    public List<String> generarDnis() {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            // Formatear para 8 digitos y aplicar el random de tipo int
            String dni = String.format("%08d", random.nextInt(100000000));
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
    }

    public void realizarVotacion(List<Alumno> alumnos) {
        Random random = new Random();
        Set<Integer> votadosIndices = new HashSet<>(); // Para asegurarse de no votar al mismo alumno

        System.out.println("Comenzando la votacion:");
        // Iteramos a través de cada votante en la lista de alumnos
        for (Alumno votante : alumnos) {
            Set<Integer> votados = new HashSet<>(); // Para almacenar los índices de los alumnos votados

            // Seleccionamos 3 alumnos para votar
            while (votados.size() < 3) {
                int index = random.nextInt(alumnos.size()); // Generamos un índice aleatorio
                if (index != alumnos.indexOf(votante) && !votadosIndices.contains(index)) {
                    // Verificamos que no sea el mismo votante ni haya sido votado antes
                    votados.add(index); // Agregamos el índice a la lista de votados
                }
            }

            // Agregamos los índices de los votados a la lista general de votados
            votadosIndices.addAll(votados);

            // Incrementamos la cantidad de votos para los alumnos votados
            for (int index : votados) {
                Alumno votado = alumnos.get(index); // Obtenemos el alumno votado
                votado.incrementarVotos(); // Incrementamos su contador de votos
            }
        }

        System.out.println("Votación realizada exitosamente.");
    }

    public void mostrarResultadosVotacion(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }
    }

    public void mostrarFacilitadores(List<Alumno> alumnos) {
        alumnos.sort((a1, a2) -> a2.getCantidadDeVotos() - a1.getCantidadDeVotos());

        System.out.println("Facilitadores:");
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i + 1) + "1. " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }
    }
}
