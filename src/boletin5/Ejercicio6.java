package boletin5;

import java.awt.Button;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		final String PIEDRA = "Piedra";
		final String PAPEL = "Papel";
		final String TIJERAS = "Tijeras";
		String jugador1;
		String jugador2;

		Scanner teclado = new Scanner(System.in);
		do {

			do {
				System.out.println("Jugador 1 introduzca Piedra, Papel o Tijeras: ");
				jugador1 = teclado.next();
			} while (!jugador1.equalsIgnoreCase(PIEDRA) && !jugador1.equalsIgnoreCase(PAPEL)
					&& !jugador1.equalsIgnoreCase(TIJERAS));

			System.out.println("Jugada del jugador 1 " + jugador1);

			do {
				System.out.println("Jugador 2 introduzca Piedra, Papel o Tijeras: ");
				jugador2 = teclado.next();
			} while (!jugador2.equalsIgnoreCase(PIEDRA) && !jugador2.equalsIgnoreCase(PAPEL)
					&& !jugador2.equalsIgnoreCase(TIJERAS));
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("Empate");
			} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(TIJERAS)
					|| jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PIEDRA)
					|| jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el jugador 2");
			} else {
				System.out.println("Gana el jugador 1");
			}
			System.out.println("¿Quieren seguir jugando? (s/n)");
			jugador1 = teclado.next();
		} while (jugador1.equalsIgnoreCase("s"));
	}
}