package Excepciones.Ejemplos.VisorDeTXTs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        try {
            v.mostrarTxt("C:\\Users\\crist\\IdeaProjects\\programacion-orientada-objetos\\src\\Excepciones\\Ejemplos\\VisorDeTXTs\\mensaje_oculto.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no fue encontrado.");
        } catch (IOException ex) {
            System.out.println("Error de E/S.");
            System.out.println(ex.getMessage());
        }
    }
}
