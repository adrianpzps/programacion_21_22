package U1.EN2021;

import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altura = 0;

    while (altura < 4) {
      System.out.println("Introduzca la altura: ");
      altura = teclado.nextInt();
    }

    for (int i = 0; i < altura; i++) {
      if (i < altura - 2) {
        System.out.println("***     ***");
      } else {
        System.out.println("******  ******");
      }
    }
  }
}
