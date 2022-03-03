package U5.EXAMEN_2021_MAÑANA;

import java.util.Arrays;

public abstract class Vehiculo {

    private String matricula;
    private Integer cargaMax;
    Conductor conductor;



    public Vehiculo(String matricula, Integer cargaMax, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", cargaMax=" + cargaMax +
                ", conductor=" + conductor +
                '}';
    }

    public abstract void descargar();

}
