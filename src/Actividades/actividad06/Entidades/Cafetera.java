package Actividades.actividad06.Entidades;

public class Cafetera {
    private int cantidadActual;
    private int capacidadMaxima;

    private int cantidadCafe;

    public Cafetera() {
    }

    public Cafetera(int cantidadActual, int capacidadMaxima) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadCafe = 10;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "cantidadActual=" + cantidadActual +
                ", capacidadMaxima=" + capacidadMaxima +
                ", cantidadCafe=" + cantidadCafe +
                '}';
    }
}
