package U5.T1_T2_T3_T4;

public class Hora {

  private int hora;
  private int minuto;

  // Así es como se limita la asignación de un atributo en el constructor

  public Hora(int hora, int minuto) {
    setHora(hora);
    setMinuto(minuto);
  }

  public void setHora(int hora) {
    if (hora <= 23 && hora >= 0) {
      this.hora = hora;
    }
  }

  public void setMinuto(int minuto) {
    if (minuto <= 59 && minuto >= 0) {
      this.minuto = minuto;
    }
  }

  public int getHora() {
    return hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void dime_hora() {
    System.out.println("Son las " + this.hora + " y " + this.minuto + " minutos");
  }

  public void inc(){
    this.minuto++;
  }

  @Override
  public String toString() {
    return hora + ":" + minuto;
  }
}
