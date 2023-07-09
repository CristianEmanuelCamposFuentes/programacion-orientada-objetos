package Actividades.actividadAprendExtra03.Servicios;

import Actividades.actividadAprendExtra03.Entidad.Raices;

import java.util.ArrayList;
import java.util.List;

public class RaicesServices {
    public double getDiscriminante(Raices objeto){
        System.out.println("Calculando el discriminante...");
        return (Math.pow(objeto.getB(),2))- (4 * objeto.getA() * objeto.getC() * objeto.getC());
    }

    public boolean tieneRaices(Raices objeto) {
        System.out.println("Evaluando si tiene raices...");
        // Aca utilizo el this, para hacer referencia a esta clase llamada RaicesServices.
        //! return this.getDiscriminante(objeto);
        /* *Por ejemplo , en vez de crear una instancia aca de esta misma clase de RaicesServices, de la forma:
        *  RaicesServices nombreServicioCualquiera = new RaicesServices();
        * Y despues usarla aca adentro de la manera:
        *  return nombreServicioCualquiera.getDiscriminate(objeto) >= 0;
        *  Se puede resumir de esta forma. Por lo tanto , hace referencia al contexto donde estamos actuando a nivel general
        *  otro ejemplo es el "this" que usamos en los constructores de cualquier clase, que esa palabra hace referencia a los atributos que
        * se encuentran afuera de ese constructor y se refiere a las variables que son los atributos de la clase.
        * */
        /*
         Retorno el resultado de invocar la funcion getDiscriminate(Raices objeto), una vez que tengo el valor, recien ahi lo compara con el cero , y dependiendo de esa comparacion, da verdadero o falso.
         Veo que en Java tambien interpreta el mismo contexto sin usar el this, lo dejo en comentarios para fines informativos,
         pero queda a criterio de cada uno el usar el this o no en estos casos que es opcional.
        */
        return getDiscriminante(objeto) >= 0;
    }

    public boolean tieneRaiz(Raices objeto) {
        System.out.println("Evaluando si posee una unica raiz...");
        return getDiscriminante(objeto) == 0;
    }

    public void obtenerRaices(Raices objeto) {
        // Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
        // delante de -b
        // LLama a tiene raices, y si es true, imprimir ambas soluciones
        if(tieneRaices(objeto)){

            System.out.println("Obteniendo raices...");
            // Recordar que la formula es lo mismo que decir :
            // -b (+-) raiz del discriminante / (2*a), llevado a codigo es de la forma
            double discriminante = getDiscriminante(objeto);
            // Cada raiz se utiliza diferenciando el signo en cada calculo
            // Primera raiz = -b + raiz del discriminante / (2*a)
            double raiz1 = (-objeto.getB() + Math.sqrt(discriminante))/ (2 * objeto.getA());

            // Segunda raiz = -b - raiz del discriminante / (2*a), es decir
            double raiz2 = (-objeto.getB() - Math.sqrt(discriminante))/ (2 * objeto.getA());

            // Creo un arrayLyst vacia, para ubicar las dos variables de tipo double e imprimirlas.
            List<Double> raices = new ArrayList<>();
            // A la lista raices le agrego la raiz 1 con el metodo add();
            raices.add(raiz1);
            // Agrego la segunda raiz, raiz2
            raices.add(raiz2);

            System.out.println("Las raices de la ecuacion de segundo grado son: " + raices);

        } else {
            // Caso contrario de que no existan dos raices, avisa por pantalla
            System.out.println("La ecuacion de segundo no posee dos raices.");
        }
    }

    public void obtenerRaiz(Raices objeto){
        // Evaluando si tiene una sola raiz
        if(tieneRaiz(objeto)){
            // Cuando tiene una sola raiz sabemos que el discriminate es 0, por lo tanto queda
            // la ecuacion (-b)/(2*a)
            // Utilizo (double) para que no se redondee la division de enteros
            double raizUnica = (double) (-objeto.getB())/ (2*objeto.getA());
            System.out.println("La ecuacion de segundo tiene la raiz: " + raizUnica);
        } else {
            System.out.println("La ecuacion de segundo grado no tiene una sola raiz");
        }
    }

    public void calcular(Raices objeto){
        // Evaluar si tiene dos raices, pasar resultado
        if(tieneRaices(objeto)){
            System.out.println("La ecuacion de segundo posee dos raices.");
            obtenerRaices(objeto);
            // Evaluar si tiene una raiz como solucion, y mostrarla
        } else if (tieneRaiz(objeto)) {
            obtenerRaiz(objeto);
        } else {
            System.out.println("No hay soluciones para la ecuacion determinada.");
        }
    }


}
