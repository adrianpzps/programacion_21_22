package U1.T8;

import java.util.Scanner;

public class ej8_14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    int numero = teclado.nextInt();

    for ( int fil = 1 ; fil <= numero ; fil++ ) {
      for ( int col = fil ; col <= numero ; col++ ) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
