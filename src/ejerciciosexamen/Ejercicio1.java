package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el tamaño del lado del cuadrado: ");
		int lado = teclado.nextInt();

		for (int i = 0; i <= lado; i++) {
			for (int j = 0; j <= lado; j++) {
				if (i == 0 || i == lado || j == 0 || j == lado) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}

		teclado.close();
	}
}
