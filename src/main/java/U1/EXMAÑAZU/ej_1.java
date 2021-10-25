package U1.EXMAÑAZU;

import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("COMPROBAMOS SI UN NÚMERO ES PRIMO");
        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(numero + " ES PRIMO");
        } else {
            System.out.println(numero + " NO ES PRIMO");
        }
    }


}
