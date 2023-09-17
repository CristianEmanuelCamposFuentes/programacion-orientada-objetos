package Excepciones.Ejemplos.Test3;

public class Calculadora {
    public int factorial(int num){
        if(num < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
        }
        if(num > 12) {
            throw new IllegalArgumentException("Por limitaciones tecnicas, no se puede calcular el factorial de enteros mayores a 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact += fact * i;
        }
        return fact;
    }
}
