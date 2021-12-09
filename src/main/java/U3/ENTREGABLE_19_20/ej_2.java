package U3.ENTREGABLE_19_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ej_2 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][5];
        int[][] matrizresultado;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca un número: ");
                int random = (int) (Math.random() * 21);
                System.out.println(random);
                matriz[i][j] = random;
            }
        }

        // Aumenta 1 fila, con 1 mas.

        matrizresultado = Arrays.copyOf(matriz, matriz.length + 1);
        matrizresultado[matrizresultado.length - 1] = new int[matriz[0].length + 1];

        // Aumenta 1 columna

        for (int i = 0; i < matriz.length; i++) {
            matrizresultado[i] = Arrays.copyOf(matriz[i], matrizresultado.length + 1);
        }

        int suma;

        // suma columnas

        for (int i = 0; i < matrizresultado[0].length; i++) {

            matrizresultado[4][i] = matrizresultado[0][i] + matrizresultado[1][i] + matrizresultado[2][i] + matrizresultado[3][i];
        }

        // suma filas

        for (int i = 0; i < matrizresultado.length; i++) {
            suma = 0;
            for (int j = 0; j < matrizresultado[i].length-1; j++) {
                suma = suma + matrizresultado[i][j];
                matrizresultado[i][5] = suma;
            }
        }

        for (int i = 0; i < matrizresultado.length; i++) {
            for (int j = 0; j < matrizresultado[i].length; j++) {
            }
            System.out.println(Arrays.toString(matrizresultado[i]));
        }
    }
}




