package U4.E3;

public class CuentaCorriente {

  // definicion de variables

  private static String nombre_banco = "CajaSol";

  private String nombre;
  private String dni;
  public int saldo;
  int limite;

  public int getSaldo() {

    return saldo;
  }

  public void setSaldo(int saldo) {

    this.saldo = saldo;
  }

  // creamos constructor

  public CuentaCorriente(String nombre, String dni) {

    this.nombre = nombre;
    this.dni = dni;
    this.saldo = 0;
    this.limite = -50;
  }

  public CuentaCorriente(int saldo) {

    this.saldo = saldo;
    this.limite = 0;
  }

  public CuentaCorriente(int saldo, int limite, String dni) {

    this.dni = dni;
    this.saldo = saldo;
    this.limite = limite;
  }

  // sacar dinero

  public boolean sacar_dinero(int cantidad) {

    boolean resultado = false;

    if (this.saldo - cantidad > this.limite) {
      this.saldo = this.saldo - cantidad;
      resultado = true;
      System.out.println("Ha sacado " + cantidad);
    } else {
      System.out.println("No ha podido sacar dinero");
    }
    return resultado;
  }

  // ingresar dinero

  public void ingreso(int aingresar) {

    this.saldo += aingresar;

    System.out.println("El saldo actual es de " + getSaldo());
  }

  public void info() {

    System.out.println("Nombre: " + this.nombre);
    System.out.println("DNI: " + this.dni);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Límite: " + this.limite);
  }
}
