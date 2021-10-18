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

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 2) - 1; j++) {
        if (j == (altura - 1) - i || j == (altura - 1) + i || i == altura - 1) {
          System.out.print(carac);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
