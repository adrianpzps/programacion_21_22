package U7.EXAMEN2122;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable, Comparable {

    private String titulo;
    private Integer anioestreno;
    private String paisorigen;
    private String genero;
    private String director;
    private Integer id;

    public static Integer contador = 1;

    public Pelicula(String titulo, Integer anioestreno, String paisorigen, String genero, String director) {
        this.titulo = titulo;
        this.anioestreno = anioestreno;
        this.paisorigen = paisorigen;
        this.genero = genero;
        this.director = director;
        setId(contador++);
    }



    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anioestreno=" + anioestreno +
                ", paisorigen='" + paisorigen + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioestreno() {
        return anioestreno;
    }

    public void setAnioestreno(Integer anioestreno) {
        this.anioestreno = anioestreno;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
        Pelicula.contador = contador;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Pelicula)) return 0;
        Pelicula that = (Pelicula) o;
        return this.getTitulo().compareTo(that.getTitulo());
    }
}

