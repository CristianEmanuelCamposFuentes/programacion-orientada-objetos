package Colecciones.Videos.Video1.mascotaApp;

import java.util.ArrayList;

public class MascotaApp {
	public static void main(String[] args) {
		String[]nombresArray = new String[5];

		// Arrays
		for (int i = 0; i < nombresArray.length; i++){
			nombresArray[i] = "Chiquito" + (i+1);
		}

		for (String variable : nombresArray){
			System.out.println(variable);
		}

		// Collections
		System.out.println("ArrayList:");
		ArrayList<String> nombresArrayList = new ArrayList<>();

		// Agregar elementos
		nombresArrayList.add("Chiquito");
		nombresArrayList.add("Chiquito");
		nombresArrayList.add("Chiquito");
		nombresArrayList.add("Chiquito");
		nombresArrayList.add("Chiquito");

		// Mostrar ArrayList
		System.out.println(nombresArrayList);

		System.out.println("Tamanio de la ArrayList:");
		System.out.println(nombresArrayList.size()); // 5

		// Eliminar elemento por index
		nombresArrayList.remove(4);

		// Eliminar elemento por objeto (En este caso "String")
		nombresArrayList.remove("Chiquito");
		System.out.println(nombresArrayList);
		System.out.println(nombresArrayList.size()); // 3

	}
}
