package Relaciones.Ejercicios.EjercicioExtra1.Ejercicio;

import Relaciones.Ejercicios.EjercicioExtra1.Servicios.PersonaPerroServices;

import java.util.Scanner;

/*
*
1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
* */
public class Main {
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {

		PersonaPerroServices PPS = new PersonaPerroServices();

		PPS.mostrarMenu();


		System.out.println("Finalizando programa.");

	}
}
