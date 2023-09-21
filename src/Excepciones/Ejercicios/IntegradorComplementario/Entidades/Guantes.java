package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class Guantes {
    private String tipo;
    private float consumoEnergia;

    public Guantes(String tipo, float consumoEnergia) {
        this.tipo = tipo;
        this.consumoEnergia = consumoEnergia;
    }

    public String getTipo() {
        return tipo;
    }

    public float getConsumoEnergia() {
        return consumoEnergia;
    }

    public float usar(int intensidad, int tiempo) {
        // Verificar que la intensidad y el tiempo sean válidos (no negativos)
        if (intensidad >= 0 && tiempo >= 0) {
            float energiaConsumida = consumoEnergia * intensidad * tiempo;
            // Verificar que no se haya consumido más energía de la disponible
            if (energiaConsumida <= 100) {
                return energiaConsumida;
            } else {
                // Lanzar una excepción si se supera el límite de energía
                throw new IllegalStateException("Consumo de energía excesivo.");
            }
        } else {
            // Lanzar una excepción si los valores no son válidos
            throw new IllegalArgumentException("Intensidad y tiempo deben ser no negativos.");
        }
    }
}