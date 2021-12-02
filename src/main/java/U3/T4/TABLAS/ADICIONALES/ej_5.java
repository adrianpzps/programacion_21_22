package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;

public class ej_5 {
  public static void main(String[] args) {
    int[][] aleatorios = new int[10][10];

    for (int i = 0; i < aleatorios.length; i++) {
      for (int j = 0; j < aleatorios[i].length; j++) {
        aleatorios[i][j] = (int) (200 + (Math.random() * 101));
      }
    }
    for (int i = 0; i < aleatorios.length; i++) {
      System.out.println(Arrays.toString(aleatorios[i]));
    }
    int max = 0;
    int min = 300;
    int avg = 0;
    for (int i = 0; i < aleatorios.length; i++) {
      for (int j = 0; j < aleatorios[i].length; j++) {
        System.out.println(aleatorios[i][i]);
        if (aleatorios[i][i]>max) {
          max = aleatorios[i][i];
        }
        if (aleatorios[i][i]<min) {
          min = aleatorios[i][i];
        }
        avg = avg + aleatorios[i][i];
        break;
      }
    }
    System.out.println("El número máximo es: " +max);
    System.out.println("El número mínimo es: " +min);
    System.out.println("La media es : " +(avg/10));
  }



}
