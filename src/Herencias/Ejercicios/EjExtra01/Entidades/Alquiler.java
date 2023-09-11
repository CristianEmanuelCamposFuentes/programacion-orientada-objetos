package Herencias.Ejercicios.EjExtra01.Entidades;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private String nombre;
    private int documentoCliente;
    private LocalDate fechaAlquier;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquier() {
        return fechaAlquier;
    }

    public void setFechaAlquier(LocalDate fechaAlquier) {
        this.fechaAlquier = fechaAlquier;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", documentoCliente=" + documentoCliente +
                ", fechaAlquier=" + fechaAlquier +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicionAmarre=" + posicionAmarre +
                ", barco=" + barco +
                '}';
    }

    public Alquiler(String nombre, int documentoCliente, LocalDate fechaAlquier, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquier = fechaAlquier;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;


    }

    //Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    //alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    //multiplicando por 10 los metros de eslora).
    public double calcularAlquier() {
        Long aux = DAYS.between(getFechaAlquier(), getFechaDevolucion());
        //double moduloBarco = barco.getEsloraMetros()*10;
        double moduloBarco = barco.calcularModulo();
        double precioFinal = moduloBarco * aux;

        return precioFinal;
    }
}
