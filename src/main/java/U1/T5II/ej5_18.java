package U1.T5II;

import java.util.Scanner;

public class ej5_18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca nota 1: ");
    double nota1 = teclado.nextDouble();
    System.out.println("Introduzca nota 2: ");
    double nota2 = teclado.nextDouble();

    double notam = ((nota1 + nota2) / 2);

    if (notam >= 5) {
      System.out.println("Aprobado, nota media: " + notam);
    } else if (notam < 5) {
      System.out.println(
          "¿Cuál ha sido el resultado de la recuperación?\nIntroduzca 1 para apto y 0 para no apto");
    }
    int recu = teclado.nextInt();
    if (recu == 1) {
      System.out.println("Su nota es 5");
    } else if (recu == 0) {
      System.out.println("Su nota es " + notam);
    }
  }
}
