package U3.ENTREGABLE_19_20;

public class ej_5 {
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int[] b = {52, 37};

        System.out.println(aleatorioDeArray(a));
        System.out.println(aleatorioDeArray(b));
    }

    public static int aleatorioDeArray(int[] a) {
        int aleatorio = (int) (Math.random() * a.length);
        aleatorio = a[aleatorio];
        return aleatorio;
    }
}

