package U6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      FileWriter in = new FileWriter("datos2.txt", true);
      System.out.println("Introduzca su nombre: ");
      String nombre = sc.nextLine();
      in.write("NOMBRE: " + nombre);
      System.out.println("Introduzca su edad: ");
      String edad = sc.nextLine();
      in.write("\nEDAD: " + edad);
      in.write("\n");
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

  }
}
