package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Números a introducir: ");
    int n = teclado.nextInt();

    int[] n1 = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Introduzca un número: ");
      n1[i] = teclado.nextInt();
    }

    for (int i = n - 1; i > -1; i--) {
      System.out.print(n1[i] + ", ");
    }
  }
}
