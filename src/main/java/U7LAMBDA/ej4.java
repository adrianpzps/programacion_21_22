package U7LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej4 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una frase: ");
    String cadena = teclado.nextLine();
    System.out.println(cadena);
    cadena = cadena.concat(" ");

    List<String> lista = new ArrayList<>();

    int index = 0;
    for (int i = 0; i < cadena.length(); i++) {
      Character carac = cadena.charAt(i);
      if (carac.toString().equals(" ")) {
        lista.add(cadena.substring(index, i));
        index = i + 1;
      }
    }

    lista.stream().sorted().forEach(System.out::println);

  }
}
