package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    StringBuilder cadena = new StringBuilder("Alabí Alixar");
    System.out.println("El StringBuilder es: " + cadena);
    System.out.println("Capacidad inicial " + cadena.capacity());
    System.out.println("Longitud inicial " + cadena.length());
    System.out.println(cadena.replace(0, cadena.length(), "Chicharrones de Chiclana"));
    int n = 5000;
    System.out.println(cadena.replace(0, cadena.length(), "Hay " + n + " Chicharrones"));
    System.out.println(cadena.append(" en Chiclana"));
    System.out.println(cadena.substring(cadena.length() - 4, cadena.length()));
    System.out.println("Capacidad inicial " + cadena.capacity());
    System.out.println("Longitud inicial " + cadena.length());

    System.out.println();

    StringBuffer cadena2 = new StringBuffer("Alabí Alixar");
    System.out.println("El StringBuffer es: " + cadena2);
    System.out.println("Capacidad inicial " + cadena2.capacity());
    System.out.println("Longitud inicial " + cadena2.length());
    System.out.println(cadena2.replace(0, cadena2.length(), "Chicharrones de Chiclana"));
    System.out.println(cadena2.replace(0, cadena2.length(), "Hay " + n + " Chicharrones"));
    System.out.println(cadena2.append(" en Chiclana"));
    System.out.println(cadena2.substring(cadena.length() - 4, cadena2.length()));
    System.out.println("Capacidad inicial " + cadena2.capacity());
    System.out.println("Longitud inicial " + cadena2.length());
  }
}
