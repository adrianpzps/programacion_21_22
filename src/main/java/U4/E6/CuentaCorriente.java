package U4.E6;

public class CuentaCorriente {

  // definicion de variables

  private static String nombre_banco = "CajaSol";

  public static String getNombre_banco() {
    return nombre_banco;
  }

  public static void setNombre_banco(String nombre_banco) {
    CuentaCorriente.nombre_banco = nombre_banco;
  }

  private String nombre;
  private String dni;
  private int saldo;
  private int limite;

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

  public void ingreso (int aingresar) {

    this.saldo += aingresar;

    System.out.println("El saldo actual es de " + getSaldo());

  }

  public void info () {

    System.out.println("Nombre: " + this.nombre);
    System.out.println("DNI: " + this.dni);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Límite: " + this.limite);
    System.out.println("Banco: " + this.nombre_banco);
  }

}
