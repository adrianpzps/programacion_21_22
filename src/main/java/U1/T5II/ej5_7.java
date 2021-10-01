package U1.T5II;

import java.util.Scanner;

public class ej5_7 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("introduzca nota 1: ");
    double nota1 = teclado.nextDouble();
    System.out.print("introduzca nota 2: ");
    double nota2 = teclado.nextDouble();
    System.out.print("introduzca nota 3: ");
    double nota3 = teclado.nextDouble();
    double notam = ((nota1 + nota2 + nota3) / 3);

    if (notam < 5) {
      System.out.println("Insuficiente");
    } else if (notam > 5 && notam < 6) {
      System.out.println("Suficiente");
    } else if (notam > 6 && notam < 7) {
      System.out.println("Bien");
    } else if (notam > 7 && notam < 9) {
      System.out.println("Notable");
    } else System.out.println("Sobresaliente");
  }
}
