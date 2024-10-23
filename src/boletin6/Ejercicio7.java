package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num = 0;
		boolean primo = true;

		System.out.println("Introduce un número para ver si es primo: ");
		num = teclado.nextInt();
		while (num < 1) {
			System.out.println("Introduce un número positivo");
			num = teclado.nextInt();
		}
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