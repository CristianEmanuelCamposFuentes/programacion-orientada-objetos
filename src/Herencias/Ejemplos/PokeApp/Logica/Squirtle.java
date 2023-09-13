package Herencias.Ejemplos.PokeApp.Logica;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle aplica Placaje !!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle aplica Araniazo!!!");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle aplica Mordisco !!!");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle aplica Hidrobomba!!!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle aplica Burbuja !!!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle aplica Pistola de Agua !!!");
    }
}
