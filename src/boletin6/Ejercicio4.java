package boletin6;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la esta variable para poder sumar los números que introduzcamos en el
		// bucle
		int sumaNum = 0;
		// Como el incremento del for es de 2 en 2 y queremos los números impares
		// hacemos que i = 1
		for (int i = 1; i < 19; i += 2) {
			System.out.print(i + "+");
			// Usamos += para que el resultado de la primera suma se le sume el siguiente
			// número, y a esa suma el siguiente, así sucesivamente
			sumaNum += i;

		}

		System.out.print("19 = " + (sumaNum + 19));
	}

}