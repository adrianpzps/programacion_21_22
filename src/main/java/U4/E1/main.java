package U4.E1;

public class main {
  public static void main(String[] args) {

    // crear cuenta

    CuentaCorriente c1 = new CuentaCorriente("Adrian", "75777113w");

    // sacar dinero

    c1.sacar_dinero(35);

    // ingresar dinero

    c1.ingreso(500);

    // mostrar informacion

    c1.info();

  }
}
