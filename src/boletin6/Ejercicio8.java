package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Creamos las siguientes variables para poder introducir los dos números y para
		// después con un if saber cual va a ser el mayor y cual el menor
		int num1;
		int num2;
		int mayor;
		int menor;
		// Pedimos los números
		System.out.println("Dame un número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro número: ");
		num2 = teclado.nextInt();
		// Creamos el if para poder "enlazar" los números con mayor o menos
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		// Hacemos que el bucle empiece por el número menor y termine en el mayor
		// enseñando de número en número
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i + " ");
		}
	}
}