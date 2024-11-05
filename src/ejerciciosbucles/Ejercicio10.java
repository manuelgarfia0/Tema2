package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numero;
		int digito;
		int invertido;
		int original;
		Scanner teclado = new Scanner(System.in);
		// Solicitar al usuario que ingrese un número
		System.out.print("Introduce un número entero mayor o igual que 0: ");
		numero = teclado.nextInt();
		// Verificar que el número sea mayor o igual que 0
		if (numero < 0) {
			System.out.println("El número debe ser mayor o igual que 0.");
		} else {
			original = numero;
			invertido = 0;
			// Invertir el número
			while (numero > 0) {
				digito = numero % 10;
				invertido = invertido * 10 + digito;
				numero /= 10;
			}
			// Comparar el número original con el invertido
			if (original == invertido) {
				System.out.println("El número " + original + " es capicúa.");
			} else {
				System.out.println("El número " + original + " no es capicúa.");
			}
		}
		teclado.close();
	}
}