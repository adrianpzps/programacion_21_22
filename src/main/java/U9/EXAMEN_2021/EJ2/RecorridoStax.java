package U9.EXAMEN_2021.EJ2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {

    public static void pilotoMasCampeonatos() {

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("pilotos.xml"));

            String vNombre = "";
            Integer vEdad = 0;
            String vEscuderia = "";
            Integer vCampeonatos = 0;

            String aNombre = "";
            Integer aEdad = 0;
            String aEscuderia = "";
            Integer aCampeontos = 0;

            String Vcambia = "";

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    Vcambia = startTag.getName().getLocalPart();

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        if (!Vcambia.equals("")) {

                            if (Vcambia.equalsIgnoreCase("nombre")) {
                                aNombre = texto.getData();
                            } else if (Vcambia.equalsIgnoreCase("edad")) {
                                aEdad = Integer.parseInt(texto.getData());
                            } else if (Vcambia.equalsIgnoreCase("escuderia")) {
                                aEscuderia = texto.getData();
                            } else if(Vcambia.equalsIgnoreCase("campeonatos")) {
                                aCampeontos = Integer.parseInt(texto.getData());
                            }
                        }
                    }
                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();

                    if (endtag.getName().getLocalPart().equals("piloto")) {

                        if (aCampeontos > vCampeonatos) {

                            vNombre = aNombre;
                            vEdad = aEdad;
                            vEscuderia = aEscuderia;
                            vCampeonatos = aCampeontos;
                        }

                        aNombre = "";
                        aEdad = 0;
                        aEscuderia = "";
                        aCampeontos = 0;
                    }
                }
            }

            System.out.println("El piloto con más campeonatos:");
            System.out.println("Nombre: " + vNombre);
            System.out.println("Edad: " + vEdad);
            System.out.println("Escuderia: " + vEscuderia);
            System.out.println("Campeonatos: " + vCampeonatos);

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void mostrarPilPorEsc(String escuderia) {

        Integer contador = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("pilotos.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (texto.getData().equalsIgnoreCase(escuderia)) {
                        contador++;
                    }
                }
            }

            System.out.println("Hay " + contador + " pilotos en " + escuderia + ".");

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }

}
