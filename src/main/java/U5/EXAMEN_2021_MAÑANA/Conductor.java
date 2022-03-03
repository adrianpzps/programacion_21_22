package U5.EXAMEN_2021_MAÑANA;

public class Conductor {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer NSS;

    public Conductor(String nombre, String apellido1, String apellido2, Integer NSS) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.NSS = NSS;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", NSS=" + NSS +
                '}';
    }
}
