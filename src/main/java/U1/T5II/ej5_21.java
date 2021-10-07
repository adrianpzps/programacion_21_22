package U1.T5II;

import java.util.Scanner;

public class ej5_21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println(
        "Introduzca su cargo:\n1 - Prog. junior\n2 - Prog. senior\n3 - Jefe de proyecto");
    int cargo = teclado.nextInt();
    System.out.println("Dias que ha estado viajando este mes visitando clientes: ");
    int diasv = teclado.nextInt();
    System.out.println("Su estado civil:\n1 - Soltero\n2 - Casado");
    int scivil = teclado.nextInt();

    int sueldo = 0;

    if (cargo == 1) {
      sueldo = 950;
    } else if (cargo == 2) {
      sueldo = 1200;
    } else if (cargo == 3) {
      sueldo = 1600;
    }

    int dieta = diasv * 30;
    int sueldob = sueldo + dieta;
    int reten = 0;

    if (scivil == 1) {
      reten = (sueldob * 25) / 100;
    } else if (scivil == 2) {
      reten = (sueldob * 20) / 100;
    }

    System.out.println("________________________");
    System.out.println("| Sueldo base: " + sueldo + " |");
    System.out.println("| Dietas (" + diasv + " viajes) " + dieta + " |");
    System.out.println("|-----------------------|");
    System.out.println("| Sueldo bruto: " + sueldob + " |");

    if (scivil == 1) {
      System.out.println("| Retención IRPF (25%): " + reten + " |");
    } else if (scivil == 2) {
      System.out.println("| Retención IRPF (20%): " + reten + " |");
    }

    System.out.println("|------------------------|");
    System.out.println("| Sueldo neto: " + (sueldob - reten) + " |");
    System.out.println("|------------------------|");
  }
}
