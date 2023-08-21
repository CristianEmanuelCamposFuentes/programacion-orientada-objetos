package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cuota;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Poliza;

import java.util.ArrayList;
import java.util.List;

public class ServicioPoliza {
    private List<Poliza> polizas;

    public ServicioPoliza() {
        polizas = new ArrayList<>();
    }

    public void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }

    public List<Poliza> obtenerPolizas() {
        return polizas;
    }

    public void agregarCuotaAPoliza(Poliza poliza, Cuota cuota) {
        poliza.agregarCuota(cuota);
    }
}
