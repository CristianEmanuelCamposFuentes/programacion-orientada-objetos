package Herencias.Ejemplos.PokeApp.Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        System.out.println("Inicio del programa:");

        // Creacion de los Pokemons
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarParalizar();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();

        System.out.println("Final del programa.");
    }
}
