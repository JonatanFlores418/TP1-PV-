package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
      do {
            System.out.print("Ingrese un número entero en el rango [5, 10]: ");
            size = scanner.nextInt();
        } while (size < 5 || size > 10);

        String[] nombres = new String[size];

        	for (int i = 0; i < size; i++) {
        		System.out.print("Ingrese un nombre para la posición " + i + ": ");
        		nombres[i] = scanner.next();
        }

        System.out.println("\nContenido del array (comenzando desde el primer índice):");
        	for (int i = 0; i < size; i++) {
        		System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("\nContenido del array (comenzando desde el último índice):");
        	for (int i = size - 1; i >= 0; i--) {
        		System.out.println("Posición " + i + ": " + nombres[i]);
        }

  scanner.close();
    }
}
