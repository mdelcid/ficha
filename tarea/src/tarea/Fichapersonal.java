package tarea;

import java.util.Scanner;

public class Fichapersonal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Ficha Personal");

		Scanner mi_scanner = new Scanner(System.in);
		String str;
		System.out.println("Ingrese nombre: ");
		str = mi_scanner.next();

		int edad;
		System.out.println("Ingrese edad: ");
		edad = mi_scanner.nextInt();

		char letra;
		System.out.println("Ingrese sexo: ");
		letra = mi_scanner.next().charAt(0);

		boolean bool;
		System.out.println("Ingrese casado: ");
		bool = mi_scanner.nextBoolean();
		
		

		System.out.println("Ficha personal");
		
		System.out.println("Nombre: " + str);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + letra);
		System.out.println("Casado: " + bool);
	}

}
