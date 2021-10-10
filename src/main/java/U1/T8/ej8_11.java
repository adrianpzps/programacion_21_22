package U1.T8;

public class ej8_11 {

  public static void main(String[] args) {

    int numero = 1;

    while (numero <= 10) {
      for (int var = 1; var <= 10; var++) {
        System.out.println(numero + " X " + var + " = " + (numero * var));
      }
      numero++;
      System.out.println("____________");
    }
  }
}
