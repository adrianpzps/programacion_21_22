package U1.T8;

import java.util.Scanner;

public class ej8_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Inserte el rango minimo: ");
    int r1 = teclado.nextInt();
    System.out.println("Inserte el rango maximo: ");
    int r2 = teclado.nextInt();
    int rm = r1 + r2;

    do {
      System.out.println("Introduzca un valor dentro del rango: ");
      rm = teclado.nextInt();
    } while (rm < r1 || rm > r2);



  }
}
