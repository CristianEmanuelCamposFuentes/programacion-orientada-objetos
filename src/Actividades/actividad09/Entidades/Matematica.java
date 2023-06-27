package Actividades.actividad09.Entidades;

public class Matematica {
	private int numero1;
	private int numero2;

	public Matematica() {
	}

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	@Override
    public String toString() {
        return "Matematica [numero1=" + numero1 + ", numero2=" + numero2 + "]";
    }
}
