package U1.EN1920;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        long num = teclado.nextLong();

        long cociente = num;
        double resto;
        double binario = 0;
        double contador = 0;

        while (cociente != 0) {

            resto = cociente % 2;
            cociente = cociente / 2;
            binario = binario + resto * Math.pow(10, contador);
            contador++;
        }
        System.out.println(num + " en binario es: " + (long) binario);
    }
}

