package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int a = teclado.nextInt();
    System.out.println("Elevarlo a: ");
    int n = teclado.nextInt();

    System.out.println(elevado(a, n));
  }

  static int elevado(int a, int n) {

    int suma = a;

    for (int i = 2; i <= n; i++) {
      suma = suma * a;
    }
    return suma;
  }
}
