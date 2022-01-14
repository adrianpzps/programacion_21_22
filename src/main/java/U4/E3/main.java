package U4.E3;

public class main {
  public static void main(String[] args) {

    // crear cuenta

    CuentaCorriente c1 = new CuentaCorriente("Adrian", "75777113w");
    CuentaCorriente c2 = new CuentaCorriente(200);
    CuentaCorriente c3 = new CuentaCorriente(9000,-100,"45789888w");

    // sacar dinero

    c1.sacar_dinero(35);

    // ingresar dinero

    c1.ingreso(500);

    // mostrar informacion

    c1.info();

  }
}
