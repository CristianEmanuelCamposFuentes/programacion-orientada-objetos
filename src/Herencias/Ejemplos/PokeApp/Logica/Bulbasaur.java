package Herencias.Ejemplos.PokeApp.Logica;

public class Bulbasaur extends Pokemon implements IHierba{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur aplica Placaje!!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur aplica Araniazo!!!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur aplica Mordisco!!!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ataque Drenaje!!!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ataque Paralizar !!!");
    }
}
