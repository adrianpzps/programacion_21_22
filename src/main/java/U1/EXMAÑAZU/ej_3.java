package U1.EXMAÑAZU;

import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altura = 0;

    while (altura < 3 || altura % 2 == 0) {
      System.out.println("Introduzca la altura: ");
      altura = teclado.nextInt();
    }

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < ((altura / 2) + 1) + 5; j++) {
        if ((j >= (altura / 2) - i && j >= i - (altura / 2) && j <= altura / 2)
            || (i == altura / 2)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
