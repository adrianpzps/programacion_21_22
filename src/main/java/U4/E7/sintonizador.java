package U4.E7;

public class sintonizador {

    private double freq = 80;

    public double getFreq() {

        return freq;
    }

    public void var (String mod) {

        if (mod.equalsIgnoreCase("up") && freq == 108) {
            this.freq = 80;
        } else if (mod.equalsIgnoreCase("down") && freq == 80) {
            this.freq = 108;
        } else if (mod.equalsIgnoreCase("up")) {
            this.freq += 0.5;
        } else if (mod.equalsIgnoreCase("down")) {
            this.freq -= 0.5;
        }
    }

}
