package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;
import java.util.Scanner;

public class ej_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String[] palabras = new String[8];
    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };

    for (int i = 0; i < palabras.length; i++) {
      System.out.println("Introduzca una palabra: ");
      palabras[i] = teclado.next();
    }
    System.out.println(Arrays.toString(palabras));

    for (int i = 0; i < palabras.length; i++) {
      for (int j = 0; j < colores.length; j++) {
        if (palabras[i].equals(colores[j])) {
          System.out.print(palabras[i] + ", ");
        }
      }
    }
    for (int i = 0; i < palabras.length; i++) {
      boolean no_color = false;
      for (int j = 0; j < colores.length; j++) {
        if (palabras[i].equals(colores[j])) {
          no_color = true;
          break;
        }
      }
      if (!no_color) {
        System.out.print(palabras[i] + ", ");
      }
    }
  }
}
