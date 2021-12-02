package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;
import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[] array = new int[100];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 501);
    }

    System.out.println(Arrays.toString(array));

    System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");

    int opcion = teclado.nextInt();
    int min = 500;

    if (opcion == 1) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
          min = array[i];
        }
      }
      for (int i = 0; i < array.length; i++) {
        if (array[i] == min) {
          System.out.print("*" + array[i] + "*,");
        } else {
          System.out.print(array[i] + ",");
        }
      }
    }
    int max = 0;

    if (opcion == 2) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
          max = array[i];
        }
      }
      for (int i = 0; i < array.length; i++) {
        if (array[i] == max) {
          System.out.print("*" + array[i] + "*,");
        } else {
          System.out.print(array[i] + ",");
        }
      }
    }
  }
}
