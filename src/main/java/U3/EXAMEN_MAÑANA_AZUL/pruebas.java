package U3.EXAMEN_MAÑANA_AZUL;

import java.util.Arrays;

public class pruebas {
  public static void main(String[] args) {

      int uno = 1;
      int dos = 2;


    for ( String[] fila: juanito(uno,dos)) {
      System.out.println(Arrays.toString(fila));
    }

    for (int i = 0; i < juanito(uno, dos).length; i++) {
      for (int j = 0; j < juanito(uno, dos)[i].length; j++) {
      }
        System.out.println(Arrays.toString(juanito(uno, dos)[i]));
    }
  }

  public static String[][] juanito (int uno, int dos) {

      String[][] pepito = new String[4][5];

      for(int i = 0; i < pepito.length; i++) {
          for(int j = 0; j < pepito[i].length; j++) {
              pepito[i][j] = "asd";
          }
      }


      return pepito;
  }
}
