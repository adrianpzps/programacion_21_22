package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;
import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[][] hueco = new int[2][10];

    for (int i = 0; i < hueco[0].length; i++) {
      hueco[0][i] = i + 1;
    }
    for (int i = 0; i < hueco[1].length; i++) {
      hueco[1][i] = (int) (Math.random() * 5);
    }

    System.out.println(Arrays.toString(hueco[0]));
    System.out.println(Arrays.toString(hueco[1]));

    int n = 0;

    while (n != -1) {

      System.out.println("¿Cuantos son? Introduzca -1 para salir del programa: ");
      n = teclado.nextInt();

      while (n > 4) {
        System.out.println(
            "“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo”");
        System.out.println("¿Cuantos son? Introduzca -1 para salir del programa: ");
        n = teclado.nextInt();
      }

      boolean sentado = false;

      for (int i = 0; i < hueco[1].length; i++) {
        if (hueco[1][i] == 0) {
          sentado = true;
          hueco[1][i] = hueco[1][i] + n;
          System.out.println(Arrays.toString(hueco[0]));
          System.out.println(Arrays.toString(hueco[1]));
          System.out.println("Por favor sientese en la mesa numero " + (i + 1));
          break;
        }
      }
      if (!sentado) {
        for (int i = 0; i < hueco[1].length; i++) {
          if ((hueco[1][i] + n) <= 4) {
            sentado = true;
            hueco[1][i] = hueco[1][i] + n;
            System.out.println(Arrays.toString(hueco[0]));
            System.out.println(Arrays.toString(hueco[1]));
            System.out.println(
                "Estará acompañado. Por favor sientese en la mesa numero " + (i + 1));
            break;
          }
        }
      }
      if (!sentado) {
        System.out.println("Lo siento no hay hueco.");
      }
    }
  }
}
