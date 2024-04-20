package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        System.out.println("Ingrese nombres de personas:");
        	for (int i = 0; i < nombres.length; i++) {
        		System.out.print("Nombre " + (i + 1) + ": ");
        		nombres[i] = scanner.nextLine();
        }

        System.out.println("\nValores guardados en el array:");
        int index = 0;
        	while (index < nombres.length) {
        		System.out.println("Índice " + index + ": " + nombres[index]);
        		index++;
        }

        System.out.println("\nTamaño del array: " + nombres.length);

        byte indiceAEliminar;
        	do {
        		System.out.print("Ingrese el índice del elemento a eliminar (0-4): ");
        		indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        	for (int i = (int)indiceAEliminar; i < nombres.length - 1; i++) {
        		nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = "";

        System.out.println("\nArreglo después de eliminar el elemento:");
        	for (int i = 0; i < nombres.length; i++) {
        		System.out.println("Índice " + i + ": " + nombres[i]);
        }

  scanner.close();
    }
}
