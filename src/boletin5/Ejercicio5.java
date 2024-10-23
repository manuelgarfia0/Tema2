package boletin5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int minimo = 1;
		int maximo = 100;
		int intento;
		String respuesta;

		System.out.println("Piensa en un número entre 1 y 100, y yo intentaré adivinarlo.");
		System.out.println("Responde con 'mayor', 'menor' o 'igual' cuando haga mi propuesta.");

		do {
			intento = (minimo + maximo) / 2;
			System.out.println("¿Es el número " + intento + "?");

			respuesta = teclado.nextLine().toLowerCase();

			if (respuesta.equals("mayor")) {
				minimo = intento + 1;
			} else if (respuesta.equals("menor")) {
				maximo = intento - 1;
			}

		} while (!respuesta.equals("igual"));

		System.out.println("¡He adivinado! El número que pensaste es " + intento + ".");
	}
}