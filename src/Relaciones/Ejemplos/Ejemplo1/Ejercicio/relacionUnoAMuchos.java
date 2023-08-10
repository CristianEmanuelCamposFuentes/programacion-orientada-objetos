package Relaciones.Ejemplos.Ejemplo1.Ejercicio;

import Relaciones.Ejemplos.Ejemplo1.Entidades.Alumno;
import Relaciones.Ejemplos.Ejemplo1.Entidades.Curso;
import Relaciones.Ejemplos.Ejemplo1.Entidades.Profesor;

public class relacionUnoAMuchos {
	public static void main(String[] args) {
		System.out.println("Inicio del programa: ");
		Profesor luisa = new Profesor();
		luisa.setNombre("Luisa");
		luisa.setApellido("Rodriguez");

		Alumno lucia = new Alumno();
		lucia.setNombre("Lucia");
		lucia.setApellido("Rondon");

		Alumno marielby = new Alumno();
		marielby.setNombre("Marielby");
		marielby.setApellido("Quijada");

		Alumno taba = new Alumno();
		taba.setNombre("Cristian");
		taba.setApellido("Campos");

		Curso cursoChisme = new Curso();
		cursoChisme.setProfesor(luisa);
		cursoChisme.getAlumnos().add(lucia);
		cursoChisme.getAlumnos().add(marielby);
		cursoChisme.getAlumnos().add(taba);

		System.out.println(cursoChisme);
	}
}
