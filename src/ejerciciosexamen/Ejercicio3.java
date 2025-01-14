package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el tamaño del lado del triángulo: ");
		int lado = teclado.nextInt();

		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < (lado - i) * 2 - 1; k++) {
				if (k == 0 || k == (lado - i) * 2 - 2 || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		teclado.close();
	}
}
