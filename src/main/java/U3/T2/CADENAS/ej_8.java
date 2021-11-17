package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String d1 = "Javalín, javalón";
    String d2 = "javalén, len, len";

    System.out.println("Escriba aquí: ");
    String texto = teclado.nextLine();

    if (d1.equals(texto.substring(0, d1.length()))) {
      System.out.println("Es el idioma de Javalandia");
      System.out.println(texto.substring(d1.length(), texto.length()));
    } else if (d2.equals(texto.substring(texto.length() - d2.length(), texto.length()))) {
      System.out.println("Es el idioma de Javalandia");
      System.out.println(texto.substring(0, texto.length() - d2.length()));
    }
  }
}
