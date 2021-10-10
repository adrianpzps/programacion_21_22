package U1.T8b;

import java.util.Scanner;

public class ej8_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;

    for (int var = 1; var <= 10; var++) {
      System.out.println("Introduzca un numero");
      int n = teclado.nextInt();
      if (n < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println(positivos + " POSITIVOS Y " + negativos + " NEGATIVOS");
  }
}
