package U7.T1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ej6 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nombre = " ";

    Set<String> lista = new LinkedHashSet<>();

    while (!nombre.equals("fin")) {
      System.out.println("Introduzca un nombre: ");
      nombre = teclado.next();
      if (!nombre.equals("fin"))
      lista.add(nombre);
    }

    System.out.println(lista);
  }
}
