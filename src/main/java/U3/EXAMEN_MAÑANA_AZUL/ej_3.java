package U3.EXAMEN_MAÑANA_AZUL;

import java.util.Arrays;

public class ej_3 {

  public static void main(String[] args) {


    String posRey = "c2";
    String posReina = "e5";

    if (jaque(posRey, posReina)) {
      System.out.println("El rey está en jaque");
    } else {
      System.out.println("El rey no está en jaque");
    }


  }

  public static boolean jaque(String posRey,String posReina) {


    String[][] tablero = new String[8][8];

    String letra = "abcdefgh";
    int numero = 8;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letra.charAt(j) + String.valueOf(numero);
      }
      numero--;
      System.out.println(Arrays.toString(tablero[i]));
    }

    int xra = 0;
    int yra = 0;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (tablero[i][j].equalsIgnoreCase(posReina)) {
          xra = i;
          yra = j;
        }
      }
    }

    boolean jaque = false;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (tablero[xra][i].equalsIgnoreCase(posRey)) {
          return true;
        }
        if (tablero[i][yra].equalsIgnoreCase(posRey)) {
          return true;
        }
      }
    }

    int repxra = xra;
    int repyra = yra;

    while (repxra >= 0 && repxra < tablero.length && repyra >= 0 && repyra < tablero.length) {
      if (tablero[repxra][repyra].equalsIgnoreCase(posRey)) {
        return true;
      }
      repxra++;
      repyra++;
    }

    repxra = xra;
    repyra = yra;

    while (repxra >= 0 && repxra < tablero.length && repyra >= 0 && repyra < tablero.length) {
      if (tablero[repxra][repyra].equalsIgnoreCase(posRey)) {
        return true;
      }
      repxra--;
      repyra++;
    }

    repxra = xra;
    repyra = yra;

    while (repxra >= 0 && repxra < tablero.length && repyra >= 0 && repyra < tablero.length) {
      if (tablero[repxra][repyra].equalsIgnoreCase(posRey)) {
        return true;
      }
      repxra++;
      repyra--;
    }

    repxra = xra;
    repyra = yra;

    while (repxra >= 0 && repxra < tablero.length && repyra >= 0 && repyra < tablero.length) {
      if (tablero[repxra][repyra].equalsIgnoreCase(posRey)) {
        return true;
      }
      repxra--;
      repyra--;
    }

    return false;
  }
}
