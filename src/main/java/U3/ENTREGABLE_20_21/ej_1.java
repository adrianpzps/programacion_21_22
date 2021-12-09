package U3.ENTREGABLE_20_21;

import java.util.Arrays;

public class ej_1 {
    public static void main(String[] args) {

        int[] array = {3, 432, 465, 23, 76, 11, 7, 543, 93};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(filtraPrimos(array)));

    }

    public static int[] filtraPrimos(int[] array) {

        int[] arrayfp = new int[0];

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            boolean primo = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                arrayfp = Arrays.copyOf(arrayfp, arrayfp.length + 1);
                arrayfp[contador] = array[i];
                contador++;
            }

        }

        if (arrayfp.length == 0) {
            arrayfp = Arrays.copyOf(arrayfp, arrayfp.length + 1);
            arrayfp[0] = -1;
        }

        return arrayfp;
    }
}
