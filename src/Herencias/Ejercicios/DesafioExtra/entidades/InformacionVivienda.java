package Herencias.Ejercicios.DesafioExtra.entidades;

public class InformacionVivienda {
    private int numDormitorios;
    private String tipoParedes;
    private String tipoPiso;
    private boolean iluminacion;
    private boolean mejora;

    public InformacionVivienda(int numDormitorios, String tipoParedes, String tipoPiso, boolean iluminacion, boolean mejora) {
        this.numDormitorios = numDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.iluminacion = iluminacion;
        this.mejora = mejora;
    }

    public InformacionVivienda() {
        // Constructor por defecto, inicializa el número de dormitorios en 0
        this.numDormitorios = 0;
    }

    public InformacionVivienda(boolean mejora) {
        this(); // Llama al constructor por defecto para inicializar numDormitorios
        this.mejora = mejora;
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

    public boolean isMejora() {
        return mejora;
    }

    public void setMejora(boolean mejora) {
        this.mejora = mejora;
    }

    @Override
    public String toString() {
        return "InformaciónVivienda{" +
                "numDormitorios=" + numDormitorios +
                ", tipoParedes='" + tipoParedes + '\'' +
                ", tipoPiso='" + tipoPiso + '\'' +
                ", iluminacion=" + iluminacion +
                ", mejora=" + mejora +
                '}';
    }
}

