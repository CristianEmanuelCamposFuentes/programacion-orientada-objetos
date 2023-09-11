package Herencias.Ejercicios.EjExtra01.Entidades;

public class YateLujo extends Barco{
    private int camarotes;
    private double potenciaCv;


    public YateLujo(int matriculaBarco, double esloraMetros, int anioFabricacion, int camarotes, double potenciaCv) {
        super(matriculaBarco, esloraMetros, anioFabricacion);
        this.camarotes = camarotes;
        this.potenciaCv = potenciaCv;


    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(double potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCv + camarotes;
    }
}
