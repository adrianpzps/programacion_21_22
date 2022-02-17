package U6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej3 {

  public static void main(String[] args) {

    String texto1 = "Holaqtal";

    try {
      FileWriter in = new FileWriter("original.txt");
      in.write(texto1);
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    String texto2 = "";

    try {
      FileReader in = new FileReader("original.txt");
      int c = in.read();
      while (c != -1) {
        texto2 += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(texto2);

    try {
      FileWriter in = new FileWriter("copia.txt");
      in.write(texto2);
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    String texto3 = "";

    try {
      FileReader in = new FileReader("copia.txt");
      int c = in.read();
      while (c != -1) {
        texto3 += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(texto3);

    String concat = "copia_de";

    try {
      FileWriter in = new FileWriter(concat + "original.txt");
      in.write(texto2);
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

  }




}
