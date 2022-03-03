package U5.EXAMEN_2021_TARDE;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {

    private String empresaAtrezzo;

    public Integrante[] getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante[] integrante) {
        this.integrante = integrante;
    }

    private Integrante[] integrante = new Integrante[0];
    private Integer contadorIntegrante = 0;

    public Comparsa(String nombre, String autor, String autorDeMusica, String tipo, String autorDeLetras, Integer puntosObtenidos, String empresaAtrezzo) {
        super(nombre, autor, autorDeMusica, tipo, autorDeLetras, puntosObtenidos);
        this.empresaAtrezzo = empresaAtrezzo;
        this.integrante = getIntegrante();
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa " + getNombre() + " va del tipo " + getTipo());
    }

    public void insertar_integrante(Integrante i) {
        integrante = Arrays.copyOf(integrante, integrante.length + 1);
        integrante[contadorIntegrante] = i;
        contadorIntegrante++;
    }

    public boolean eliminar_integrante (Integrante intg){
        for (int i = 0; i < this.integrante.length; i++) {
            if(intg.equals(this.integrante[i])){
                Integrante[] Aux = Arrays.copyOfRange(this.integrante, i+1, this.integrante.length);
                int numAux = i;
                for (int j = 0; j < Aux.length; j++){
                    this.integrante[numAux] = Aux[j];
                    numAux++;
                }
                this.integrante = Arrays.copyOf(this.integrante, this.integrante.length - 1);
                contadorIntegrante--;
                return true;
            }
        }
        System.out.println("El integrante no existe.");
        return false;
    }



    @Override
    public String toString() {
        return "Comparsa{" +
                "empresaAtrezzo='" + empresaAtrezzo + '\'' +
                ", integrante=" + Arrays.toString(integrante) +
                "} " + super.toString();
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La Comparsa " + getNombre() + " va caminito del Falla");
    }
}
