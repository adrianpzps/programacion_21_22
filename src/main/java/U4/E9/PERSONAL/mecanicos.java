package U4.E9.PERSONAL;

public class mecanicos {

    // Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)

    private String nombre_completo;
    private int telefono;

    public enum tipo_especialidad {
        Frenos,
        Hidraulica,
        Electricidad,
        Maniobras,
        Electronico
    }

    private tipo_especialidad especialidad;

    public mecanicos (String nombre_completo, int telefono, tipo_especialidad especialidad) {
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

}
