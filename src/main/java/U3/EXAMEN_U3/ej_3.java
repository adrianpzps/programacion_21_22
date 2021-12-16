package U3.EXAMEN_U3;

import java.util.Arrays;
import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una palabra: ");
    String cadena = teclado.next();

    System.out.println(Arrays.toString(invertir(cadena)));
    System.out.println(Arrays.toString(desplazarVocales(cadena)));
  }

  public static String[] invertir(String cadena) {

    StringBuilder reverso = new StringBuilder(cadena);
    reverso.reverse();

    String[] lp = new String[reverso.length()];

    char letra;

    for (int i = 0; i < reverso.length(); i++) {
      letra = reverso.charAt(i);
      lp[i] = String.valueOf(letra);
    }

    return lp;
  }

  public static String[] desplazarVocales(String cadena) {

    StringBuilder caddes = new StringBuilder(cadena);

    String[] letdes = new String[cadena.length()];

    String prov = "";
    char let;
    for (int i = 0; i < cadena.length(); i++) {
      let = caddes.charAt(i);
      if (caddes.charAt(i) == 'a') {
        letdes[i] = "e";
      } else if (caddes.charAt(i) == 'e') {
        letdes[i] = "i";
      } else if (caddes.charAt(i) == 'i') {
        letdes[i] = "o";
      } else if (caddes.charAt(i) == 'o') {
        letdes[i] = "u";
      } else if (caddes.charAt(i) == 'u') {
        letdes[i] = "a";
      } else {
        letdes[i] = String.valueOf(let);
      }
    }
    return letdes;
  }
}
