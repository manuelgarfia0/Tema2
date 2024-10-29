package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		boolean error = false;

		int num = 0;
		int numAnt = 0;
		int contador = 0;
		int fallos = 0;

		do {
			if (num < numAnt) {

				contador++;
			}
			try {
				System.out.println("Dime un número: ");
				numAnt = teclado.nextInt();
				error = false;
			} catch (Exception e) {

			}
		} while (num > numAnt);
	}

}