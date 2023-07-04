package Actividades.actividad13.Entidades;

import java.util.Arrays;

public class Curso {
	private String nombreCurso;
	private int cantHorasPorDia;
	private int cantDiasPorSemana;
	private String turno;
	private double precioPorHora;
	private String[] alumnos= new String[5];


	public Curso(){
	}


	public Curso(String nombreCurso, int cantHorasPorDia, int cantDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
		this.nombreCurso = nombreCurso;
		this.cantHorasPorDia = cantHorasPorDia;
		this.cantDiasPorSemana = cantDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}


	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantHorasPorDia() {
		return cantHorasPorDia;
	}

	public void setCantHorasPorDia(int cantHorasPorDia) {
		this.cantHorasPorDia = cantHorasPorDia;
	}

	public int getCantDiasPorSemana() {
		return cantDiasPorSemana;
	}

	public void setCantDiasPorSemana(int cantDiasPorSemana) {
		this.cantDiasPorSemana = cantDiasPorSemana;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}


	@Override
	public String toString() {
		return "Curso{" +
				"nombreCurso='" + nombreCurso + '\'' +
				", cantHorasPorDia=" + cantHorasPorDia +
				", cantDiasPorSemana=" + cantDiasPorSemana +
				", turno='" + turno + '\'' +
				", precioPorHora=" + precioPorHora +
				", alumnos=" + Arrays.toString(alumnos) +
				'}';
	}
}
