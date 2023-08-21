package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Poliza;
import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Vehiculo;

import java.util.HashMap;
import java.util.Map;

public class ServicioVehiculo {
    private Map<Vehiculo, Poliza> vehiculosConPoliza;

    public ServicioVehiculo() {
        vehiculosConPoliza = new HashMap<>();
    }

    public void asociarPolizaAVehiculo(Vehiculo vehiculo, Poliza poliza) {
        vehiculosConPoliza.put(vehiculo, poliza);
    }

    public Poliza obtenerPolizaDeVehiculo(Vehiculo vehiculo) {
        return vehiculosConPoliza.get(vehiculo);
    }
}
