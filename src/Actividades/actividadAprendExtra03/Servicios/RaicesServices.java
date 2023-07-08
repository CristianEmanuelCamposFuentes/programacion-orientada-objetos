package Actividades.actividadAprendExtra03.Servicios;

import Actividades.actividadAprendExtra03.Entidad.Raices;

public class RaicesServices {
    public double getDiscriminante(Raices objeto){
        System.out.println("Calculando el discriminante...");
        return (Math.pow(objeto.getB(),2))- (4 * objeto.getA() * objeto.getC() * objeto.getC());
    }

    public boolean tieneRaices(Raices objeto) {
        System.out.println("Evaluando si tiene raices...");
        // Aca utilizo el this, para hacer referencia a esta clase llamada RaicesServices.
        //return this.getDiscriminante(objeto);
        /* *Por ejemplo , en vez de crear una instancia aca de esta misma clase de RaicesServices, de la forma:
        *  RaicesServices nombreServicioCualquiera = new RaicesServices();
        * Y despues usarla aca adentro de la manera:
        *  return nombreServicioCualquiera.getDiscriminate(objeto) >= 0;
        *  Se puede resumir de esta forma. Por lo tanto , hace referencia al contexto donde estamos actuando a nivel general
        *  otro ejemplo es el "this" que usamos en los constructores de cualquier clase, que esa palabra hace referencia a los atributos que
        * se encuentran afuera de ese constructor y se refiere a las variables que son los atributos de la clase.
        * */
        // Retorno el resultado de invocar la funcion getDiscriminate(Raices objeto), una vez que tengo el valor, recien ahi lo compara con el cero , y dependiendo de esa comparacion, da verdadero o falso.
        // Veo que en Java tambien interpreta el mismo contexto sin usar el this, lo dejo en comentarios para fines informativos
        return getDiscriminante(objeto) >= 0;
    }

    public boolean tieneRaiz(Raices objeto) {
        System.out.println("Evaluando si posee una unica raiz...");
        return getDiscriminante(objeto) == 0;
    }



}
