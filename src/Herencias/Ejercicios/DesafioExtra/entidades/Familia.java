package Herencias.Ejercicios.DesafioExtra.entidades;

import Herencias.Ejercicios.DesafioExtra.Actividad.Main;

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
    private InformacionVivienda informacionVivienda;

    public Familia(String direccion, int IDE, int numLote, String barrio, String localidad, List<Integrante> integrantes, boolean factorRiesgo, boolean mejora) {
        this.direccion = direccion;
        this.IDE = IDE;
        this.numLote = numLote;
        this.barrio = barrio;
        this.localidad = localidad;
        this.integrantes = new ArrayList<>();
        this.factorRiesgo = false;
        this.informacionVivienda = new InformacionVivienda(mejora);
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

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public boolean isFactorRiesgo() {
        return factorRiesgo;
    }

    public void setFactorRiesgo(boolean factorRiesgo) {
        this.factorRiesgo = factorRiesgo;
    }

    public InformacionVivienda getInformacionVivienda() {
        return informacionVivienda;
    }

    public void setInformacionVivienda(InformacionVivienda informacionVivienda) {
        this.informacionVivienda = informacionVivienda;
    }

    public void agregarIntegrante(Integrante integrante) {
        this.integrantes.add(integrante);
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

    public void mostrarInformacion() {
        System.out.println("Información de la familia:");
        System.out.println("Dirección: " + direccion);
        System.out.println("IDE: " + IDE);
        System.out.println("Número de lote: " + numLote);
        System.out.println("Barrio: " + barrio);
        System.out.println("Localidad: " + localidad);
        System.out.println("Factor de riesgo: " + factorRiesgo);
        System.out.println("Mejora en el hogar: " + informacionVivienda.isMejora());
        System.out.println("Cantidad de integrantes: " + integrantes.size());
    }
}
