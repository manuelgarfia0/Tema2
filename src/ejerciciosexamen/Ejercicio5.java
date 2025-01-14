package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el tamaño del escaque (número entero positivo): ");
		int tamañoEscaque = teclado.nextInt();

		// Validación para asegurar que el tamaño es positivo
		if (tamañoEscaque <= 0) {
			System.out.println("El tamaño del escaque debe ser un número entero positivo.");
		} else {
			// Dibuja el tablero de ajedrez
			for (int i = 0; i < 8; i++) { // 8 filas
				for (int j = 0; j < 8; j++) { // 8 columnas
					// Determinar si la casilla es blanca o negra
					if ((i + j) % 2 == 0) {
						// Casilla blanca (representada por espacios)
						for (int k = 0; k < tamañoEscaque; k++) {
							System.out.print(" "); // Espacio en blanco
						}
					} else {
						// Casilla negra (representada por ##)
						for (int k = 0; k < tamañoEscaque; k++) {
							System.out.print("#"); // Dibuja el escaque negro
						}
					}
				}
				System.out.println(); // Nueva línea después de cada fila
			}
		}
		teclado.close();
	}
}
