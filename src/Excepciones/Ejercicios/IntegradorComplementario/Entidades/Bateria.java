package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class Bateria {
    private float cargaMaxima;
    private float cargaActual;

    public Bateria(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaMaxima; // Inicialmente, la carga actual es igual a la carga máxima
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void cargarBateria(float cantidad) {
        // Verificar si la cantidad a cargar es válida (no puede ser negativa)
        if (cantidad >= 0) {
            // Verificar si la carga actual no supera la carga máxima
            if (cargaActual + cantidad <= cargaMaxima) {
                cargaActual += cantidad;
            } else {
                cargaActual = cargaMaxima; // La carga actual no puede superar la carga máxima
            }
        }
    }

    public void consumirEnergia(float cantidad) {
        // Verificar si la cantidad a consumir es válida (no puede ser negativa)
        if (cantidad >= 0) {
            // Verificar si hay suficiente carga actual para consumir
            if (cargaActual >= cantidad) {
                cargaActual -= cantidad;
            } else {
                // No hay suficiente carga, lanzar una excepción
                throw new IllegalStateException("La batería no tiene suficiente carga.");
            }
        }
    }

    public float obtenerPorcentajeCarga() {
        return (cargaActual / cargaMaxima) * 100;
    }
}
