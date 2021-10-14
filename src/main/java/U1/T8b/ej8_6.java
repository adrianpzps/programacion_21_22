package U1.T8b;

import java.util.Scanner;

public class ej8_6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // por hacer...

    System.out.println("Introduzca la altura: ");
    int altura = teclado.nextInt();
    System.out.println("Introduzca el caracter: ");
    String carac = teclado.next();

    for (int i = 0; i <= altura; i++) {
      for (int j = 0; j <= altura - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i * 2) - 1; j++) {
        System.out.print(carac);
      }
      System.out.println();
    }
  }
}
