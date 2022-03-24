package U7.ENTREGABLE2122;

import java.io.Serializable;

public class Fiat extends Divisa implements Serializable {

    private String paisref;

    public Fiat(String nombre, String simbolo, String paisref) {
        super(nombre, simbolo);
        this.paisref = paisref;
    }

    @Override
    public String toString() {
        return "Fiat{" +
                "paisref='" + paisref + '\'' +
                "} " + super.toString();
    }

    public String getPaisref() {
        return paisref;
    }

    public void setPaisref(String paisref) {
        this.paisref = paisref;
    }

}
