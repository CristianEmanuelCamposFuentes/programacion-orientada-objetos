package Relaciones.Ejercicios.EjercicioExtra4.Servicios;

import Relaciones.Ejercicios.EjercicioExtra4.Entidades.Alumno;

import java.util.*;

public class Simulador {
    private List<String> nombres = Arrays.asList("Juan", "Maria", "Carlos", "Ana", "Luis");
    private List<String> apellidos = Arrays.asList("Gomez", "Perez", "Lopez", "Martinez", "Rodriguez");
    private List<String> dnis = generarDnis();

    public List<Alumno> generarAlumnos(int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            String nombreCompleto = nombre + " " + apellido;
            String dni = dnis.get(i);
            alumnos.add(new Alumno(nombreCompleto, Double.parseDouble(dni)));
        }

        return alumnos;
    }

    public List<String> generarDnis() {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String dni = String.format("%08d", random.nextInt(100000000));
            dnis.add(dni);
        }

        return dnis;
    }

    public void asignarNombresYDnis(List<Alumno> alumnos) {
        Random random = new Random();

        for (Alumno alumno : alumnos) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            alumno.setNombreCompleto(nombre);

            String dni = dnis.get(random.nextInt(dnis.size()));
            alumno.setDNI(Double.parseDouble(dni));
        }
    }

    public void realizarVotacion(List<Alumno> alumnos) {
        Random random = new Random();
        Set<Integer> votadosIndices = new HashSet<>(); // Para asegurarse de no votar al mismo alumno

        for (Alumno votante : alumnos) {
            Set<Integer> votados = new HashSet<>();

            while (votados.size() < 3) {
                int index = random.nextInt(alumnos.size());
                if (index != alumnos.indexOf(votante) && !votadosIndices.contains(index)) {
                    votados.add(index);
                }
            }

            votadosIndices.addAll(votados);
            for (int index : votados) {
                Alumno votado = alumnos.get(index);
                votado.incrementarVotos();
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
        for (int i = 0; i < 5; i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i + 1) + ". " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }

        System.out.println("Facilitadores Suplentes:");
        for (int i = 5; i < 10; i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i - 4) + ". " + alumno.getNombreCompleto() +
                    ", Votos recibidos: " + alumno.getCantidadDeVotos());
        }
    }
}
