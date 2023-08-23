package Relaciones.Ejercicios.EjercicioExtra4.Entidades;

import java.util.List;

public class Voto {
    private Alumno alumnoVotante;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoVotante, List<Alumno> alumnosVotados) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
}