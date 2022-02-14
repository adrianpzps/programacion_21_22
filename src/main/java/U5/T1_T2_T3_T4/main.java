package U5.T1_T2_T3_T4;

public class main {
  public static void main(String[] args) {

    Hora h1 = new Hora(5,25);
    h1.dime_hora();
    h1.inc();
    h1.dime_hora();
    h1.setMinuto(30);
    h1.dime_hora();
    h1.setHora(22);
    h1.dime_hora();
    System.out.println(h1.toString());

    Hora12 h2 = new Hora12(23,25);
    Hora12 h3 = new Hora12(12,25);
    Hora12 h4 = new Hora12(11,25);
    Hora12 h5 = new Hora12(8,25);
    Hora12 h6 = new Hora12(20,25);


    h2.formato_12();
    h3.formato_12();
    h4.formato_12();
    h5.formato_12();
    h6.formato_12();

    HoraExacta h7 = new HoraExacta(14,5,25);

    h7.dime_hora_exacta();
    h7.setSegundo(59);
    h7.dime_hora_exacta();
    h7.inc_seg();
    h7.dime_hora_exacta();
    h7.inc_seg();
    h7.dime_hora_exacta();
    h7.inc_seg();
    h7.dime_hora_exacta();
    h7.inc_seg();
    h7.dime_hora_exacta();

    HoraExacta h8 = new HoraExacta(1,1,1);

    System.out.println();

    h8.comparar_horas(1,1,1);
    h8.comparar_horas(2,1,1);


  }
}
