package U5.T5_T6;

public abstract class instrumento {

    public enum notasEnum {
        Ndo,
        Nre,
        Nmi,
        Nfa,
        Nsol,
        Nla,
        Nsi
    }

    public notasEnum[] getNotasArray() {
        return notasArray;
    }

    public void setNotasArray(notasEnum[] notasArray) {
        this.notasArray = notasArray;
    }

    private notasEnum[] notasArray;
    private int indice;

    public instrumento(){
        notasArray = new notasEnum[100];
        this.indice = 0;
    }

    public void add(notasEnum nota) {
    if (this.indice < notasArray.length) {
        notasArray[indice] = nota;
        this.indice++;
    } else {
      System.out.println("ERROR - Se ha alcanzado el número máximo de notas.");
    }
    }

    public abstract void interpretar();


}
