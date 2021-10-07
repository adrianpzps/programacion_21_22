package U1.T5II;

import java.util.Scanner;

public class ej5_16 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un numero: ");
    int cifra = teclado.nextInt();

    int udcifra = cifra % 10;
    System.out.println(udcifra);
  }
}
