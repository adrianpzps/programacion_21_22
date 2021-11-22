package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_5 {
  public static void main(String[] args) {

    int[] a1 = {7, 8, 9, 10, 11, 12};
    Arrays.sort(a1);
    System.out.println(Arrays.toString(a1));
    int[] a2 = {1, 2, 3, 4, 5, 6};
    Arrays.sort(a2);
    System.out.println(Arrays.toString(a2));

    int[] r = new int[a1.length + a2.length];
    int cr = 0;
    int ca1 = 0;
    int ca2 = 0;

    while (cr != r.length) {

      if (ca1 == a1.length) {
        r[cr] = a2[ca2];
        ca2++;
        cr++;
      } else if (ca2 == a2.length) {
        r[cr] = a1[ca1];
        ca1++;
        cr++;
      } else if (a1[ca1] <= a2[ca2]) {
        r[cr] = a1[ca1];
        ca1++;
        cr++;
      } else {
        r[cr] = a2[ca2];
        ca2++;
        cr++;
      }
    }

    System.out.println(Arrays.toString(r));
  }
}
