package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una frase: ");
    String frase = teclado.nextLine();

    int longitud = frase.length() / 2;

    char mitad = frase.charAt(longitud);

    if (mitad == ' ') {
      System.out.println("Es un espacio");
    } else {
      System.out.println("No es un espacio");
    }
  }
}
