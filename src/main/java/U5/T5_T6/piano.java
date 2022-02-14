package U5.T5_T6;

import java.util.Arrays;

public class piano extends instrumento{

    private String tipopiano;

    public piano(String tipopiano) {
        this.tipopiano = tipopiano;
    }

    @Override
    public void interpretar() {
    System.out.println(Arrays.toString(getNotasArray()));
    }
}
