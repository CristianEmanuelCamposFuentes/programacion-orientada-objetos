package Herencias.Ejercicios.DesafioExtra.entidades;

public class Persona {


    private String apellido;
    private String nombre;
    private String fechaNacimiento;
    private int DNI;
    private String sexo;
    private String vinculo;

    public Persona(String apellido, String nombre, String fechaNacimiento, int DNI, String sexo, String vinculo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.vinculo = vinculo;
    }

    public Persona() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", DNI=" + DNI +
                ", sexo='" + sexo + '\'' +
                ", vinculo='" + vinculo + '\'' +
                '}';
    }
}
