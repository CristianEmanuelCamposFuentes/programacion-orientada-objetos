package Actividades.actividadExtra02.Servicios;

import Actividades.actividadExtra02.Entidad.Figura;

public class FiguraServicios {
	public Figura crearFigura() {

		return new Figura();
	}

	public void validarOpcion(int opcionElegida){
		switch (opcionElegida){
			case 1:
                return crearFigura();
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
		}
	}

	public int calcularArea(Figura figuraGeometrica){
		return area;
	}

	public int calcularPerimetro(Figura figuraGeometrica){
        return perimetro;
    }
}
