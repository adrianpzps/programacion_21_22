package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    final int NUM_TRIM = 3;
    final int NUM_ALUM = 5;
    int[][] nota = new int[NUM_TRIM][NUM_ALUM];

    for (int i = 0; i < NUM_TRIM; i++) {
      for (int j = 0; j < NUM_ALUM; j++) {
        System.out.println("Introduzca la nota del trimestre " + i + ", alumno " + j);
        nota[i][j] = teclado.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(nota));

    System.out.print("Introduzca el número de trimestre (0, 1, 2): ");
    int trimestre = teclado.nextInt();

    media_trimestre(nota, NUM_ALUM, trimestre);

    System.out.print("Introduzca el alumno (0, 1, 2, 3, 4): ");
    int alumno = teclado.nextInt();

    media_alumno(nota, NUM_ALUM, NUM_TRIM, alumno);
  }

  static void media_alumno(int[][] nota, int NUM_ALUM, int NUM_TRIM, int alumno) {

    int media_alumno = 0;

    for (int i = 0; i < NUM_TRIM; i++) {
      media_alumno = media_alumno + nota[i][alumno];
    }

    System.out.println("La media del alumno es: " + media_alumno / NUM_TRIM);
  }

  static void media_trimestre(int[][] nota, int NUM_ALUM, int trimestre) {

    int mtrimestre = 0;

    for (int i = 0; i < NUM_ALUM; i++) {
      mtrimestre = mtrimestre + nota[trimestre][i];
    }

    System.out.println("La media del trimestre es: " + mtrimestre / NUM_ALUM);
  }
}
