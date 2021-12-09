package U3.EXAMEN;

import java.util.Arrays;

public class ej_4 {
  public static void main(String[] args) {

    String[][] matriz = new String[3][3];
    matriz[0] = new String[] {"a", "b", "c"};
    matriz[1] = new String[] {"d", "e", "f"};
    matriz[2] = new String[] {"g", "h", "i"};

    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }

    System.out.println();

    String[] fila = {"j", "k", "l"};

    int pos = 1;

    System.out.println(insertarFilaEnMatriz(matriz, fila, pos));

  }

  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

    String[][] matrizresultado = new String[4][3];

    for (int i = 0; i < matrizresultado.length; i++) {
      if (i < pos) {
        matrizresultado[i] = matriz[i];
      } else if (i == pos) {
        matrizresultado[i] = fila;
      } else {
        matrizresultado[i] = matriz[i - 1];
      }
      System.out.println(Arrays.toString(matrizresultado[i]));
    }

    return matrizresultado;
  }
}
