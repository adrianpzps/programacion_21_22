package U3.EXAMEN;

import java.util.Arrays;
import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el número de filas: ");
    int nf = teclado.nextInt();
    System.out.println("Introduzca el número de columnas: ");
    int nc = teclado.nextInt();

    int[][] array = new int[nf][nc];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (14 + Math.random() * 65);
      }
      System.out.println(Arrays.toString(array[i]));
    }

    System.out.println();

    int sumpares = 0;
    int contador = 0;
    int maxp = 0;
    int minp = 79;

    int[] pares = new int[0];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (j % 2 == 0 && i % 2 == 0) {
          pares = Arrays.copyOf(pares, pares.length + 1);
          pares[contador] = array[i][j];
          contador++;
          sumpares = sumpares + array[i][j];
          if (array[i][j] > maxp) {
            maxp = array[i][j];
          }
          if (array[i][j] < minp) {
            minp = array[i][j];
          }
          }
      }
    }

    int medp = sumpares / contador;


    int[] impares = new int[0];
    int sumimpares = 0;
    int maxi = 0;
    int mini = 79;
    contador = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (j % 2 != 0 && i % 2 != 0) {
          impares = Arrays.copyOf(impares, impares.length + 1);
          impares[contador] = array[i][j];
          contador++;
          sumimpares = sumimpares + array[i][j];
          if (array[i][j] > maxi) {
            maxi = array[i][j];
          }
          if (array[i][j] < mini) {
            mini = array[i][j];
          }
        }
      }
    }
    int medi = sumpares / contador;


    System.out.println("Pares: " + Arrays.toString(pares));
    System.out.println();
    System.out.println("Impares: " + Arrays.toString(impares));
    System.out.println();
    System.out.println("Suma de pares: " + sumpares);
    System.out.println("Suma de impares: " + sumimpares);
    System.out.println("Media de pares: " + medp);
    System.out.println("Media de impares: " + medi);
    System.out.println("Máximo de pares: " + maxp);
    System.out.println("Mínimo de pares: " + minp);
    System.out.println("Máximo de impares: " + maxi);
    System.out.println("Mínimo de impares: " + mini);
  }
}
