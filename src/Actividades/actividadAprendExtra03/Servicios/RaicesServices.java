package Actividades.actividadAprendExtra03.Servicios;
//3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//        ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//        Hay que insertar estos 3 valores para construir el objeto a través de un método
//        constructor. Luego, las operaciones que se podrán realizar son las siguientes:
//         Método getDiscriminante(): devuelve el valor del discriminante (double). El
//        discriminante tiene la siguiente formula: (b^2)-4*a*c
//         Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//        que esto ocurra, el discriminante debe ser mayor o igual que 0.
//         Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//        que esto ocurra, el discriminante debe ser igual que 0.
//         Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//        posibles soluciones.
//         Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//        Es en el caso en que se tenga una única solución posible.
//         Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//        de no existir solución, se mostrará un mensaje.
//
//        Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//        delante de -b
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
        /*
         Retorno el resultado de invocar la funcion getDiscriminate(Raices objeto), una vez que tengo el valor, recien ahi lo compara con el cero , y dependiendo de esa comparacion, da verdadero o falso.
         Veo que en Java tambien interpreta el mismo contexto sin usar el this, lo dejo en comentarios para fines informativos
        */
        return getDiscriminante(objeto) >= 0;
    }

    public boolean tieneRaiz(Raices objeto) {
        System.out.println("Evaluando si posee una unica raiz...");
        return getDiscriminante(objeto) == 0;
    }



}
