package U3.ENTREGABLE_19_20;

import java.util.Arrays;

public class ej_3 {
    public static void main(String[] args) {

        int[] matriz = new int[10];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) (Math.random() * 1001);
        }

        System.out.println(Arrays.toString(matriz));

        System.out.println(Arrays.toString(filtraCon7(matriz)));


    }

    public static int[] filtraCon7(int x[]) {

        int y[] = new int[0];

        boolean contiene7 = false;
        int divisor, resto;
        int contador = 0;

        for (int i = 0; i < x.length; i++) {

            contiene7 = false;

            divisor = x[i];

            while (divisor != 0) {

                if (divisor == 7) {
                    contiene7 = true;
                    break;
                }

                resto = divisor % 10;

                if (resto == 7) {
                    contiene7 = true;
                    break;
                }

                divisor = divisor / 10;
            }

            if (contiene7) {
                y = Arrays.copyOf(y, y.length + 1);
                y[contador] = x[i];
                contador++;
            }
        }

        if (y.length == 0) {
            y = Arrays.copyOf(y, y.length + 1);
            y[0] = 1;
        }

        return y;
    }


}
