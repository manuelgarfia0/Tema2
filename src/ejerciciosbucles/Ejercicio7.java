package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num;

		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}