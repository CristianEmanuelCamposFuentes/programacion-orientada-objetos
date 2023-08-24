package Relaciones.Ejercicios.EjercicioExtra4.Entidades;

public class Alumno {
    private String nombreCompleto;
    private double DNI;
    private int cantidadDeVotos;

    public Alumno(String nombreCompleto, double DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadDeVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    // Incrementar votos
    public void incrementarVotos() {
        cantidadDeVotos++;
    }

    public String getFormattedDNI(){
        return String.format("%.0f", DNI);
    }
    @Override
    public String toString() {
        return "Alumno : {" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", DNI=" + getFormattedDNI() +
                ", cantidadDeVotos=" + cantidadDeVotos +
                '}'+ '\n' ;
    }
}
