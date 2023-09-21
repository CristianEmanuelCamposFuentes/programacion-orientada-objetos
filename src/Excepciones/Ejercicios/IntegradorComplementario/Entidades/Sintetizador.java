package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class Sintetizador {
    private String mensaje;

    public Sintetizador() {
        this.mensaje = "";
    }

    public void susurrar(String mensaje) {
        this.mensaje = mensaje;
    }

    public String escuchar() {
        return mensaje;
    }
}
