package U7.T4;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    // La implementación de serializable es para guardar archivos binarios.

private String nombre;
private String dni;
private Integer edad;
private Double altura;

    public Persona(String nombre, String dni, Integer edad, Double altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
