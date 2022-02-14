package U5.T7_T8;

public class caja {

    protected double ancho;
    protected double alto;
    protected double fondo;
    protected etiqueta etiq;

    public enum Unidades {
        cm,
        m
    }

    private Unidades u;


    public Unidades getU() {
        return u;
    }


    public caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
//        this.etiq = etiq;
    }

    public void set_etiqueta(etiqueta etiq) {
        this.etiq = etiq;
    }

    @Override
    public String toString() {
        return "caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiq=" + etiq +
                ", u=" + u +
                '}';
    }

    public double getVolumen() {

        double volumen = this.alto * this.ancho * this.fondo;

        return volumen;
    }






}
