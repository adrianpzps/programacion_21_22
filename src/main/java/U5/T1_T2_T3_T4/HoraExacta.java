package U5.T1_T2_T3_T4;

public class HoraExacta extends Hora {

  private int segundo;

  public HoraExacta(int hora, int minuto, int segundo) {
    super(hora, minuto);
    setSegundo(segundo);
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    if (this.segundo < 59) {
      this.segundo = segundo;
    }
  }

  public void dime_hora_exacta () {
    System.out.println("Son las " + getHora() + ":" + getMinuto() + ":" + getSegundo());
  }

  public void inc_seg() {
    if (getSegundo() >= 59) {
      this.segundo = 0;
    } else {
      this.segundo++;
    }
  }

  public void comparar_horas (int horaacomprar, int minutoacomparar, int segundoacomparar) {
    if (getHora() == horaacomprar && getMinuto() == minutoacomparar && getSegundo() == segundoacomparar) {
      System.out.println("Son la misma hora.");
    } else {
      System.out.println("Son distintas horas.");
    }
  }

}
