package Herencias.Ejercicios.DesafioExtra.entidades;


import java.util.ArrayList;
import java.util.List;

public class Integrante extends Persona{
        private int numOrden;
        private String categoria; // Niño, Joven, Adulto, AdultoMayor
        private List<ProblemaSalud> problemasSalud;
        private List<AbordajeNutricional> abordajesNutricionales;

        public Integrante(String apellido, String nombre, String fechaNacimiento, int DNI, String sexo, String vinculo, int numOrden, String categoria) {
            super(apellido, nombre, fechaNacimiento, DNI, sexo, vinculo);
            this.numOrden = numOrden;
            this.categoria = categoria;
            this.problemasSalud = new ArrayList<>();
            this.abordajesNutricionales = new ArrayList<>();
        }

    public Integrante(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<ProblemaSalud> getProblemasSalud() {
        return problemasSalud;
    }

    public void setProblemasSalud(List<ProblemaSalud> problemasSalud) {
        this.problemasSalud = problemasSalud;
    }

    public List<AbordajeNutricional> getAbordajesNutricionales() {
        return abordajesNutricionales;
    }

    public void setAbordajesNutricionales(List<AbordajeNutricional> abordajesNutricionales) {
        this.abordajesNutricionales = abordajesNutricionales;
    }

    public void agregarProblemaSalud(ProblemaSalud problemaSalud) {
        this.problemasSalud.add(problemaSalud);
    }

    public void agregarAbordajeNutricional(AbordajeNutricional abordajeNutricional) {
        this.abordajesNutricionales.add(abordajeNutricional);
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numOrden=" + numOrden +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
