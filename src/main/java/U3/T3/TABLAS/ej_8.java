package U3.T3.TABLAS;

import java.util.Arrays;

public class ej_8 {
  public static void main(String[] args) {

    int[][] tabla = new int[5][5];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla.length; j++) {
        tabla[i][j] = i + j;
      }
    }

    System.out.println(Arrays.deepToString(tabla));
  }
}
