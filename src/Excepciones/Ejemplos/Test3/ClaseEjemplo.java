package Excepciones.Ejemplos.Test3;

import java.util.Scanner;

public class ClaseEjemplo {
    public static void main(String[] args) {
        int y,z;
        System.out.println("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        System.out.println("Resultado z: " + z);
        System.out.println("Fin del programa.");
    }
}
