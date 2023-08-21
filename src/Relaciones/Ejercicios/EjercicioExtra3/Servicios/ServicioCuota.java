package Relaciones.Ejercicios.EjercicioExtra3.Servicios;

import Relaciones.Ejercicios.EjercicioExtra3.Entidades.Cuota;

public class ServicioCuota {
    public void marcarCuotaComoPagada(Cuota cuota) {
        cuota.setPagada(true);
    }
}
