package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num = 0;
		boolean primo = true;

		System.out.println("Introduce un número: ");
		num = teclado.nextInt();

		for (int i = 2; i < num; i++) {
			if ((num % i == 0) && (primo)) {
				primo = false;
			}
		}
		if (primo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}

}