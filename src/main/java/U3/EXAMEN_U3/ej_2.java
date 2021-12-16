package U3.EXAMEN_U3;

import java.util.Arrays;

public class ej_2 {
  public static void main(String[] args) {

    int[] indice = {0,1,2,3,4,5,6,7,8,9};
    int[] random = new int[10];

    for (int i = 0; i < random.length; i++) {
      random[i] = (int) (12 + Math.random() * 78);
    }

    System.out.println(Arrays.toString(indice));
    System.out.println(Arrays.toString(random));

    System.out.println();

    int[] orden = new int[10];

    int contador = 0;

    for (int i = 0; i < random.length; i++) {
        if (random[i] % 2 == 0) {
          orden[contador] = random[i];
          contador++;
        }
    }

    for (int i = 0; i < random.length; i++) {
      if (random[i] % 2 != 0) {
        orden[contador] = random[i];
        contador++;
      }
    }

    System.out.println(Arrays.toString(indice));
    System.out.println(Arrays.toString(orden));
  }
}
