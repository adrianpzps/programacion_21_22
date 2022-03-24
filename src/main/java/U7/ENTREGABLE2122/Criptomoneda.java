package U7.ENTREGABLE2122;

import java.io.Serializable;

public class Criptomoneda extends Divisa implements Serializable {

    private Integer precioUSD;
    private Integer voluprec24;
    private String fechacrea;
    private Integer ranking;

    public Criptomoneda(String nombre, String simbolo, Integer precioUSD, Integer voluprec24, String fechacrea, Integer ranking) {
        super(nombre, simbolo);
        this.precioUSD = precioUSD;
        this.voluprec24 = voluprec24;
        this.fechacrea = fechacrea;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "precioUSD=" + precioUSD +
                ", voluprec24=" + voluprec24 +
                ", fechacrea='" + fechacrea + '\'' +
                ", ranking=" + ranking +
                "} " + super.toString();
    }

    public Integer getPrecioUSD() {
        return precioUSD;
    }

    public void setPrecioUSD(Integer precioUSD) {
        this.precioUSD = precioUSD;
    }

    public Integer getVoluprec24() {
        return voluprec24;
    }

    public void setVoluprec24(Integer voluprec24) {
        this.voluprec24 = voluprec24;
    }

    public String getFechacrea() {
        return fechacrea;
    }

    public void setFechacrea(String fechacrea) {
        this.fechacrea = fechacrea;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

}
