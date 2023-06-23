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

		//Validar la edad
		edadStr = validarEdad(scanner);
		int edad = Integer.parseInt(String.valueOf(edadStr));

		// Validar el sexo
		sexoStr = validarSexo(scanner);
		char sexo = sexoStr;

		// Validar el peso
		System.out.println("Ingrese el peso: ");
		pesoStr = Double.parseDouble(validarPeso(scanner));
		double peso = Double.parseDouble(String.valueOf(pesoStr));

		// Validar la altura
        System.out.println("Ingrese la altura: ");
		alturaStr = Double.parseDouble(validarAltura(scanner));
		double altura = Double.parseDouble(String.valueOf(alturaStr));

		return new Persona(nombre,edad,sexo,peso,altura);
	}

	public int validarEdad(Scanner scanner){
		System.out.println("Ingrese la edad entre 1 y 90: ");
		String edadStr = scanner.nextLine();
		int edad = Integer.parseInt(edadStr);
		if(edad < 0 || edad > 90){
            System.out.println("La edad debe ser mayor a cero y menor que noventa. Reintentar.");
			scanner.next(); // Consumir el salto de línea

			return validarEdad(scanner);
        }
        return edad;
	}

	public char validarSexo(Scanner scanner){
		System.out.println("Ingrese el sexo (M) Masculino, (F) Femenino, (O) Otro: ");
		char sexoStr = scanner.nextLine().toUpperCase().charAt(0);

		if((sexoStr != 'M') && (sexoStr != 'F') && (sexoStr != 'O')){
            System.out.println("El sexo debe ser M, F o O. Reintentar.");
			scanner.nextLine(); // Consumir el salto de línea

			return validarSexo(scanner);
        }
        return sexoStr;
	}

	public String validarPeso(Scanner scanner){
		System.out.println("Ingrese el peso: ");
		String pesoStr = scanner.next();
		double peso = Double.parseDouble(pesoStr);
		if(peso < 0){
            System.out.println("El peso debe ser mayor a cero. Reintentar.");
			scanner.nextInt(); // Consumir el salto de línea
            return validarPeso(scanner);
        }
        return pesoStr;
	}

    public String validarAltura(Scanner scanner){
	    System.out.println("Ingrese la altura: ");
	    String alturaStr = scanner.next();
	    double altura = Double.parseDouble(alturaStr);

	    if(altura < 0){
            System.out.println("La altura debe ser mayor a cero. Reintentar.");
			scanner.nextDouble(); // Consumir el salto de línea
            return validarAltura(scanner);
        }
		return alturaStr;
    }
}
