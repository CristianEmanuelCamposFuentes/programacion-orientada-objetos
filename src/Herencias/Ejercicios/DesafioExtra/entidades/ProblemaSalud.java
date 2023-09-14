package Herencias.Ejercicios.DesafioExtra.entidades;

public class ProblemaSalud {


    private boolean HTA;
    private boolean DBT;
    private int ordenIntegrante;
    private int IDE;


    public ProblemaSalud(boolean HTA, boolean DBT, int ordenIntegrante, int IDE) {
        this.HTA = HTA;
        this.DBT = DBT;
        this.ordenIntegrante = ordenIntegrante;
        this.IDE = IDE;
    }

    public ProblemaSalud() {
    }

    public boolean isHTA() {
        return HTA;
    }

    public void setHTA(boolean HTA) {
        this.HTA = HTA;
    }

    public boolean isDBT() {
        return DBT;
    }

    public void setDBT(boolean DBT) {
        this.DBT = DBT;
    }

    public int getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(int ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public int getIDE() {
        return IDE;
    }

    public void setIDE(int IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "ProblemaSalud{" +
                "HTA=" + HTA +
                ", DBT=" + DBT +
                ", ordenIntegrante=" + ordenIntegrante +
                ", IDE=" + IDE +
                '}';
    }
}
