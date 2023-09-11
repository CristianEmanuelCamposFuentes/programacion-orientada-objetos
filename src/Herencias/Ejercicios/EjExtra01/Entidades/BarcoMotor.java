package Herencias.Ejercicios.EjExtra01.Entidades;

public class BarcoMotor extends Barco{
    private double potenciaCv;

    public BarcoMotor(int matriculaBarco, double esloraMetros, int anioFabricacion, double potenciaCv) {
        super(matriculaBarco, esloraMetros, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCv;
    }
}
