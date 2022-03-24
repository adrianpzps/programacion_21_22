package U7.ENTREGABLE2122;

import java.io.Serializable;
import java.util.Objects;

public abstract class Divisa implements Comparable<Divisa>, Serializable {

    private String nombre;
    private String simbolo;
    private Integer id;
    private static Integer contador = 1;


    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        setId(contador++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divisa divisa = (Divisa) o;
        return Objects.equals(nombre, divisa.nombre) && Objects.equals(simbolo, divisa.simbolo) && Objects.equals(id, divisa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, simbolo, id);
    }

    @Override
    public int compareTo(Divisa divisa) {
        return nombre.compareTo(divisa.getSimbolo());
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Divisa.contador = contador;
    }
}
