package Actividades.actividad07.Servicios;

import Actividades.actividad07.Entidades.Persona;

import java.util.Scanner;

public class PersonaServicios {
	Scanner scanner = new Scanner(System.in).useDelimiter("\n");

	public Persona crearPersona(){
		int edadStr;
		char sexoStr;
		double pesoStr;
		double alturaStr;

		// Validar el nombre
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		// Validar la edad
		int edad = validarEdad(scanner);

		// Validar el sexo
		char sexo = validarSexo(scanner);

		// Validar el peso
		double peso = validarPeso(scanner);

		// Validar la altura
		double altura = validarAltura(scanner);

		return new Persona(nombre,edad,sexo,peso,altura);
	}

	public int validarEdad(Scanner scanner){
		int edad;

		do {
			System.out.println("Ingrese la edad entre 1 y 90: ");
			edad = scanner.nextInt();

			if (edad < 1 || edad > 90) {
				System.out.println("La edad debe estar entre 1 y 90. Reintentar.");
			}
		} while (edad < 1 || edad > 90);

		return edad;
	}

	public char validarSexo(Scanner scanner){
		char sexo;

		do {
			System.out.println("Ingrese el sexo (M) Masculino, (F) Femenino, (O) Otro: ");
			sexo = scanner.next().toUpperCase().charAt(0);

			if (sexo != 'M' && sexo != 'F' && sexo != 'O') {
				System.out.println("El sexo debe ser M, F o O. Reintentar.");
			}
		} while (sexo != 'M' && sexo != 'F' && sexo != 'O');

		return sexo;
	}


	public double validarPeso(Scanner scanner){
		double peso;

		do {
			System.out.println("Ingrese el peso: ");
			peso = scanner.nextDouble();

			if (peso < 0) {
				System.out.println("El peso debe ser mayor a cero. Reintentar.");
			}
		} while (peso < 0);

		return peso;
	}

    public double validarAltura(Scanner scanner){
	    double altura;

	    do {
		    System.out.println("Ingrese la altura: ");
		    altura = scanner.nextDouble();

		    if (altura < 0) {
			    System.out.println("La altura debe ser mayor a cero. Reintentar.");
		    }
	    } while (altura < 0);

	    return altura;
    }
}
