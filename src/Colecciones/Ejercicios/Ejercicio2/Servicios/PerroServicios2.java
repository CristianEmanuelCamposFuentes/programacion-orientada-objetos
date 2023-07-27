package Colecciones.Ejercicios.Ejercicio2.Servicios;

import Colecciones.Ejercicios.Ejercicio1.Ejercicio.Ejercicio1;

import java.util.ArrayList;

public class PerroServicios2 {

		public ArrayList<String> razasPerros = new ArrayList<>();

		public void agregarRaza(){

			String razaNueva = Ejercicio1.lector.next();
			razasPerros.add(razaNueva);
			System.out.println(razasPerros);
		}

		public int preguntar(){
			System.out.println("Desea continuar agregando razas? SI (1) - NO (0) ");
			return Ejercicio1.lector.nextInt();
		}

		@Override
		public String toString() {
			return "PerroServicios{" +
					"razasPerros=" + razasPerros +
					'}';
		}
}
