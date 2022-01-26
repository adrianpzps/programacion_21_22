package U4.E9.MAQUINARIA;

    class vagones {

    // Vagones: tienen una capacidad máxima de carga (en kilos),
    // una capacidad actual (carga en un momento dado), y el tipo de mercancía con el que están cargados.

    private int carga;
    private int capacidad;
    private String tipo_mercancia;


    public vagones (int carga, int capacidad, String tipo_mercancia) {
        this.carga = carga;
        this.capacidad = capacidad;
        this.tipo_mercancia = tipo_mercancia;
    }

}
