package Herencias.Ejercicios.EjExtra01.Entidades;

public class Barco {
    private int matriculaBarco;
    private double esloraMetros;
    private int anioFabricacion;

    public Barco() {
    }

    public Barco(int matriculaBarco, double esloraMetros, int anioFabricacion) {
        this.matriculaBarco = matriculaBarco;
        this.esloraMetros = esloraMetros;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatriculaBarco() {
        return matriculaBarco;
    }

    public void setMatriculaBarco(int matriculaBarco) {
        this.matriculaBarco = matriculaBarco;
    }

    public double getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(double esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matriculaBarco=" + matriculaBarco +
                ", esloraMetros=" + esloraMetros +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }


    public double calcularModulo(){

        return esloraMetros * 10;
    }
}
