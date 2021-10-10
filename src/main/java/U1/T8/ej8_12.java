package U1.T8;

import java.util.Scanner;

public class ej8_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la nota: ");
    int nota1 = teclado.nextInt();
    System.out.println("Introduzca la nota: ");
    int nota2 = teclado.nextInt();
    System.out.println("Introduzca la nota: ");
    int nota3 = teclado.nextInt();
    System.out.println("Introduzca la nota: ");
    int nota4 = teclado.nextInt();
    System.out.println("Introduzca la nota: ");
    int nota5 = teclado.nextInt();

    if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5 && nota4 >= 5 && nota5 >= 5) {
      System.out.println("Todos aprobados");
    } else {
      System.out.println("Hay suspenso/s");
    }
  }
}
