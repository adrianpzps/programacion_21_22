package U3.T4.TABLAS.ADICIONALES;

import java.util.Arrays;

public class ej_6 {
  public static void main(String[] args) {

    int[][] array = new int[6][10];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (0 + Math.random() * 1001);
        boolean repetido = false;
        for (int k = 0; k < array.length; k++) {
          for (int l = 0; l < array[i].length; l++) {
            if (array[k][l]==array[i][j]) {
              repetido = true;
              break;
            }
          }
        }
       // if () {

        }
      }
    }
    //for (int i = 0; i < array.length; i++) {
      //System.out.println(Arrays.toString(array[i]));
    }




