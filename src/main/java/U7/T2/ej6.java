package U7.T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej6 {

  public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca una cadena: ");
    String cadena = teclado.next();

    System.out.println(leeCadena(cadena));

  }

  public static List<Character> leeCadena(String cadena) {

    List<Character> listacar = new ArrayList<>();

    for (int i = 0; i <cadena.length(); i++) {
      Character aux = cadena.charAt(i);
      listacar.add(i,aux);
    }

    return listacar;
  }

}
