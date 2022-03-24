package U7.ENTREGABLE2122;

import java.util.HashMap;
import java.util.Map;

public class main {
  public static void main(String[] args) {

    Fiat f1 = new Fiat("Dolar", "USD", "EEUU");
    Fiat f2 = new Fiat("Euro", "EUR", "Europa");
    Fiat f3 = new Fiat("Rublo", "RUB", "Rusia");

    Criptomoneda c1 = new Criptomoneda("Bitcoin", "BTC", 40000, 1000000, "5/3/2009", 1);
    Criptomoneda c2 = new Criptomoneda("Ethereum", "ETH", 3000, 500000, "29/5/2011", 2);
    Criptomoneda c3 = new Criptomoneda("Cardano", "CAR", 1, 250000, "23/7/2014", 3);

    ParCotizacion pc1 = new ParCotizacion(f1,c1,43234.23,0.5);
    ParCotizacion pc2 = new ParCotizacion(f2,c2,3245.43,0.3);
    ParCotizacion pc3 = new ParCotizacion(f1,c3,0.99,0.6);
    ParCotizacion pc4 = new ParCotizacion(f1,c2,42254.13,0.5);

    Exchange ex1 = new Exchange("EX1");

    ex1.addCotizacion(pc1);
    ex1.addCotizacion(pc2);
    ex1.addCotizacion(pc3);
    ex1.addCotizacion(pc4);

    System.out.println(ex1);

    ex1.mostrarDivisasOrdenadas();

    ex1.guardarCotizaciones();

    ex1.recuperarCotizaciones();


  }
}
