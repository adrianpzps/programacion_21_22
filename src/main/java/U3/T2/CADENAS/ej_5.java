package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca su nombre completo: ");
    String frase = teclado.nextLine();

    for (int i = 0; i < frase.length(); i++) {
      Character carac = frase.charAt(i);
      if (carac.toString().equalsIgnoreCase("a")) {

      } else if (carac.toString().equalsIgnoreCase("e")) {

      } else if (carac.toString().equalsIgnoreCase("i")) {

      } else if (carac.toString().equalsIgnoreCase("o")) {

      } else if (carac.toString().equalsIgnoreCase("u")) {

      } else if (carac.toString().equalsIgnoreCase("á")) {

      } else if (carac.toString().equalsIgnoreCase("é")) {

      } else if (carac.toString().equalsIgnoreCase("í")) {

      } else if (carac.toString().equalsIgnoreCase("ó")) {

      } else if (carac.toString().equalsIgnoreCase("ú")) {

      } else {
        System.out.print(carac);
      }
    }
  }
}
