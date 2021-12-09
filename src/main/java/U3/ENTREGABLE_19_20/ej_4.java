package U3.ENTREGABLE_19_20;

public class ej_4 {
    public static void main(String[] args) {

        int[] a = {};
        int[] b = {8};
        int[] c = {6, 2, 5, 0, 1};

        String sa = convierteArrayEnString(a);
        String sb = convierteArrayEnString(b);
        String sc = convierteArrayEnString(c);

        System.out.println(sa);
        System.out.println(sb);
        System.out.println(sc);
    }

    public static String convierteArrayEnString(int[] a) {
        String cadena = "";

        for (int i = 0; i < a.length; i++) {
            cadena += a[i];
        }

        return cadena;
    }

}
