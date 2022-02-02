package U4.ENTREGABLE_21_22;

public class Material {

  private String descripcion;
  private String proveedor;
  private int unidades;
  private int precio_unidad;
  private double iva;

  public Material(double iva) {
    this.iva = iva;
  }

  public Material(String descripcion, String proveedor, int unidades, int precio_unidad) {
    this.descripcion = descripcion;
    this.proveedor = proveedor;
    if (unidades >= 1 && unidades <= 100) {
      this.unidades = unidades;
    }
    if (precio_unidad >= 0 && precio_unidad <= 100000) {
      this.precio_unidad = precio_unidad;
    }
  }

  public Material(String descripcion, int unidades, int precio_unidad) {
    this.descripcion = descripcion;
    this.proveedor = "Sin especificar";
    if (unidades >= 1 && unidades <= 100) {
      this.unidades = unidades;
    }
    if (precio_unidad >= 0 && precio_unidad <= 100000) {
      this.precio_unidad = precio_unidad;
    }
  }

  public void mostrar_informacion() {

    System.out.println();
    System.out.println("Descripción: " + this.descripcion);
    System.out.println("Proveedor: " + this.proveedor);
    System.out.println("Unidades: " + this.unidades);
    System.out.println("Precio de unidad: " + this.precio_unidad);
  }

  public double getIva() {
    return iva;
  }

  public void setIva(double iva) {
    this.iva = iva;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getProveedor() {
    return proveedor;
  }

  public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
  }

  public int getUnidades() {
    return unidades;
  }

  public void setUnidades(int unidades) {
    this.unidades = unidades;
  }

  public int getPrecio_unidad() {
    return precio_unidad;
  }

  public void setPrecio_unidad(int precio_unidad) {
    this.precio_unidad = precio_unidad;
  }

}
