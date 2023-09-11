package Herencias.Ejercicios.EjExtra01.Entidades;

public class Velero extends Barco{
    private int numeroMastiles;

    public Velero(int matriculaBarco, double esloraMetros, int anioFabricacion, int numeroMastiles) {
        super(matriculaBarco, esloraMetros, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroMastiles=" + numeroMastiles +
                '}';
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}