package U4.E10;

public class Hora {

    // VARIABLES

  private int hora;
  private int minuto;
  private int segundo;
  public boolean chora = true;
  public boolean cminuto = true;
  public boolean csegundo = true;


  // SET AND GET DE VARIABLES

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {

    if (hora > 23 || hora < 0) {
      System.out.println("La hora introducida no es valida");
      chora = false;
    } else {
      this.hora = hora;
      chora = true;
    }


  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }


  // CONSTRUCTOR

  public Hora(int uhora, int uminuto, int usegundo) {
    setHora(uhora);
    setMinuto(uminuto);
    setSegundo(usegundo);
  }

  // METODO COMPROBACION



  // METODO

  public void calculo(int sumsegundo) {

    this.segundo += sumsegundo;

    while (this.segundo >= 60) {
      this.segundo -= 60;
      this.minuto++;
      if (this.minuto > 59) {
        this.hora++;
        this.minuto = 0;
      }
    }
  }
}
