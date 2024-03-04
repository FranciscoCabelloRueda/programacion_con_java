import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio1 {
  public static void main(String[] args) {
    int puntos = 0;
    int errores= 0;

    HashMap<String, String> paises = new HashMap<String, String>();

    paises.put("España", "Madrid");
    paises.put("Francia", "Paris");
    paises.put("Alemania", "Berlín");
    paises.put("Italia", "Roma");
    paises.put("Dinamarca", "Copenhague");
    paises.put("Irlanda", "Dúblin");
    paises.put("Hungria", "Budapest");
    paises.put("Letonia", "Riga");
    paises.put("Luxemburgo", "Luxemburgo");
    paises.put("Mónaco", "Mónaco");

    ArrayList<String> capitales = new ArrayList<String>();

    capitales.add("Ereván");
    capitales.add("Viena");
    capitales.add("Bakú");
    capitales.add("Bruselas");
    capitales.add("Minsk");
    capitales.add("Sarajevo");
    capitales.add("Sofía");
    capitales.add("Nicosia");
    capitales.add("Ciudad del Vaticano");
    capitales.add("Zagreb");
    capitales.add("Bratislava");
    capitales.add("Liubliana");
    capitales.add("Tallín");
    capitales.add("Helsinki");
    capitales.add("Tiflis");
    capitales.add("Atenas");
    capitales.add("Reikiavik");
    capitales.add("Nursultán");
    capitales.add("Vaduz");
    capitales.add("Vilna");

    Collections.shuffle(capitales);

    for (Map.Entry pais: paises.entrySet()) {
      int respuesta;
      int respuestaCorrecta = 0;
      int aleatorio = (int) (Math.random()*3 + 1);
      int capital1 = (int)(Math.random()*capitales.size());
      int capital2 = (int)(Math.random()*capitales.size());
      

      System.out.println("¿Cúal es la capítal de " + pais.getKey() + "?");

      switch (aleatorio) {
        case 1:
        System.out.println("1. " + pais.getValue()); 
        System.out.println("2. " + capitales.get(capital1) );
        System.out.println("3. " + capitales.get(capital2) );
        respuestaCorrecta = 1;
          break;
        case 2:
        System.out.println("1. " + capitales.get(capital1) ); 
        System.out.println("2. " + pais.getValue());
        System.out.println("3. " + capitales.get(capital2));
        respuestaCorrecta = 2;
          break;
        case 3:
         System.out.println("1. " + capitales.get(capital1)); 
         System.out.println("2. " + capitales.get(capital2));
         System.out.println("3. " + pais.getValue());
         respuestaCorrecta = 3;
          break;
      
      }

      System.out.print("Respuesta: ");
      respuesta = Integer.parseInt(System.console().readLine());

      if (respuesta == respuestaCorrecta) {
        puntos++;
      } else{
        errores++;
      }

      capitales.remove(capital1);
      capitales.remove(capital2);
      
    }  

    if (puntos >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuación:" + puntos + "  Errores:" + errores);
    } else {
      System.out.println("Lo siento, has suspendido Puntuación:" + puntos + "  Errores:" + errores);
    }
  }
}