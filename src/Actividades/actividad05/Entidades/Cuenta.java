package Actividades.actividad05.Entidades;

public class Cuenta {
	private int numeroCuenta;
	private long DNI;
	private int saldoActual;


	public Cuenta(){
	}
	public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDni() {
		return DNI;
	}

	public void setDni(long DNI) {
		this.DNI = DNI;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public String toString() {
		return "Cuenta [Numero de cuenta =" + numeroCuenta + " , DNI Cliente =  " + DNI + ",Saldo actual = " + saldoActual + "]";
	}
}
