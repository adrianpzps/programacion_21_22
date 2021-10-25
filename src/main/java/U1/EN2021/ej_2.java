package U1.EN2021;

import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número entero positivo: ");
        long n = teclado.nextLong();

        long cociente = n;
        long resto = 0;
        long var1 = 0;
        long digi = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            if (resto == 0 || resto == 8) {
                digi++;
            } else {
                var1 = (var1 * 10) + resto;
            }
        }

        cociente = var1;
        resto = 0;
        long var2 = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            var2 = (var2 * 10) + resto;
        }

        System.out.println("Número resultado: " + var2);
        System.out.println("Dígitos eliminados: " + digi);




    }


}
