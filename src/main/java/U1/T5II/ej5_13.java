package U1.T5II;

import java.util.Scanner;

public class ej5_13 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int num = teclado.nextInt();

    if (num % 5 == 0 && num % 2 == 0) {
      System.out.println(num + " es divisible entre 5 y es un numero par");
    }
    else if (num % 5 == 0 && num % 2 != 0) {
      System.out.println(num + " es divisible entre 5 y es un numero impar");
    }
    else if (num % 5 != 0 && num % 2 == 0) {
      System.out.println(num + " es indivisible entre 5 y es un numero par");
    }
    else {
      System.out.println(num + " es indivisible entre 5 y es un numero impar");
    }
  }
}