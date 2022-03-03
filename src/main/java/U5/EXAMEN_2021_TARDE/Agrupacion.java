package U5.EXAMEN_2021_TARDE;

import java.util.Arrays;

public abstract class Agrupacion implements Comparable {

    private String nombre;
    private String autor;
    private String autorDeMusica;
    private String tipo;
    private String autorDeLetras;

    public static Integer getContadorDeAgrupaciones() {
        return contadorDeAgrupaciones;
    }

    public static void setContadorDeAgrupaciones(Integer contadorDeAgrupaciones) {
        Agrupacion.contadorDeAgrupaciones = contadorDeAgrupaciones;
    }

    private static Integer contadorDeAgrupaciones = 0;

    private Agrupacion[] agrupacion = new Agrupacion[0];

    public Agrupacion(String nombre, String autor, String autorDeMusica, String tipo, String autorDeLetras) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorDeMusica = autorDeMusica;
        this.tipo = tipo;
        this.autorDeLetras = autorDeLetras;
        contadorDeAgrupaciones++;
    }

    public static void dime_num_agrupaciones(){
        System.out.println("Se han creado " + getContadorDeAgrupaciones() + " agrupaciones");
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorDeMusica='" + autorDeMusica + '\'' +
                ", tipo='" + tipo + '\'' +
                ", autorDeLetras='" + autorDeLetras + '\'' +
                '}';
    }

    public abstract void cantar_la_presentacion();
    public abstract void hacer_tipo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorDeMusica() {
        return autorDeMusica;
    }

    public void setAutorDeMusica(String autorDeMusica) {
        this.autorDeMusica = autorDeMusica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutorDeLetras() {
        return autorDeLetras;
    }

    public void setAutorDeLetras(String autorDeLetras) {
        this.autorDeLetras = autorDeLetras;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Agrupacion)) return 0;
        Agrupacion that = (Agrupacion) o;
        return (getNombre().compareTo(that.getNombre()));
    }

}
