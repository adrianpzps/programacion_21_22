package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_11v2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int a = teclado.nextInt();
    System.out.println("Elevarlo a: ");
    int n = teclado.nextInt();

    System.out.println(elevado(a, n));
  }

  static int elevado(int a, int n) {

    if (n == 1) {
      return 1;
    } else {
      return elevado(a, n - 1) * a;
    }
  }
}
