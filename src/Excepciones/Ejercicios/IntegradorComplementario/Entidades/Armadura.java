package Excepciones.Ejercicios.IntegradorComplementario.Entidades;

import Excepciones.Ejercicios.IntegradorComplementario.Servicios.JARVIS;

public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private Bateria bateria;
    private Generador generador;
    private Guantes guantes;
    private Botas botas;
    private Consola consola;
    private Sintetizador sintetizador;
    private ObjetoRadar[] radar;
    private JARVIS jarvis; // Referencia a la instancia de JARVIS

    public Armadura(String colorPrimario, String colorSecundario) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = 100;
        this.nivelSalud = 100;
        this.bateria = new Bateria();
        this.generador = new Generador();
        this.guantes = new Guantes();
        this.botas = new Botas();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
        this.radar = new ObjetoRadar[10]; // Capacidad inicial del radar
        this.jarvis = new JARVIS(this); // Inicializar la instancia de JARVIS con referencia a la armadura
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public ObjetoRadar[] getRadar() {
        return radar;
    }

    public void setRadar(ObjetoRadar[] radar) {
        this.radar = radar;
    }

    public JARVIS getJarvis() {
        return jarvis;
    }

    public void setJarvis(JARVIS jarvis) {
        this.jarvis = jarvis;
    }
}
