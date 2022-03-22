package U6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej4 {
  public static void main(String[] args) {

    String texto = "";
    int contadorlineas = 0;
    int contadorpalabras = 1;

    try {
      BufferedReader in = new BufferedReader(new FileReader("carta.txt"));
      String linea = in.readLine();
      while (linea != null) {
        texto += linea + "\n";
        linea = in.readLine();
        contadorlineas++;
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    for (int i = 0; i < texto.length(); i++) {
      char carac = texto.charAt(i);
      if (carac == ' ') {
        contadorpalabras++;
      }
    }

    System.out.println(texto);

    System.out.println("Carácteres: " + texto.length() + "\nLineas: " + contadorlineas + "\nPalabras: " + contadorpalabras);
  }
}
