package boletin5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String tirada1;
		String tirada2;
		int valor1;
		int valor2;

		do {
			System.out.print("¿Cuánto has sacado en la primera tirada? (escribe en formato: UNO, DOS, ... SEIS): ");
			tirada1 = teclado.nextLine().toUpperCase();
			valor1 = convertirCadenaANumero(tirada1);
			if (valor1 == -1) {
				System.out.println("Tirada no válida. Por favor, introduce un valor correcto.");
			}
		} while (valor1 == -1);

		do {
			System.out.print("¿Cuánto has sacado en la segunda tirada? (escribe en formato: UNO, DOS, ... SEIS): ");
			tirada2 = teclado.nextLine().toUpperCase();
			valor2 = convertirCadenaANumero(tirada2);
			if (valor2 == -1) {
				System.out.println("Tirada no válida. Por favor, introduce un valor correcto.");
			}
		} while (valor2 == -1);

		int suma = valor1 + valor2;
		System.out.println("La suma de las dos tiradas es: " + suma);

	}

	// Método para convertir la cadena a un número
	public static int convertirCadenaANumero(String tirada) {
		switch (tirada) {
		case "UNO":
			return 1;
		case "DOS":
			return 2;
		case "TRES":
			return 3;
		case "CUATRO":
			return 4;
		case "CINCO":
			return 5;
		case "SEIS":
			return 6;
		default:
			return -1;
		}
	}
}