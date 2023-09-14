package Herencias.Ejercicios.DesafioExtra.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Familia {


    private String direccion;
    private int IDE;
    private int numLote;
    private String barrio;
    private String localidad;
    private List<Integrante> integrantes;
    private boolean factorRiesgo;


    Scanner leer = new Scanner(System.in);

    public Familia(String direccion, int IDE, int numLote, String barrio, String localidad) {
        this.direccion = direccion;
        this.IDE = IDE;
        this.numLote = numLote;
        this.barrio = barrio;
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIDE() {
        return IDE;
    }

    public void setIDE(int IDE) {
        this.IDE = IDE;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "direccion='" + direccion + '\'' +
                ", IDE=" + IDE +
                ", numLote=" + numLote +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    public int cantidadFactores() {

        List<Integer> factores = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            factores.add(random.nextInt(13));


        }

        int cantFactores = factores.size();
         return  cantFactores;



    }

    public void tieneFactoresRiesgo(){

        if(factorRiesgo){

            System.out.println(cantidadFactores());
        }else {
            boolean mejora;
            System.out.println("La familia tiene mejoras en su hogar?  Verdadero o Falso");
            mejora = leer.nextBoolean();

        }

    }


}
