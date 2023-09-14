package Herencias.Ejercicios.Ejercicio3.Actividad;

import Herencias.Ejercicios.Ejercicio3.Entidades.Electrodomestico;
import Herencias.Ejercicios.Ejercicio3.Entidades.Lavadora;
import Herencias.Ejercicios.Ejercicio3.Entidades.Televisor;

import java.util.ArrayList;
import java.util.List;

/*3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
public class Main {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        // Crear y agregar electrodomésticos a la lista
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        electrodomesticos.add(lavadora);
        electrodomesticos.add(televisor);

        // Calcular los precios finales y mostrarlos
        double precioTotal = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotal += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTelevisores += precioFinal;
            }

            System.out.println("Precio final del electrodoméstico: $" + precioFinal);
        }

        System.out.println("Precio total de todos los electrodomésticos: $" + precioTotal);
        System.out.println("Precio total de las lavadoras: $" + precioLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTelevisores);
    }
}
