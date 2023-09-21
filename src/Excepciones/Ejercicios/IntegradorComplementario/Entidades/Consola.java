package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

public class Consola {
    private String mensaje;

    public Consola() {
        this.mensaje = "";
    }

    public void escribirMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String leerMensaje() {
        return mensaje;
    }
}
