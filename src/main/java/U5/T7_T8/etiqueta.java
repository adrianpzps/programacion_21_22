package U5.T7_T8;

public class etiqueta {

    private String nombre;
    private String direccion;
    private int tlf;

    public etiqueta(String nombre, String direccion, int tlf) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "etiqueta{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
