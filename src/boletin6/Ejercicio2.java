package boletin6;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Introduce el número de múltiplos de tres que quieres ver: ");
		num = teclado.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println(i * 3);
		}
	}

}