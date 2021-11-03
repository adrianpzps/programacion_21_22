package U3;

import java.util.Scanner;

public class ej_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el primer número: ");
    int n1 = teclado.nextInt();
    System.out.println("Introduzca el segundo número: ");
    int n2 = teclado.nextInt();

    contiene(n1, n2);
  }

  static void contiene(int n1, int n2) {

    for (int i = n1 + 1; i < n2; i++) {
      System.out.println(i);
    }
  }
}
