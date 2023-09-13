package Herencias.Ejemplos.PokeApp.Logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    // En las interfaces no es necesario agregar abstract a los metodos, ya lo son por defecto
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
