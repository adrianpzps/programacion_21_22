package U4.ENTREGABLE_21_22;

import java.util.Calendar;

public class Obra {

    private Calendar fecha;

    public void fecha_obra() {
        String dia, mes, annio;

        dia = Integer.toString(fecha.get(Calendar.DATE));
        mes = Integer.toString(fecha.get(Calendar.MONTH));
        annio = Integer.toString(fecha.get(Calendar.YEAR));

        System.out.println("Fecha: " + dia + "/" + (Integer.parseInt(mes) + 1) + "/" + annio);
    }

    public Obra(){

    }

}
