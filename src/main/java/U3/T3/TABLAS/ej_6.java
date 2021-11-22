package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_6 {
  public static void main(String[] args) {

    int[] array = {1, 3, 2, 7, 3, 7, 4, 2, 5, 6};

    sinRepetidos(array);
  }

  static void sinRepetidos(int[] array) {

    int[] arraysinr = new int[0];
    int contador = 0;

    for (int i = 0; i < array.length; i++) {
      boolean repetido = false;
      for (int j = 0; j < arraysinr.length; j++) {
        if (array[i] == arraysinr[j]) {
          repetido = true;
          contador++;
          break;
        }
      }
      if (!repetido) {
        arraysinr = Arrays.copyOf(arraysinr, arraysinr.length + 1);
        arraysinr[i - contador] = array[i];
      }
    }
    System.out.println(Arrays.toString(arraysinr));
  }
}
