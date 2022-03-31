package U7.ENTREGABLECORREC;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable{
    private HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones;

    public HashMap<Divisa, LinkedHashSet<ParCotizacion>> getMapaCotizaciones() {
        return mapaCotizaciones;
    }

    public void setMapaCotizaciones(HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones) {
        this.mapaCotizaciones = mapaCotizaciones;
    }

    public Exchange(HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones) {
        this.mapaCotizaciones = mapaCotizaciones;
    }

    public Exchange() {
        this.mapaCotizaciones = new HashMap<>();
    }

    public void mostrarDivisasOrdenadas() {
        TreeMap<Divisa, LinkedHashSet<ParCotizacion>> nuevoMap = new TreeMap<>(mapaCotizaciones);
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = nuevoMap.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            System.out.println(entrada.getKey());
        }
    }

    // MANERA DE CHEMA

    // Map<Divisa, Set<ParCotizacion>> mapa = new HashMap<>(); SU VARIABLE


    // public void mostrarDivisasOrdenadas() {
         //     TreeSet<Divisa> conjunto_ordenado = new TreeSet<>(mapa.keySet());
         //     System.out.println(conjunto_ordenado);
         // }

    // OTRA MANERA DE MOSTRAR ORDENADO

      //private Map<Divisa, List<ParCotizacion>> mapa; DEPENDE DE ESTA VARIABLE, EXCHANGE ENTR2021


      //public void mostrarDivisasOrdenadas(){
      //    Set<Divisa> orden =
      //            new TreeSet<>(
      //                    new Comparator<Divisa>() {
      //                        @Override
      //                        public int compare(Divisa d1, Divisa d2) {
      //                            return d1.getSimbolo().compareTo(d2.getSimbolo());
      //                        }
      //                    });
      //    for (Map.Entry entry : mapa.entrySet()) {
      //        orden.add((Divisa) entry.getKey());

      //    }
      //    System.out.println(orden);
      //}

    public void obtenerCotizaciones(String simbolo) {
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = mapaCotizaciones.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            if (entrada.getKey().getSimbolo().equals(simbolo)){
                System.out.println("Pares cotización del " + simbolo + ":");
                System.out.println(entrada.getValue());
            }
        }
    }

        // MANERA DE CHEMA

         // public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
         //     Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();

         //     Iterator<Divisa> it = mapa.keySet().iterator();
         //     while (it.hasNext()) {
         //         Divisa base = it.next();
         //         if (base.getSimbolo().equals(simbolo)) {
         //             conjunto_pares = mapa.get(base);
         //         }
         //     }
         //     return conjunto_pares;
         // }

    public void mostrarCotizacionesAlAlzaUnaHora() {
        ArrayList<ParCotizacion> paresAlAlza = new ArrayList<>();
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = mapaCotizaciones.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            for (ParCotizacion parCotizacion : entrada.getValue()) {
                if(parCotizacion.getVariacionPorcentual() > 0){
                    paresAlAlza.add(parCotizacion);
                }
            }
        }
        for (ParCotizacion p : paresAlAlza) {
            System.out.println(p + ", ");
        }
    }

            // MANERA DE CHEMA

          //public void mostrarCotizacionesAlAlzaUnaHora() {
          //    Iterator<Map.Entry<Divisa, Set<ParCotizacion>>> it = mapa.entrySet().iterator();
          //    while (it.hasNext()) {
          //        Map.Entry<Divisa, Set<ParCotizacion>> entrada = it.next();

          //        Iterator<ParCotizacion> it_cotizaciones = entrada.getValue().iterator();
          //        while (it_cotizaciones.hasNext()) {
          //            ParCotizacion par_cotizacion = it_cotizaciones.next();
          //            if (par_cotizacion.getVariacion24h() > 0) {
          //                System.out.println(par_cotizacion);
          //            }
          //        }
          //    }
          //}

        // OTRA FORMA MAS

         // public void mostrarCotizacionesAlAlzaUnaHora_Joserra() {
         //     // Esto serviría para mostrar, pero no para BORRAR
         //     Set<Map.Entry<Divisa, Set<ParCotizacion>>> conjunto = mapa.entrySet();
         //     for (Map.Entry<Divisa, Set<ParCotizacion>> entrada : conjunto) {
         //         for (ParCotizacion par : entrada.getValue()) {
         //             if (par.getVariacion24h() > 0) {
         //                 System.out.println(par);
         //             }
         //         }
         //     }

    public void addCotizacion(ParCotizacion cotizacion) {
        if(!mapaCotizaciones.containsKey(cotizacion.getDivisaBase())) {
            mapaCotizaciones.put(cotizacion.getDivisaBase(), new LinkedHashSet<ParCotizacion>());
            mapaCotizaciones.get(cotizacion.getDivisaBase()).add(cotizacion);
        }
        mapaCotizaciones.get(cotizacion.getDivisaBase()).add(cotizacion);
    }

         // public void addCotizacion(ParCotizacion cotizacion){
         //     if (!mapa.containsKey(cotizacion.getDivisa_base())) {
         //         ArrayList<ParCotizacion> apares = new ArrayList<>();
         //         apares.add(cotizacion);
         //         mapa.put(cotizacion.getDivisa_base(), apares);
         //     } else {
         //         mapa.get(cotizacion.getDivisa_base()).add(cotizacion);
         //     }
         //     System.out.println(mapa);
         // }

        // EL DE CHEMA

          //public void addCotizacion(ParCotizacion cotizacion) {
          //    Divisa base = cotizacion.getBase();

          //    if (mapa.containsKey(base)) {
          //        mapa.get(base).add(cotizacion);
          //    } else {
          //        Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();
          //        conjunto_pares.add(cotizacion);
          //        mapa.put(base, conjunto_pares);
          //    }
          //}

    public void guardarCotizaciones() {
        try (ObjectOutputStream flujo_salida =
                     new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Entregable_Tarde_2122/cotizaciones.dat"))) {
            flujo_salida.writeObject(this.mapaCotizaciones);
        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }
    }

      //public void guardarCotizaciones(){
      //    try (ObjectOutputStream out =
      //                 new ObjectOutputStream(new FileOutputStream("cotizaciones.dat"))) {
      //        Set<ParCotizacion> cotiz = new HashSet<>();
      //        Set<Map.Entry<Divisa, List<ParCotizacion>>> entradas = mapa.entrySet();
      //        Iterator<Map.Entry<Divisa, List<ParCotizacion>>> it = entradas.iterator();
      //        while (it.hasNext()) {
      //            Map.Entry<Divisa, List<ParCotizacion>> entrada = it.next();
      //            cotiz.addAll(entrada.getValue());
      //        }
      //        out.writeObject(cotiz);
      //        System.out.println("Mapa guardado");
      //        System.out.println(mapa);
      //    } catch (IOException e) {
      //        System.out.println(e.getMessage());
      //    }
      //}

    public void recuperarCotizaciones() {
        try (ObjectInputStream flujo_entrada =
                     new ObjectInputStream(new FileInputStream("src/main/java/U7/Entregable_Tarde_2122/cotizaciones.dat"))) {
            this.mapaCotizaciones = (HashMap<Divisa, LinkedHashSet<ParCotizacion>>) flujo_entrada.readObject();
        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

          //public void recuperarCotizaciones() {
          //    try (ObjectInputStream in =
          //                 new ObjectInputStream(new FileInputStream("cotizaciones.dat"))) {
          //        Set<ParCotizacion> cotiz = (Set<ParCotizacion>) in.readObject();
          //        mapa.clear();
          //        System.out.println("Mapa borrado");
          //        System.out.println(mapa);
          //        Iterator<ParCotizacion> it = cotiz.iterator();
          //        while (it.hasNext()) {
          //            ParCotizacion pc = it.next();
          //            addCotizacion(pc);
          //        }
          //        System.out.println("Mapa cargado");
          //        System.out.println(mapa);

          //    } catch (IOException | ClassNotFoundException e) {
          //        System.out.println(e.getMessage());
          //    }
          //}

    @Override
    public String toString() {
        return "Exchange{" +
                "mapaCotizaciones=" + mapaCotizaciones +
                '}';
    }

    // Para borrar, SIEMPRE con iteradores.
    //    Iterator<Map.Entry<Divisa, Set<ParCotizacion>>> it = mapa.entrySet().iterator();
    //    while (it.hasNext()) {
    //      Map.Entry<Divisa, Set<ParCotizacion>> entrada = it.next();
    //
    //      Iterator<ParCotizacion> it_cotizaciones = entrada.getValue().iterator();
    //      while (it_cotizaciones.hasNext()) {
    //        ParCotizacion par_cotizacion = it_cotizaciones.next();
    //        if (par_cotizacion.getVariacion24h() > 0) {
    //          it_cotizaciones.remove();  // <<< AQUÍ SE BORRA
    //        }
    //      }
    //    }
}
