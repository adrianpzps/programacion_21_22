package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double[] n = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Introduzca un número decimal: ");
      n[i] = teclado.nextDouble();
    }

    for (int i = 0; i < 5; i++) {
      System.out.print(n[i] + ", ");
    }
    System.out.println();
    System.out.println(Arrays.toString(n));
  }
}
