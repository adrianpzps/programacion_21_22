package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una frase: ");
    String frase = teclado.nextLine();

    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {
      char carac = frase.charAt(i);
      if (carac == ' ') {
        contador++;
      }
    }

    System.out.println("La frase tiene " + contador + " espacios");
  }
}
