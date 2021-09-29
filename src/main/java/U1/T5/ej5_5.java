package U1.T5;

import java.util.Scanner;

public class ej5_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        long n1 = teclado.nextLong();
        System.out.println("Introduzca el segundo numero: ");
        long n2 = teclado.nextLong();
        System.out.println("Introduzca el tercer numero: ");
        long n3 = teclado.nextLong();

        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 es el mayor");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 es el mayor");
        }
        else if (n3 > n1 && n3 > n2) {
            System.out.println("n3 es el mayor");
        }
    }

}
