package Colecciones.Videos.Video1.mascotaApp;

public class MascotaApp {
	public static void main(String[] args) {
		String[]nombresArray = new String[5];

		for (int i = 0; i < nombresArray.length; i++){
			nombresArray[i] = "Chiquito" + (i+1);
		}

		for (String variable : nombresArray){
			System.out.println(variable);
		}
	}
}
