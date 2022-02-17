package U6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un fichero: ");

    String nombre_fichero = sc.nextLine();

    if (nombre_fichero.equals("")) {
      nombre_fichero = "prueba.txt";
    }

    String texto = "";

    try {
      FileReader in = new FileReader(nombre_fichero);
      int c = in.read();
      while (c != -1) {
        texto += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(texto);
  }

}
