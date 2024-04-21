package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        paises.add(new Pais("001", "Argentina"));
        paises.add(new Pais("002", "Brasil"));
        paises.add(new Pais("003", "Chile"));

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            try {
                switch (opcion) {

                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 9);
    }

    // Métodos auxiliares
}
