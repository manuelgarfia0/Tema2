package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Creamos las siguientes variables para poder introducir una nota y para poder
		// llevar la cuenta de los suspensos
		int nota;
		int susp = 0;
		// La inicialización la ponemos en = 1 y la condición la ponemos <=5 para
		// introducir solamente 5 notas
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce la nota que has sacado: ");
			nota = teclado.nextInt();
			// Creamos un if para condicionar el suspendo entre los números 4 y 0
			if (nota <= 4 && nota >= 0) {
				// Hacemos que se sumen de uno en uno los suspensos para poder tener un recuento
				// de ellos
				susp++;
			}
		}
		// Enseñamos los suspensos que hay
		System.out.println(susp + " habéis suspendido");
	}
}