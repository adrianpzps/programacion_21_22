package U3;

import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int n = teclado.nextInt();

    eco(n);
  }

  static void eco(int n) {

    for (int i = 0; i < n; i++) {
      System.out.println("Eco...");
    }
  }
}
