package U7.T1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una frase: ");
    String frase = teclado.nextLine();
    frase = frase.concat(" ");
    ArrayList<String> palabras = new ArrayList<>();

    int index = 0;
    for (int i = 0; i < frase.length(); i++) {
      Character carac = frase.charAt(i);
      if (carac.toString().equals(" ")) {
        palabras.add(frase.substring(index, i));
        index = i + 1;
      }
    }

    for (String p : palabras) {
      System.out.print(p + ", ");
    }

    ArrayList<String> palabrasrep = new ArrayList<>();
    ArrayList<String> palabrasnorep = new ArrayList<>();

    for (int i = 0; i < palabras.size(); i++) {
      if (Collections.frequency(palabrasnorep,palabras.get(i)) == 0) {
        palabrasnorep.add(palabras.get(i));
      } else {
        palabrasrep.add(palabras.get(i));
      }
    }

    System.out.println();
    System.out.println(palabrasrep);
    palabrasnorep.removeAll(palabrasrep);
    System.out.println(palabrasnorep);
  }
}
