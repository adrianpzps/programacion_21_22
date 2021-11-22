package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un número de dígitos: ");
    int d = teclado.nextInt();

    int[] n = new int[d];

    for (int i = 0; i < d; i++) {
      n[i] = (int) (1 + Math.random() * 6);
    }

    int[] u = new int[d];

    System.out.println("Intente acertarlo");

    for (int i = 0; i < d; i++) {
      System.out.println("Introduzca un dígito del 1 al 5: ");
      u[i] = teclado.nextInt();
    }

    for (int i = 0; i < d; i++) {
      if (n[i] == u[i]) {
        System.out.println(u[i] + " Es igual");
      } else if (n[i] > u[i]) {
        System.out.println(u[i] + " Es menor");
      } else if (n[i] < u[i]) {
        System.out.println(u[i] + " Es mayor");
      }
    }

    while (!Arrays.equals(n, u)) {
      System.out.println("Intentelo de nuevo: ");
      for (int i = 0; i < d; i++) {
        System.out.println("Introduzca un dígito del 1 al 5: ");
        u[i] = teclado.nextInt();
      }
      for (int i = 0; i < d; i++) {
        if (n[i] == u[i]) {
          System.out.println(u[i] + " Es igual");
        } else if (n[i] > u[i]) {
          System.out.println(u[i] + " Es menor");
        } else if (n[i] < u[i]) {
          System.out.println(u[i] + " Es mayor");
        }
      }
    }
  }
}
