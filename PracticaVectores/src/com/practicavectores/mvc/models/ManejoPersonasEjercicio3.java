package com.practicavectores.mvc.models;

import java.util.Vector;

public class ManejoPersonasEjercicio3 {

  public static Vector<Persona> crearRegistros(String texto) {

    Vector<Persona> personas = new Vector<Persona>();
    String registros[] = texto.split("/");

    for (String registro : registros) {

      String campos[] = registro.split(",");
      personas.add(new Persona(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3].charAt(0)));

    }

    return personas;
  }

  public static String imprimirRegistros(Vector<Persona> personas) {

    String datos = "";

    for (Persona persona : personas) {
      datos += persona + "\n";
    }

    return datos;
  }

  public static Persona obtenerJoven(Vector<Persona> personas) {

    Persona menor = personas.get(0);

    for (Persona persona : personas) {

      if (persona.getEdad() < menor.getEdad()) {
        menor = persona;
      }

    }

    return menor;
  }

}