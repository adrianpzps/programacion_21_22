package U5.U4U5_Entregable;

public abstract class Multimedia {

    protected String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnnoEstreno() {
        return annoEstreno;
    }

    public void setAnnoEstreno(Integer annoEstreno) {
        this.annoEstreno = annoEstreno;
    }

    public static Integer getNumMultimedia() {
        return numMultimedia;
    }

    public static void setNumMultimedia(Integer numMultimedia) {
        Multimedia.numMultimedia = numMultimedia;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    protected Integer annoEstreno;
    private static Integer numMultimedia = 0;
    protected Integer identificador = 0;

    public Multimedia(String titulo, Integer annoEstreno) {
        this.titulo = titulo;
        this.annoEstreno = annoEstreno;
        numMultimedia++;
        this.identificador = numMultimedia;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", annoEstreno=" + annoEstreno +
                ", identificador=" + identificador +
                '}';
    }

    public static void numero_de_elementos() {
        System.out.println("Se han generado " + numMultimedia + " objetos multimedia");
    }

    public void dar_por_finalizado() {
        System.out.println("El objeto multimedia " + getTitulo() + " ha finalizado");
    }

    public int compareTo(Object o) {
        if (!(o instanceof Multimedia)) {
            return 0;
        }
        Multimedia that = (Multimedia) o;
        return this.identificador - that.identificador;
    }


}
