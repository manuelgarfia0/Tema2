package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número entero mayor o igual que 0: ");
		int numero = teclado.nextInt();
		
		if (numero < 0) {
			System.out.println("El número debe ser mayor o igual que 0.");
		} else {
			int pares = 0;
			int impares = 0;
			int temp = numero;
			while (temp > 0) {
				int digito = temp % 10;
				if (digito % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
				temp /= 10;
			}
			
			System.out.println("El número " + numero + " tiene:");
			System.out.println("Cifras pares: " + pares);
			System.out.println("Cifras impares: " + impares);
		}
		
		teclado.close();
	}
}
