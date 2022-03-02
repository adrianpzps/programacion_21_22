package U5.U4U5_Entregable;

public class Pelicula extends Multimedia implements reproducible {

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    private String director;
    private Integer duracion;
    private String productora;
    private String pais;


    public Pelicula(String titulo, Integer annoEstreno, String director, Integer duracion, String productora, String pais) {
        super(titulo, annoEstreno);
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    @Override
    public void dar_por_finalizado() {
        super.dar_por_finalizado();
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", annoEstreno=" + annoEstreno +
                ", identificador=" + identificador +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public void play(){
    System.out.println("Reproduciendo pelicula " + getTitulo());
    }
    public void pause(){
        System.out.println("Pausando pelicula " + getTitulo());
    }
    public void stop(){
        System.out.println("Parando pelicula " + getTitulo());
    }
}
