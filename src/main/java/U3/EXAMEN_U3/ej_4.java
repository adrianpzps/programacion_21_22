package U3.EXAMEN_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int n = teclado.nextInt();

    System.out.println(convierteEnPalabras(n));

  }

  public static String convierteEnPalabras(int n) {

    String strn = String.valueOf(n);
    String[] cadena = new String[strn.length()];
    char num;
    for (int i = 0; i < strn.length(); i++) {
      num = strn.charAt(i);
      if (num == '0') {
        cadena[i] = "cero";
      }
      if (num == '1') {
        cadena[i] = "uno";
      }
      if (num == '2') {
        cadena[i] = "dos";
      }
      if (num == '3') {
        cadena[i] = "tres";
      }
      if (num == '4') {
        cadena[i] = "cuatro";
      }
      if (num == '5') {
        cadena[i] = "cinco";
      }
      if (num == '6') {
        cadena[i] = "seis";
      }
      if (num == '7') {
        cadena[i] = "siete";
      }
      if (num == '8') {
        cadena[i] = "ocho";
      }
      if (num == '9') {
        cadena[i] = "nueve";
      }
    }

    String nap = "";

    for (int i = 0; i < cadena.length; i++) {
      nap = nap.concat(cadena[i]);
      if (i < cadena.length - 1) {
        nap = nap.concat(", ");
        }
    }

    return nap;
  }
}
