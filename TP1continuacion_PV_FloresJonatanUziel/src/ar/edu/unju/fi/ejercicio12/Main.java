package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

       System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
     String fechaStr = scanner.nextLine();
     String[] fechaSplit = fechaStr.split("-");
        int anio = Integer.parseInt(fechaSplit[0]);
        int mes = Integer.parseInt(fechaSplit[1]) - 1;
        int dia = Integer.parseInt(fechaSplit[2]);
      Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);

   Persona persona = new Persona(nombre, fechaNacimiento);

      System.out.println("\nDatos de la Persona:");
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Fecha de Nacimiento: " + fechaStr);
      System.out.println("Edad: " + persona.calcularEdad() + " años");
      System.out.println("Signo del Zodiaco: " + persona.obtenerSignoZodiaco());
      System.out.println("Estación del Año: " + persona.obtenerEstacion());

   scanner.close();
    }
}
