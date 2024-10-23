package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Creamos las siguientes variables para poder introducir un número y para poder
		// calcular el factorial
		int num;
		int factorial;

		System.out.print("Ingresa un número no negativo: ");

		num = teclado.nextInt();
		factorial = 1;
		// Ponemos la inicialización en 1 porque al hacer un factorial si empezamos por
		// 0 al multiplicar por 0 ya nos da todo 0
		for (int i = 1; i <= num; i++) {
			System.out.print(i + "*");
			factorial *= i;
		}
		System.out.println(" = " + factorial);
	}

}