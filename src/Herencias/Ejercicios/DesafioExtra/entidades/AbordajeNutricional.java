package Herencias.Ejercicios.DesafioExtra.entidades;

public class AbordajeNutricional {


    private int ordenIntegrante;
    private int edad;
    private int peso;
    private boolean eutrofico;
    private boolean bajoPeso;
    private boolean sobrePeso;

    public AbordajeNutricional(int ordenIntegrante, int edad, int peso, boolean eutrofico, boolean bajoPeso, boolean sobrePeso) {
        this.ordenIntegrante = ordenIntegrante;
        this.edad = edad;
        this.peso = peso;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }

    public AbordajeNutricional() {
    }

    public int getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(int ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEutrofico() {
        return eutrofico;
    }

    public void setEutrofico(boolean eutrofico) {
        this.eutrofico = eutrofico;
    }

    public boolean isBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(boolean bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public boolean isSobrePeso() {
        return sobrePeso;
    }

    public void setSobrePeso(boolean sobrePeso) {
        this.sobrePeso = sobrePeso;
    }

    @Override
    public String toString() {
        return "AbordajeNutricional{" +
                "ordenIntegrante=" + ordenIntegrante +
                ", edad=" + edad +
                ", peso=" + peso +
                ", eutrofico=" + eutrofico +
                ", bajoPeso=" + bajoPeso +
                ", sobrePeso=" + sobrePeso +
                '}';
    }
}
