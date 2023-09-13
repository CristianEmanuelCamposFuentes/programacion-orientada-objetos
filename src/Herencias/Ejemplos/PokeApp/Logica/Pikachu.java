package Herencias.Ejemplos.PokeApp.Logica;

public class Pikachu extends Pokemon implements IElectrico{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu aplica Placaje !!!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu aplica Araniazo!!!");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu aplica Mordisco!!!");

    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Pikachu aplica ImpacTrueno!!!");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Pikachu aplica PunioTrueno !!!");
    }
}
