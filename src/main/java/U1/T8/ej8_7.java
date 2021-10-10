package U1.T8;

public class ej8_7 {
  public static void main(String[] args) {

    int numero = 1;
    int var = 1;

    while (numero < 10) {
      if (numero % 2 != 0) {
      var = var * numero;
      System.out.println(var);
      }
      numero++;
    }
  }
}
