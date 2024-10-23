package boletin5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numEscrito;
        int suma;
        int num;
        
        
        System.out.print("Introduce un número: ");
        numEscrito = teclado.nextInt();
        
        suma = 0;
        num = 1;
        
        do {
            suma += num;
            num++;
        } while (num <= numEscrito);
        
        System.out.println("La suma de los números desde 1 hasta " + numEscrito + " es: " + suma);
        
    }
}
