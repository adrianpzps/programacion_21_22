package U5.T9;

import java.util.Arrays;
import java.util.Collections;

public class main {
  public static void main(String[] args) {

    lavadora[] array = new lavadora[6];

    lavadora lavadora1 = new lavadora();

    System.out.println(lavadora1);

    lavadora lavadora2 = new lavadora(200, 65.5);

    System.out.println(lavadora2);

    lavadora lavadora3 = new lavadora(8);

    System.out.println(lavadora3);

    lavadora lavadora4 = new lavadora(35);

    System.out.println(lavadora4);

    lavadora lavadora5 = new lavadora(45);

    System.out.println(lavadora5);

    lavadora lavadora6 = new lavadora(15);

    System.out.println(lavadora6);

    array[0] = lavadora1;
    array[1] = lavadora2;
    array[2] = lavadora3;
    array[3] = lavadora4;
    array[4] = lavadora5;
    array[5] = lavadora6;

    System.out.println("-------------------------------------------");

    imprimir(array);

    System.out.println("-------------------------------------------");

    Arrays.sort(array);

    imprimir(array);

    System.out.println("-------------------------------------------");

    comparalavadorapreciofinal comlav = new comparalavadorapreciofinal();

    Arrays.sort(array, comlav);

    imprimir(array);




  }

  public static void imprimir(lavadora[] array) {

    for (lavadora l : array) {
      System.out.println(l);
    }

    System.out.println("------------------");

  }

}
