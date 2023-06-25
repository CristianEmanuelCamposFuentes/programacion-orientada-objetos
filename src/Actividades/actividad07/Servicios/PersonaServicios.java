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
		// Limpiar el buffer de memoria del scanner
		scanner.nextLine();

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

	public int calcularIMC(Persona persona){
		double peso = persona.getPeso();
        double altura = persona.getAltura();

        double imc = peso / (altura * altura);

        System.out.println("El IMC es: " + imc);
		if (imc < 20){
			System.out.println("La persona está por debajo de su peso ideal.");
			return -1;
		} else if(imc >= 20 && imc <= 25){
			System.out.println("La persona está en su peso ideal.");
            return 0;
		} else {
			System.out.println("La persona tiene sobrepeso.");
            return 1;
		}
	}

	public boolean esMayorDeEdad(Persona persona){
		int edad = persona.getEdad();
		// Si se cumple, devuelve verdadero, sino falso, es una comparacion
		return edad >= 18;
	}

	// Array de personas para facilitar los calculos
	public void calcularPromedios(Persona[] personas){
		double sumaIMC = 0;
		int cantPersonas = personas.length;
		int cantPesoIdeal = 0;
		int cantSobrepeso = 0;

		// Foreach para recorrer cada elemento del array
		for(Persona persona : personas){
			int imc = calcularIMC(persona);

            if (imc == 0){
	            cantPesoIdeal++;
            } else if (imc == 1){
	            cantSobrepeso++;
            }

			sumaIMC += imc;
		}
		double promedioIMC = sumaIMC / cantPersonas;
		double promedioSobrepeso = (double) cantSobrepeso / cantPersonas * 100;
		double promedioPesoIdeal = (double) cantPesoIdeal / cantPersonas * 100;

		System.out.println("Promedio de IMC: " + promedioIMC);
		System.out.println("Porcentaje de personas con Sobrepeso: " + promedioSobrepeso);
		System.out.println("Porcentaje de personas con Peso ideal: " + promedioPesoIdeal);
	}

	public void calcularMayoresMenores(Persona[] personas){
		int cantMayores = 0;
		int cantMenores = 0;
		int cantPersonas = personas.length;


		for(Persona persona : personas){
			if (esMayorDeEdad(persona)){
                cantMayores++;
            } else {
                cantMenores++;
            }
		}
		System.out.println("Cantidad de personas mayores de edad: " + cantMayores);
		System.out.println("Cantidad de personas menores de edad: " + cantMenores);

		double porcentajeMayores = (double) cantMayores / cantPersonas * 100;
		double porcentajeMenores = (double) cantMenores / cantPersonas * 100;
		System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores);
		System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenores);
	}
}
