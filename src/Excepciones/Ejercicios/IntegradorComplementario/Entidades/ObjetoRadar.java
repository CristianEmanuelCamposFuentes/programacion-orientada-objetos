package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class ObjetoRadar {
    private double coordenadaX;
    private double coordenadaY;
    private double coordenadaZ;
    private boolean esHostil;
    private double resistencia;

    public ObjetoRadar(double coordenadaX, double coordenadaY, double coordenadaZ, boolean esHostil, double resistencia) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.esHostil = esHostil;
        this.resistencia = resistencia;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public double getCoordenadaZ() {
        return coordenadaZ;
    }

    public boolean esHostil() {
        return esHostil;
    }

    public double getResistencia() {
        return resistencia;
    }
}
