package U1.T5;

import java.util.Scanner;

public class ej5_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor 12: ");

        byte n = teclado.nextByte();
        if (n == 12)
            System.out.println("Es correcto");
        else
            System.out.println("Es incorrecto");
    }

}

