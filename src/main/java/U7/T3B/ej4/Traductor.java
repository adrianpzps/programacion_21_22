package U7.T3B.ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Traductor {

    HashMap<String, String> diccionario;

    public Traductor(String ruta) {
        this.diccionario = new HashMap<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(ruta));
            String linea = in.readLine();

            while (linea != null) {
                String[] array_string = linea.split(", ");
                diccionario.put(array_string[0],array_string[1]);
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(diccionario);
    }

    public String traduce2 (String frase) {

        frase = frase.concat(" ");
        ArrayList<String> palabras = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < frase.length(); i++) {
            Character carac = frase.charAt(i);
            if (carac.toString().equals(" ")) {
                palabras.add(frase.substring(index, i));
                index = i + 1;
            }
        }
        String fraseacumulada = "";

        for (String p : palabras) {
            fraseacumulada+=(diccionario.get(p) + " ");
        }
        return fraseacumulada;

    }

    public String traduce (String palabra) {
        return diccionario.get(palabra);
    }


}
