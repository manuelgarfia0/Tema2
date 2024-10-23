package boletin6;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Creamos las siguientes variables para poder introducir números en el bucle,
		// para poder sumar esos números y para poder dividirlos y hacer la media
		int num;
		int sumaNum = 0;
		double media;

		System.out.println("Introduce 10 números para ver la media entre ellos.");

		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			sumaNum += num;
		}
		media = (double) sumaNum / 10;
		System.out.println("La media de los 10 números anteriores es: " + media);
	}

}