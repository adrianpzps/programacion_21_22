package U7.T4;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {

    private Integer sueldo;

    public Empleado(String nombre, String dni, Integer edad, Double altura, Integer sueldo) {
        super(nombre, dni, edad, altura);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                "} " + super.toString();
    }
}
