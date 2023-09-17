package Excepciones.Ejemplos.VisorDeTXTs;

import java.io.*;

public class VisorDeTXTs {
    public void mostrarTxt(String ruta) throws IOException {
        File rutaArchivo = new File(ruta);
        BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
        System.out.println(reader.readLine());
    }
}
