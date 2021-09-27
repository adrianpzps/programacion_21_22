package U1.T5;

import java.util.Scanner;

public class ej5_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor: ");
        int n = teclado.nextInt();
        if (n > 0)
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");
    }
}
