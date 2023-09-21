package Excepciones.Ejercicios.IntegradorComplementario.Servicios;

import Excepciones.Ejercicios.IntegradorComplementario.Entidades.Armadura;
import Excepciones.Ejercicios.IntegradorComplementario.Entidades.ObjetoRadar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JARVIS {
    private Armadura armadura; // Referencia a la instancia de Armadura
    private List<ObjetoRadar> radar;

    public JARVIS(Armadura armadura) {
        this.armadura = armadura;
        this.radar = new ArrayList<>();
    }

    public void caminar(int intensidad, int tiempo) {
        try {
            float consumo = armadura.getBotas().usar(intensidad, tiempo);
            armadura.getBateria().consumirEnergia(consumo);
        } catch (IllegalArgumentException | IllegalStateException e) {
            armadura.getConsola().escribirMensaje(e.getMessage());
        }
    }

    public void disparar(int intensidad, int tiempo) {
        try {
            float consumo = armadura.getGuantes().usar(intensidad, tiempo);
            armadura.getBateria().consumirEnergia(consumo);
        } catch (IllegalArgumentException | IllegalStateException e) {
            armadura.getConsola().escribirMensaje(e.getMessage());
        }
    }

    public void agregarObjetoRadar() {
        Random rand = new Random();
        double coordenadaX = rand.nextDouble() * 1000;
        double coordenadaY = rand.nextDouble() * 1000;
        double coordenadaZ = rand.nextDouble() * 1000;
        boolean esHostil = rand.nextBoolean();
        double resistencia = rand.nextDouble() * 100;

        ObjetoRadar objeto = new ObjetoRadar(coordenadaX, coordenadaY, coordenadaZ, esHostil, resistencia);
        radar.add(objeto);
    }

    public void atacarEnemigos() {
        for (ObjetoRadar objeto : radar) {
            if (armadura.getGenerador().estaActivo() && !objeto.esHostil() && armadura.getBateria().getCargaActual() >= 10) {
                disparar(1, 1);
                objeto.recibirDanio(10);
            }
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de la armadura:");
        System.out.println("Carga de la batería: " + armadura.getBateria().obtenerPorcentajeCarga() + "%");
        System.out.println("Generador activo: " + armadura.getGenerador().estaActivo());
        System.out.println("Mensaje de la consola: " + armadura.getConsola().leerMensaje());
        System.out.println("Mensaje del sintetizador: " + armadura.getSintetizador().escuchar());
        System.out.println("Objetos detectados por el radar:");
        for (ObjetoRadar objeto : radar) {
            System.out.println("Coordenadas: (" + objeto.getCoordenadaX() + ", " + objeto.getCoordenadaY() + ", " + objeto.getCoordenadaZ() + ")");
            System.out.println("Hostil: " + objeto.esHostil());
            System.out.println("Resistencia: " + objeto.getResistencia());
        }
    }

    public void activarGenerador() {
        armadura.getGenerador().activarGenerador();
    }

    public void desactivarGenerador() {
        armadura.getGenerador().desactivarGenerador();
    }
}
