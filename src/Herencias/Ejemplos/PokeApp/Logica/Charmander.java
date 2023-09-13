package Herencias.Ejemplos.PokeApp.Logica;

public class Charmander extends Pokemon implements IFuego{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander aplica Placaje !!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander aplica Araniazo !!!");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander aplica Mordisco!!!");

    }


    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander aplica Punio Fuego!!!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander aplica Lanzallamas !!!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander aplica Ascuas !!!");
    }
}
