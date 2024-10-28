package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int a, b, i = 0;
		int mayor = 0, menor = 0;
		boolean mcm = true;

		System.out.println("Introduce un número: ");
		a = teclado.nextInt();
		System.out.println("Introduce un número distinto al anterior: ");
		b = teclado.nextInt();

		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
		}
		i = menor;
		while ((i > 0) && (mcm)) {
			if ((menor % i == 0) && (mayor % i == 0)) {
				System.out.println(i + " es el mínimo común múltiplo");
				mcm = false;

			}
			i--;
		}
	}

}