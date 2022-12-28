package Ejercicios7y8.Traductor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Traductor {
    private String espanol;
    private String ingles;
    private String frances;

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }

    public Traductor(String espanol, String ingles, String frances) {
        this.espanol = espanol;
        this.ingles = ingles;
        this.frances = frances;
    }

    public Traductor() {}

    public static ArrayList<Traductor> getDiccionario() throws IOException, ParseException {
        ArrayList<Traductor> traducciones = new ArrayList<Traductor>();
        JSONParser parser = new JSONParser();
        String url = "/home/ograciano/IdeaProjects/curso-infotec-java/src/Ejercicios7y8/Traductor/";
        Object obj = parser.parse(new FileReader(url + "diccionario.json"));
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray arrayTraducciones = (JSONArray) jsonObject.get("traducciones");

        for (int i = 0; i < arrayTraducciones.size(); i++) {
            Traductor traductor = new Traductor();
            JSONObject jsonObject1 = (JSONObject) arrayTraducciones.get(i);
            traductor.espanol = (String) jsonObject1.get("espanol");
            traductor.ingles = (String) jsonObject1.get("ingles");
            traductor.frances = (String) jsonObject1.get("frances");
            traducciones.add(traductor);
        }
        return traducciones;
    }

    public static boolean buscarPalabra(String palabra) throws IOException, ParseException {
        ArrayList<Traductor> traducciones = getDiccionario();

        for (int i = 0; i < traducciones.size(); i++) {
            if (traducciones.get(i).getEspanol().contains(palabra)) {
                System.out.println("la palabra: " + palabra + " si existe e el diccionario y su traduccion es:");
                System.out.println("Español: " + traducciones.get(i).getEspanol());
                System.out.println("Ingles: " + traducciones.get(i).getIngles());
                System.out.println("Frances: " + traducciones.get(i).getFrances());
                return true;
            }
        }
        return false;
    }

    public static boolean setPalabra(Scanner scan) {
        String url = "/home/ograciano/IdeaProjects/curso-infotec-java/src/Ejercicios7y8/Traductor/";
        try(scan) {
            String espanol, ingles, frances;
            ArrayList<Traductor> traducciones = getDiccionario();
            Traductor palabra = new Traductor();
            System.out.println("No se encontro la palabra ingresada vamos a ingresarla manuelmente: ");
            System.out.println("ingrese palabra en español: ");
            espanol = scan.nextLine();
            System.out.println("ingrese palabra en ingles: ");
            ingles = scan.nextLine();
            System.out.println("ingrese palabra en frances: ");
            frances = scan.nextLine();
            palabra.setEspanol(espanol);
            palabra.setIngles(ingles);
            palabra.setFrances(frances);

            traducciones.add(palabra);

            JSONObject traduccionesObject = new JSONObject();
            JSONArray tradArray = new JSONArray();

            for (int i = 0; i < traducciones.size(); i++) {
                JSONObject tradObject = new JSONObject();
                tradObject.put("espanol", traducciones.get(i).getEspanol());
                tradObject.put("ingles", traducciones.get(i).getIngles());
                tradObject.put("frances", traducciones.get(i).getFrances());
                tradArray.add(tradObject);
            }

            traduccionesObject.put("traducciones", tradArray);

            FileWriter file = new FileWriter(url + "diccionario.json");
            file.write(traduccionesObject.toJSONString());
            file.flush();


        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }

}
