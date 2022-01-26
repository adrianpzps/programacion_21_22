package U4.E7;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    sintonizador s1 = new sintonizador();

    String mod = "";

    while (!mod.equalsIgnoreCase("exit")) {

      System.out.println("La frecuencia actual es " + s1.getFreq() + " MHz");
      System.out.println("Para subir introduzca up, para bajar down y exit para salir");
      mod = sc.next();

      s1.var(mod);

    }

  }
}
