package U3.EXAMEN_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el número de filas: ");
    int f = teclado.nextInt();
    System.out.println("Introduzca el número de columnas: ");
    int c = teclado.nextInt();

    int[][] x = new int[f][c];

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        x[i][j] = (int) (11 + Math.random() * 993);
      }
      System.out.println(Arrays.toString(x[i]));
    }


  }

  public static boolean esPuntoDeSilla(int x[][], int i, int j) {

    boolean puntosilla = false;

    for (int h = 0; i < x.length; h++) {
      for (int f = 0; j < x[i].length; f++) {
      }
    }
    return puntosilla;
  }
}
