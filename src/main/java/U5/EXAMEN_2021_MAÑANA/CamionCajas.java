package U5.EXAMEN_2021_MAÑANA;

import java.util.Arrays;

public class CamionCajas extends Vehiculo implements Comparable{

    private Caja[] cajaCamion = new Caja[0];
    private Integer indice = 0;

    public CamionCajas(String matricula, Integer cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);

    }

    @Override
    public void descargar() {

    }

    public void add(Caja caja) {
        cajaCamion = Arrays.copyOf(cajaCamion, cajaCamion.length + 1);
        cajaCamion[indice] = caja;
        indice++;
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajaCamion=" + Arrays.toString(cajaCamion) +
                "} " + super.toString();
    }

    public void delete(Caja caja) {
        for (int i = 0; i < this.cajaCamion.length; i++) {
            if(caja.equals(this.cajaCamion[i])){
                Caja[] Aux = Arrays.copyOfRange(this.cajaCamion, i+1, this.cajaCamion.length);
                int nAux = i;
                for (int j = 0; j < Aux.length; j++){
                    this.cajaCamion[nAux] = Aux[j];
                    nAux++;
                }
                this.cajaCamion = Arrays.copyOf(this.cajaCamion, this.cajaCamion.length - 1);
                Caja.setContadorCaja(Caja.getContadorCaja() - 1);
            }
        }
    }


    @Override
    public int compareTo(Object o) {
        if (!(o instanceof CamionCajas)) return 0;
        CamionCajas that = (CamionCajas) o;
        return (this.indice.compareTo(that.indice));
    }


}
