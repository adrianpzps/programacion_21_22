package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;
import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String[][] tablero = new String[8][8];

    System.out.println("Introduzca la posición del alfil: ");
    String posicion = teclado.next();
    String letras = "abcdefgh";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
      System.out.println(Arrays.toString(tablero[i]));
    }

    int x = -1;
    int y = -1;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (tablero[i][j].equalsIgnoreCase(posicion)) {
          x = i;
          y = j;
        }
      }
    }

    int rx = x;
    int ry = y;

    x++;
    y++;

    while (x >= 0 && x < tablero.length && y >= 0 && y < tablero.length) {
      System.out.print(tablero[x][y] + " ");

      x++;
      y++;
    }

    x = rx;
    y = ry;

    x--;
    y--;

    while (x >= 0 && x < tablero.length && y >= 0 && y < tablero.length) {
      System.out.print(tablero[x][y] + " ");

      x--;
      y--;
    }

    x = rx;
    y = ry;

    x++;
    y--;

    while (x >= 0 && x < tablero.length && y >= 0 && y < tablero.length) {
      System.out.print(tablero[x][y] + " ");

      x++;
      y--;
    }

    x = rx;
    y = ry;

    x--;
    y++;

    while (x >= 0 && x < tablero.length && y >= 0 && y < tablero.length) {
      System.out.print(tablero[x][y] + " ");

      x--;
      y++;
    }
  }
}
