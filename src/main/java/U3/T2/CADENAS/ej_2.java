package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce palabra a palabra un texto: ");
    String palabra = teclado.next();
    String texto = palabra;

    while (!palabra.equalsIgnoreCase("fin")) {
      System.out.println("Introduce otra palabra: ");
      palabra = teclado.next();
      if (palabra.equalsIgnoreCase("fin")) {
        System.out.println(texto);
      } else {
        texto = texto + " " + palabra;
      }
    }
  }
}
