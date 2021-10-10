package U1.T5II;

import java.util.Scanner;

public class ej5_24 {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
  String t1 = teclado.next();
  int j1 = 0;
  if (t1.equals("piedra")) {
    j1 = 1;
  } else if (t1.equals("papel")) {
    j1 = 2;
  } else if (t1.equals("tijera")) {
    j1 = 3;
  } else {
      System.out.println("ERROR");
      System.exit(0);
  }
  System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
  String t2 = teclado.next();
    int j2 = 0;
    if (t2.equals("piedra")) {
      j2 = 1;
    } else if (t2.equals("papel")) {
      j2 = 2;
    } else if (t2.equals("tijera")) {
      j2 = 3;
    } else {
      System.out.println("ERROR");
      System.exit(0);
    }
    if (j1 == j2) {
      System.out.println("Empate");
    } else if ((j1 == 1 && j2 == 3) || (j1 == 2 && j2 == 1) || (j1 == 3 && j2 == 2)) {
      System.out.println("Gana el jugador 1");
    } else {
      System.out.println("Gana el jugador 2");
    }
  }
}
