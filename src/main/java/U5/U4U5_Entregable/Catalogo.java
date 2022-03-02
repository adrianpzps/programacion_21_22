package U5.U4U5_Entregable;

import java.util.Arrays;

public class Catalogo{

  protected Multimedia[] catalogoMultimedia;
  private int indice;



  public Catalogo(int num) {
    this.catalogoMultimedia = new Multimedia[num];
    this.indice = 0;
  }

  public void add_multimedia(Multimedia mult) {
    if (indice >= catalogoMultimedia.length) {
      catalogoMultimedia = Arrays.copyOf(catalogoMultimedia, catalogoMultimedia.length + 1);
    }
    catalogoMultimedia[indice] = mult;
    indice++;
  }

  //public void eliminar_multimedia(Multimedia mult) {
    //Multimedia[] aux = new Multimedia[catalogoMultimedia.length - 1];
    //int j = 0;
    //for (int i = 0; i < catalogoMultimedia.length; i++) {
      //if (mult.equals(catalogoMultimedia[i])) {
        //j = 1;
      //} else {
        //aux[i] = catalogoMultimedia[i + j];
      //}
    //}
    //catalogoMultimedia = Arrays.copyOf(aux, aux.length);
  //}

  @Override
  public String toString() {
    return "Catalogo{" + "catalogoMultimedia=" + Arrays.toString(catalogoMultimedia) + '}';
  }

}
