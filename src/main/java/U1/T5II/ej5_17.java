package U1.T5II;

import java.util.Scanner;

public class ej5_17 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una cifra: ");
    int cifra = teclado.nextInt();

    if (cifra < 10) {
      System.out.println(cifra);
    } else if (cifra < 100) {
      System.out.println(cifra / 10);
    } else if (cifra < 1000) {
      System.out.println(cifra / 100);
    } else if (cifra < 10000) {
      System.out.println(cifra / 1000);
    } else if (cifra < 100000) {
      System.out.println(cifra / 10000);
    }
  }
}
