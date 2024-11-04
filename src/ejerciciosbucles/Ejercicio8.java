package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num, numAnt;
		int contFallos = 0;
		int contTotal = 0;

		System.out.println("Introduce un número inicial: ");
		num = teclado.nextInt();
		numAnt = num;
		
		while (num != 0) {
			if (num < numAnt) {
				contFallos ++;
				contTotal ++;
				System.out.println("Fallo, es menor");
			}
			numAnt = num;
			contTotal ++;

			System.out.println("Introduce otro número: ");
			num = teclado.nextInt();
			
		}
		
		System.out.println("Total de números introducidos: " + contTotal);
		System.out.println("Total de números fallados: " + contFallos);
	}
}