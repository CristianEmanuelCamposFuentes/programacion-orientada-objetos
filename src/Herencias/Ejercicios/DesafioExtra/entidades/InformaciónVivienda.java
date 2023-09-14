package Herencias.Ejercicios.DesafioExtra.entidades;

public class InformaciónVivienda {


    private int numDormitorios;
    private String tipoParedes;
    private String tipoPiso;
    private boolean iluminacion;


    public InformaciónVivienda(int numDormitorios, String tipoParedes, String tipoPiso, boolean iluminacion) {
        this.numDormitorios = numDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.iluminacion = iluminacion;
    }

    public InformaciónVivienda() {
    }

    public int getNumDormitorios() {
        return numDormitorios;
    }

    public void setNumDormitorios(int numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public String getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(String tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    @Override
    public String toString() {
        return "InformaciónVivienda{" +
                "numDormitorios=" + numDormitorios +
                ", tipoParedes='" + tipoParedes + '\'' +
                ", tipoPiso='" + tipoPiso + '\'' +
                ", iluminacion=" + iluminacion +
                '}';
    }
}
