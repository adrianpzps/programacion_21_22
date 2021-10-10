package U1.T8;

import java.util.Scanner;

public class ej8_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int nota;
    int aprobados = 0;
    int condicional = 0;
    int suspensos = 0;

    for (int var = 1; var <= 6; var++) {
      System.out.println("Introduzca la nota: ");
      nota = teclado.nextInt();
      if (nota >= 5) {
        aprobados++;
      } else if (nota == 4) {
        condicional++;
      } else {
        suspensos++;
      }
    }
    System.out.println("Aprobados: " + aprobados);
    System.out.println("Condicional: " + condicional);
    System.out.println("Suspensos: " + suspensos);
  }
}
