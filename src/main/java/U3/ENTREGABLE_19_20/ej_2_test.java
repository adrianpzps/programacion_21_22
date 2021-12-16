package U3.ENTREGABLE_19_20;

import java.util.Arrays;

public class ej_2_test {
    public static void main(String[] args) {

        int[][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(matriz[i]));
        }

        // AUMENTA UNA FILA

        matriz = Arrays.copyOf(matriz, matriz.length + 1);

        // GENERAMOS COLUMNAS DE FILA NUEVA

        matriz[matriz.length-1] = new int[matriz[0].length];

        // AUMENTAMOS EL NÚMERO DE COLUMNAS

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Arrays.copyOf(matriz[i], matriz[i].length + 1);
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        int sumac = 0;

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            sumac = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][matriz[i].length - 1] = sumac;
                sumac = sumac + matriz[i][j];
                matriz[matriz.length - 1][j] = matriz[0][j] + matriz[1][j] + matriz[2][j] + matriz[3][j];
            }
            System.out.println(Arrays.toString(matriz[i]));
        }






    }
}
