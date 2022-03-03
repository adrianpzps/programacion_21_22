package U5.EXAMEN_2021_TARDE;

public class Integrante {

    private Integer num_participante;
    private String nombre;
    private Integer edad;
    private String localidad;

    public Integrante(Integer num_participante, String nombre, Integer edad, String localidad) {
        this.num_participante = num_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "num_participante=" + num_participante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
