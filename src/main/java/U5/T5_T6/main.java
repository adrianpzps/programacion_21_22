package U5.T5_T6;

public class main {
  public static void main(String[] args) {

    piano p1 = new piano("de plastico");

    p1.add(instrumento.notasEnum.Ndo);
    p1.add(instrumento.notasEnum.Nsi);
    p1.add(instrumento.notasEnum.Ndo);
    p1.add(instrumento.notasEnum.Nla);
    p1.add(instrumento.notasEnum.Ndo);
    p1.add(instrumento.notasEnum.Nfa);
    p1.add(instrumento.notasEnum.Ndo);
    p1.add(instrumento.notasEnum.Nre);
    p1.add(instrumento.notasEnum.Ndo);

    p1.interpretar();


  }
}
