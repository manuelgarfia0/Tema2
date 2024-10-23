package boletin5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		char opcion;

		do {
			System.out.println("\nSelecciona una operación:");
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. SALIR");

			System.out.print("Introduce el número de la opción deseada (A, B, C, D o E para salir): ");
			opcion = teclado.next().toUpperCase().charAt(0);

			if (opcion != 'E') {
				System.out.print("Introduce el primer número: ");
				double numero1 = teclado.nextDouble();

				System.out.print("Introduce el segundo número: ");
				double numero2 = teclado.nextDouble();

				switch (opcion) {
				case 'A':
					System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
					break;
				case 'B':
					System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
					break;
				case 'C':
					System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
					break;
				case 'D':
					if (numero2 != 0) {
						System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
					} else {
						System.out.println("Error: No se puede dividir entre cero.");
					}
					break;
				default:
					System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
				}
			}

		} while (opcion != 'E');

		System.out.println("Finalizando programa...");
	}
}