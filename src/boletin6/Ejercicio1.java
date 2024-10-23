package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Introduce el número hasta el que quieras contar: ");
		num = teclado.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}
	}

}