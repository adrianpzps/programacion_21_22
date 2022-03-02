package U5.U4U5_Entregable;

public class Libro extends Multimedia{

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getIBSN() {
        return IBSN;
    }

    public void setIBSN(Integer IBSN) {
        this.IBSN = IBSN;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    private String autor;
    private String editorial;
    private Integer IBSN;
    private Integer numPaginas;

    public Libro(String titulo, Integer annoEstreno, String autor, String editorial, Integer IBSN, Integer numPaginas) {
        super(titulo, annoEstreno);
        this.autor = autor;
        this.editorial = editorial;
        this.IBSN = IBSN;
        this.numPaginas = numPaginas;
    }

    @Override
    public void dar_por_finalizado() {
        super.dar_por_finalizado();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", IBSN=" + IBSN +
                ", numPaginas=" + numPaginas +
                ", titulo='" + titulo + '\'' +
                ", annoEstreno=" + annoEstreno +
                ", identificador=" + identificador +
                '}';
    }
}
