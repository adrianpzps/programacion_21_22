package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce una palabra: ");
    String p1 = teclado.nextLine();
    System.out.print("Introduce otra palabra: ");
    String p2 = teclado.next();

    int lon1 = p1.length();
    int lon2 = p2.length();

    if (lon1 < lon2) {
      System.out.println(p1 + " es mas corta que " + p2);
    } else {
      System.out.println(p2 + " es mas corta que " + p1);
    }
  }
}
