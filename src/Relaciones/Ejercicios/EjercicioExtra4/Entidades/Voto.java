package Relaciones.Ejercicios.EjercicioExtra4.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Voto {
    private Alumno alumnoVotante;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = new ArrayList<>();
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }
    // Metodo para agregar cada voto del alumno votante
    public void agregarVoto(Alumno alumnoVotado) {
        alumnosVotados.add(alumnoVotado);
    }
}