package U3;

import java.util.Scanner;

public class ej_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int n = teclado.nextInt();

    esprimo_divisor(n);
  }

  static void esprimo_divisor(int n) {
    for (int i = 2; i <= n; i++) {
      boolean p = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          p = false;
          break;
        }
      }
      if (p && n % i == 0) {
        System.out.println(i + " Es primo y divisor");
      }
    }
  }
}
