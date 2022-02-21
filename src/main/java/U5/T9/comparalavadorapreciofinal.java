package U5.T9;

import java.util.Comparator;

public class comparalavadorapreciofinal implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        if (!(o instanceof lavadora)) {
            return 0;
        }
        if (!(t1 instanceof lavadora)) {
            return 0;
        }

        lavadora l1 = (lavadora) o;
        lavadora l2 = (lavadora) t1;

        return (int) (l1.getPrecioFinal() - l2.getPrecioFinal());
    }

}
