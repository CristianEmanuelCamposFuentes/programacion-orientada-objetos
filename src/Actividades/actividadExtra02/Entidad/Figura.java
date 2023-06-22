package Actividades.actividadExtra02.Entidad;

public class Figura {
	private int base;
	private int altura;
	private int radio;


	public Figura() {
	}

	public Figura(int base, int altura, int radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }


	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
    public String toString() {
        return "Figura [base=" + base + ", altura=" + altura + ", radio=" + radio + "]";
    }
}
