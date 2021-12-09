package U3.EXAMEN;

import java.util.Arrays;

public class ej_2 {
  public static void main(String[] args) {

    int[] v1 = {0, 1, 2, 3, 4};
    int[] v2 = {5, 6, 7, 8, 9};

    int pos = 7;

    int[] vr = insertarEnVector(v1,v2,pos);

    System.out.println(Arrays.toString(vr));
  }
  public static int[] insertarEnVector(int[] v1, int [] v2, int pos) {
    int[] v3 = new int[0];
    if (pos < 0) {
      v3 = v1;
    } else if (pos > v1.length) {
      v3 = v2;
    } else {
      v3 = new int[v1.length + v2.length];

      int contador = 0;
      int contador2 = 0;

      for (int i = 0; i < v3.length; i++) {
        if (i < pos) {
          v3[i] = v1[i];
          contador2++;
        } else if (i >= pos && i < (pos + v2.length)) {
          v3[i] = v2[contador];
          contador++;
        } else {
          v3[i] = v1[contador2];
          contador2++;
        }
      }
    }
    return v3;
  }
}
