package U4.E8;

import U4.E4.CuentaCorriente;

public class sistema {

  private boolean corriente = true;

  public void setCorriente(boolean corriente) {
    this.corriente = corriente;
  }

  private boolean diferencial = true;

  public void setDiferencial(boolean diferencial) {
    this.diferencial = diferencial;
  }

  private boolean bombilla1 = true;

  public void setBombilla1(boolean bombilla1) {
    this.bombilla1 = bombilla1;
  }

  private boolean bombilla2 = true;

  public void setBombilla2(boolean bombilla2) {
    this.bombilla2 = bombilla2;
  }

  private boolean bombilla3 = true;

  public void setBombilla3(boolean bombilla3) {
    this.bombilla3 = bombilla3;
  }

  public void informacion() {

    if (corriente && diferencial) {
      System.out.println("-- Corriente encendida");
      System.out.println("-- Difenrecial encendido");
      if (bombilla1) {
        System.out.println("-- Bombilla 1 encendida");
      } else {
        System.out.println("-- Bombilla 1 apagada");
      }
      if (bombilla2) {
        System.out.println("-- Bombilla 2 encendida");
      } else {
        System.out.println("-- Bombilla 2 apagada");
      }
      if (bombilla3) {
        System.out.println("-- Bombilla 3 encendida");
      } else {
        System.out.println("-- Bombilla 3 apagada");
      }
    }
    if (corriente && !diferencial) {
      System.out.println("-- Corriente encendida");
      System.out.println("-- Diferencial apagado");
      System.out.println("-- Bombilla 1 apagada");
      System.out.println("-- Bombilla 2 apagada");
      System.out.println("-- Bombilla 3 apagada");
    }
    if (!corriente) {
      System.out.println("-- Corriente apagado");
      System.out.println("-- Diferencial apagado");
      System.out.println("-- Bombilla 1 apagada");
      System.out.println("-- Bombilla 2 apagada");
      System.out.println("-- Bombilla 3 apagada");
    }


  }
}
