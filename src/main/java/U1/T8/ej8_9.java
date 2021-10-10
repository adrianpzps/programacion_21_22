package U1.T8;

import java.util.Scanner;

public class ej8_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int aarbol = 0;
    int earbol = 0;
    int amalto = 0;
    int eamalto = 0;

    while (aarbol != -1) {
      System.out.println("Introduzca la altura del arbol en cm: ");
      aarbol = teclado.nextInt();
      if (aarbol > amalto) {
        amalto = aarbol;
        eamalto = earbol;
      }
      earbol++;
    }
    System.out.println("El arbol mas alto es el etiqueta " + eamalto + " y mide " + amalto + "cm");
  }
}
