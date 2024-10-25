package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Prueba 1: Hora--> 14 Minutos--> 34 Segundos--> 37 Incrementar segundos--> 5
		// Resultado--> 14 : 34 : 37 (No ha incrementado los segundos)
		// Prueba 2: Hora--> 13 Minutos--> 34 Segundos--> 37 Incrementar segundos--> 10
		// Resultado--> 13 : 34 : 37 (No ha incrementado los segundos)
		// Prueba 3: Hora--> 17 Minutos--> 44 Segundos--> 32 Incrementar segundos--> 70
		// Resultado--> 17 : 45 : 42 (Incrementa los segundos y los minutos al pasar de
		// los 59 segundos)
		// Prueba 4: Hora--> 17 Minutos--> 59 Segundos--> 55 Incrementar segundos--> 20
		// Resultado--> 18 : 00 : 15 (Incrementa los segundos, los minutos al pasar de
		// los 59 segundos y las horas al pasar de 59 minutos)

		Scanner teclado = new Scanner(System.in);

		int hora;
		int minutos;
		int segundos;
		int incrementarSegundos;

		// Pedir la hora, minutos y segundos
		System.out.print("Introduce una hora: ");
		hora = teclado.nextInt();

		System.out.print("Introduce los minutos: ");
		minutos = teclado.nextInt();

		System.out.print("Introduce los segundos: ");
		segundos = teclado.nextInt();

		// Pedir cantidad de segundos a incrementar
		System.out.print("Introduce la cantidad de segundos a incrementar: ");
		incrementarSegundos = teclado.nextInt();

		// Incrementar segundo a segundo
		for (int i = 0; i < incrementarSegundos; i++) {
			segundos++;
			if (segundos >= 60) {
				segundos = 0;
				minutos++;
				if (minutos >= 60) {
					minutos = 0;
					hora++;
					if (hora >= 24) {
						hora = 0;
					}
				}
			}
		}

		// Mostrar el resultado
		System.out.printf(hora + (" : ") + minutos + (" : ") + segundos);
	}
}