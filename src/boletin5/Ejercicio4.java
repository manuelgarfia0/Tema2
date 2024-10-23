package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		int i = 1;
		do {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			i++;
		} while (i <= 10);
	}
}