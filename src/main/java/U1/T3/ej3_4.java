package U1.T3;

import java.util.Scanner;

public class ej3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("INTRODUZCA EL NUMERO: ");
        float milla = 1609;
        float numero = teclado.nextInt();
        System.out.println(numero + " MILLAS");
        System.out.println("ESTE ES EL RESULTADO DE MILLAS EM KM: " + (milla * numero)/1000);
    }
}