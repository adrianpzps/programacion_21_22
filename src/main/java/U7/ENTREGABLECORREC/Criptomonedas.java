package U7.ENTREGABLECORREC;

import java.io.Serializable;

public class Criptomonedas extends Divisa implements Serializable {
    private Double precioUSD;
    private Double volumenTransaccion;
    private String fechaCreacion;
    private Integer ranking;

    public Double getPrecioUSD() {
        return precioUSD;
    }

    public void setPrecioUSD(Double precioUSD) {
        this.precioUSD = precioUSD;
    }

    public Double getVolumenTransaccion() {
        return volumenTransaccion;
    }

    public void setVolumenTransaccion(Double volumenTransaccion) {
        this.volumenTransaccion = volumenTransaccion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Criptomonedas(String nombre, String simbolo, Double precioUSD, Double volumenTransaccion, String fechaCreacion, Integer ranking) {
        super(nombre, simbolo);
        this.precioUSD = precioUSD;
        this.volumenTransaccion = volumenTransaccion;
        this.fechaCreacion = fechaCreacion;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return super.toString() + ", precioUSD=" + precioUSD + ", volumenTransaccion=" + volumenTransaccion + ", fechaCreacion='" + fechaCreacion + ", Ranking=" + ranking;
    }
}
