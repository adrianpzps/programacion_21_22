package U7.T3B.ej4;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    Traductor t1 = new Traductor("/home/aperezp/Escritorio/PROG/src/main/java/U7/T3B/ej4/Diccionario.txt");

    System.out.println(t1.traduce("hola"));

    System.out.println("Introduzca una frase");
    String frase = teclado.nextLine();

    System.out.println(t1.traduce2(frase));
  }
}
