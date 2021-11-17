package U3.T3.TABLAS;

import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Números a introducir: ");
    int n = teclado.nextInt();

    int[] n1 = new int[n];

    double sumap = 0;
    double suman = 0;
    double sumac = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Introduzca un número: ");
      n1[i] = teclado.nextInt();
      if (n1[i] > 0) {
        sumap = sumap + n1[i];
      } else if (n1[i] < 0) {
        suman = suman + n1[i];
      } else if (n1[i] == 0) {
        sumac++;
      }
    }

    System.out.println("Media de positivos: " + sumap / n);
    System.out.println("Media de negativos: " + suman / n);
    System.out.println("Número de ceros: " + sumac);
  }
}
