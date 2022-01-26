package U4.E9.MAQUINARIA;

import U4.E9.PERSONAL.mecanicos;

public class locomotoras {

    // Locomotoras: disponen de una matrícula, potencia de su motor y un año de fabricación.
    // Cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.

    private String matricula;
    private String potencia;
    private int anno_fabricacion;
    private mecanicos mec;

    public locomotoras (String matricula, String potencia, int anno_fabricacion, mecanicos mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anno_fabricacion = anno_fabricacion;
        this.mec = mec;
    }
}
