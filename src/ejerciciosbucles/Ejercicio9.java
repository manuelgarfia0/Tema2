package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner teclado = new Scanner(System.in);

		// Variables
		int num;
		int numChars = 0;

		// Pide y guarda el número
		System.out.println("Escribe un número:");
		num = teclado.nextInt();

		// Contar el número de cifras usando un bucle y división entre 10
		int tempNum = num;
		if (tempNum == 0) {
			numChars = 1; // Caso especial para el número 0
		} else {
			while (tempNum != 0) {
				tempNum /= 10; // Dividir el número entre 10
				numChars++; // Incrementar el contador de cifras
			}
		}

		// Respuesta
		System.out.println("El número introducido tiene " + numChars + " cifras.");
		// Cerramos el scanner
		teclado.close();
	}

}