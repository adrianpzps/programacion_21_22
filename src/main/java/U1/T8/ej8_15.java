package U1.T8;

import java.util.Scanner;

public class ej8_15 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int n = teclado.nextInt();

    for (int i = 2; i <= n; i++) {
      boolean p = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          p = false;
          break;
        }
      }
      if (p) {
        System.out.println(i + " Es primo");
      } else {
        System.out.println(i + " No es primo");
      }
    }
  }
}
