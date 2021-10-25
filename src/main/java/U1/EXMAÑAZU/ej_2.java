package U1.EXMAÑAZU;

import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número entero positivo: ");
        int num = teclado.nextInt();

        while (num < 1) {
            System.out.print("ERROR - Introduzca el numero entero positivo de nuevo: ");
            num = teclado.nextInt();
        }

        System.out.print("Posición inicial: ");
        int pi = teclado.nextInt();
        System.out.print("Posición final: ");
        int pf = teclado.nextInt();

        int cociente = num;
        int resto;
        int var = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            var = (var * 10) + resto;
        }

        cociente = var;
        var = 0;

        for (int i = 0; cociente > 0; i++) {

            if (i < pi || i > pf) {
                resto = cociente % 10;
                cociente = cociente / 10;
                var = (var * 10) + resto;
            } else {
                cociente = cociente / 10;
            }
        }

        System.out.print("El numero resultante es: " + var);
    }

}
