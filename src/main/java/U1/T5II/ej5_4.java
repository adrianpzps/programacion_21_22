package U1.T5II;

import java.util.Scanner;

public class ej5_4 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca el numero de horas: ");

    int hora = teclado.nextInt();
    int normal = 12;
    int extra = 16;

    if (hora <= 40) {
      System.out.println("El salario es: " + (hora * normal));
    } else {
      System.out.println("El salario es: " + ((normal * 40) + ((hora - 40) * extra)));
    }
  }
}
