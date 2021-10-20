package U1.T8b;

import java.util.Scanner;

public class ej8_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia1 = 0;
        int dia2 = 0;
        int hora1 = -1;
        int hora2 = -1;

        while (dia1 < 1 || dia1 > 7) {
            System.out.println("Introduzca el primer dia de la semana:\n1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Vienes\n6. Sabado\n7. Domingo");
            dia1 = teclado.nextInt();
        }
        while (hora1 < 0 || hora1 > 23) {
            System.out.println("Introduzca su hora de 0-23");
            hora1 = teclado.nextInt();
        }
        while (dia2 < 1 || dia2 > 7 || dia2 <= dia1) {
            System.out.println("Introduzca el segundo dia de la semana:\n1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Vienes\n6. Sabado\n7. Domingo");
            dia2 = teclado.nextInt();
        }
        while (hora2 < 0 || hora2 > 23) {
            System.out.println("Introduzca su hora de 0-23");
            hora2 = teclado.nextInt();
        }

        int horas = ((dia2 - dia1)*24) - hora1 + hora2;

        System.out.println("Han transcurrido " + horas + "h");
    }
}
