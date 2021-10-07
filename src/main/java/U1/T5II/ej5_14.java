package U1.T5II;

import java.util.Scanner;

public class ej5_14 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print(
        "Introduzca 0 para vertice hacia abajo,\n1 hacia arriba, 2 hacia izq y 3 hacia derecha: ");
    int vertice = teclado.nextInt();

    if (vertice == 0) {
      System.out.println("*****");
      System.out.println(" *** ");
      System.out.println("  *  ");
    } else if (vertice == 1) {
      System.out.println("  *  ");
      System.out.println(" *** ");
      System.out.println("*****");
    } else if (vertice == 2) {
      System.out.println("  *");
      System.out.println(" **");
      System.out.println("***");
      System.out.println(" **");
      System.out.println("  *");
    } else if (vertice == 3) {
      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
      System.out.println("**");
      System.out.println("*");
    }
  }
}
