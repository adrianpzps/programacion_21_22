package U3.EXAMEN_2021_MAÑANA_ROJO;

import java.util.Arrays;

public class ej_4 {
    public static void main(String[] args) {

        int m1t1 = 3;
        int m1t2 = 3;

        String[][] matriz1 = new String[m1t1][m1t2];

        matriz1[0] = new String[]{"hola", "hola", "hola"};
        matriz1[1] = new String[]{"hola", "hola", "hola"};
        matriz1[2] = new String[]{"hola", "hola", "hola"};

        int m2t1 = 3;
        int m2t2 = 3;

        String[][] matriz2 = new String[m2t1][m2t2];

        matriz2[0] = new String[]{"holaa", "holaasda", "holaa"};
        matriz2[1] = new String[]{"holaa", "hosdalaa", "holaa"};
        matriz2[2] = new String[]{"holaa", "holaasad", "holaa"};

        String[][] matrizresultante = new String[0][0];

        if (m1t1 == m2t1 && m1t2 == m2t2) {

            matrizresultante = Arrays.copyOf(matriz1, matriz1.length);

            System.out.println();

            for (int i = 0; i < matriz1.length; i++) {
                matrizresultante[i] = Arrays.copyOf(matriz1[i], matrizresultante.length + matriz2.length);
            }

            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    matrizresultante[i][matriz2.length + j] = matriz2[i][j];
                }
            }

            System.out.println(Arrays.deepToString(matrizresultante));
        } else {
            System.out.println(Arrays.deepToString(matrizresultante));
        }
    }
}
