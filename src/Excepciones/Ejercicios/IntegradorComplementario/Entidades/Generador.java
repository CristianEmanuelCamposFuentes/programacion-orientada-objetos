package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class Generador {
    private boolean activo;

    public Generador() {
        this.activo = false; // El generador comienza desactivado
    }

    public void activarGenerador() {
        activo = true;
    }

    public void desactivarGenerador() {
        activo = false;
    }

    public boolean estaActivo() {
        return activo;
    }
}
