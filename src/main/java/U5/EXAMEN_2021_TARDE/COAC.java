package U5.EXAMEN_2021_TARDE;

import java.util.Arrays;

public class COAC {

    public AgrupacionOficial[] getAgrupCOAC() {
        return agrupCOAC;
    }

    public void setAgrupCOAC(AgrupacionOficial[] agrupCOAC) {
        this.agrupCOAC = agrupCOAC;
    }

    private AgrupacionOficial[] agrupCOAC = new AgrupacionOficial[0];
    private Integer indiceAgrup = 0;

    public COAC() {
        this.agrupCOAC = getAgrupCOAC();
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        agrupCOAC = Arrays.copyOf(agrupCOAC, agrupCOAC.length + 1);
        agrupCOAC[indiceAgrup] = agrupacion;
        indiceAgrup++;
    }

    public boolean eliminar_agrupacion (AgrupacionOficial agrupacion){
        for (int i = 0; i < this.agrupCOAC.length; i++) {
            if(agrupacion.equals(this.agrupCOAC[i])){
                AgrupacionOficial[] Aux = Arrays.copyOfRange(this.agrupCOAC, i+1, this.agrupCOAC.length);
                int numAux = i;
                for (int j = 0; j < Aux.length; j++){
                    this.agrupCOAC[numAux] = Aux[j];
                    numAux++;
                }
                this.agrupCOAC = Arrays.copyOf(this.agrupCOAC, this.agrupCOAC.length - 1);
                indiceAgrup--;
                return true;
            }
        }
        System.out.println("La agrupacion no existe.");
        return false;
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupCOAC=" + Arrays.toString(agrupCOAC) +
                '}';
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupCOAC, new OrdenarPorPuntos());
    }

    public void ordenar_por_nombre() {
        Arrays.sort(agrupCOAC, new OrdenarPorNombre());
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupCOAC, new OrdenarPorAutor());
    }
}
