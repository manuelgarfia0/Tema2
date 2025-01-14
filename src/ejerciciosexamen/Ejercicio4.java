package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el tamaño del lado del hexágono (número entero positivo): ");
		int lado = teclado.nextInt();

		// Validación para asegurar que el lado es positivo
		if (lado <= 0) {
			System.out.println("El tamaño del lado debe ser un número entero positivo.");
		} else {
			// Dibuja la parte superior del hexágono
			for (int i = 0; i < lado; i++) {
				// Espacios iniciales para alinear la fila
				for (int j = 0; j < lado - i - 1; j++) {
					System.out.print(" ");
				}
				// Asteriscos para el borde del hexágono
				System.out.print("*");
				for (int j = 0; j < lado + 2 * i - 1; j++) {
					if (i == 0 || j == 0 || j == lado + 2 * i - 2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			// Dibuja la parte central del hexágono (sin espacios laterales)
			for (int i = 0; i < lado - 2; i++) {
				System.out.print("*");
				for (int j = 0; j < 3 * lado - 3; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

			// Dibuja la parte inferior del hexágono
			for (int i = lado - 1; i >= 0; i--) {
				// Espacios iniciales para alinear la fila
				for (int j = 0; j < lado - i - 1; j++) {
					System.out.print(" ");
				}

				// Asteriscos para el borde del hexágono
				System.out.print("*");
				for (int j = 0; j < lado + 2 * i - 1; j++) {
					if (i == 0 || j == 0 || j == lado + 2 * i - 2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		teclado.close();
	}
}
