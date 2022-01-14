package U4.E4;

public class main {
  public static void main(String[] args) {

    // crear cuenta

    CuentaCorriente c1 = new CuentaCorriente("Adrian", "75777113w");

    CuentaCorriente c2 = new CuentaCorriente("Pepe", "23137113w");


    // sacar dinero

    c1.sacar_dinero(35);

    // ingresar dinero

    c1.ingreso(500);

    // mostrar info antes

    c1.info();
    System.out.println();

    c2.info();
    System.out.println();

    // cambiar nombre de banco

    CuentaCorriente.setNombre_banco("prueba");

    // mostrar informacion

    c1.info();
    System.out.println();

    c2.info();

  }
}
