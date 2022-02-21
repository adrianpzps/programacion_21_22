package U5.T9;

import java.util.Arrays;
import java.util.Collections;

public class main {
  public static void main(String[] args) {

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

    lavadora[] array = new lavadora[6];

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

    television t1 = new television(100, electrodomestico.enumColor.Blanco, electrodomestico.enumConsumoEnergetico.B,20.3,30,true);
    television t2 = new television();
    television t3 = new television(300, 25.5);
    television t4 = new television(20, 5.3);


    System.out.println("-------------------------------------------");

    System.out.println();
    System.out.println(t1);

    electrodomestico[] Earray = new electrodomestico[10];

    Earray[0] = lavadora1;
    Earray[1] = lavadora2;
    Earray[2] = lavadora3;
    Earray[3] = lavadora4;
    Earray[4] = lavadora5;
    Earray[5] = lavadora6;
    Earray[6] = t1;
    Earray[7] = t2;
    Earray[8] = t3;
    Earray[9] = t4;

    System.out.println("------------------------ ARRAY DE ELECTRODOMESTICOS ----------------------------");
    System.out.println();
    imprimir2(Earray);

    System.out.println();

  }

  public static void imprimir(lavadora[] array) {

    for (lavadora l : array) {
      System.out.println(l);
    }

    System.out.println("------------------");

  }

  public static void imprimir2(electrodomestico[] Earray) {

    for (electrodomestico e : Earray) {
      System.out.println(e);
    }

    System.out.println("------------------");

  }

}
