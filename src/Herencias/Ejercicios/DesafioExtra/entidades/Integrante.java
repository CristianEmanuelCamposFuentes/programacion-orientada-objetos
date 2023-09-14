package Herencias.Ejercicios.DesafioExtra.entidades;

public class Integrante extends  Persona{

    private int numOrden;



    public Integrante(String apellido, String nombre, String fechaNacimiento, int DNI, String sexo, String vinculo, int numOrden) {
        super(apellido, nombre, fechaNacimiento, DNI, sexo, vinculo);
        this.numOrden = numOrden;
    }

    public Integrante(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numOrden=" + numOrden +
                '}';
    }
}
