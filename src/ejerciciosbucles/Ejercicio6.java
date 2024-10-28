package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num;

		System.out.println("Introduce la altura de la pirámide: ");
		num = teclado.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int y = num; y > i; y--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}