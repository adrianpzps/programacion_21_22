package U3.T3.TABLAS;

import java.util.Arrays;

public class ej_9 {
  public static void main(String[] args) {
    int[] apuesta = {3, 5, 6, 9, 7, 8};
    int[] ganadora = {8, 5, 4, 9, 3, 2};

    aciertos(apuesta, ganadora);
  }

  static void aciertos(int[] apuesta, int[] ganadora) {

    int aciertos = 0;

    for (int i = 0; i < apuesta.length; i++) {
      for (int j = 0; j < apuesta.length; j++) {
        if (apuesta[i] == ganadora[j]) {
          aciertos++;
        }
      }
    }

    System.out.println("El número de aciertos es: " + aciertos);
  }
}
