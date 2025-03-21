package com.practicavectores.mvc.controllers;

import java.util.Vector;

import com.practicavectores.mvc.models.ManejoPersonasEjercicio3;
import com.practicavectores.mvc.models.Persona;

public class Ejercicio3 {

  public void run() {

    String hilera_nombres = "Felipe,Jenkins Cruz,25,m/Marisol,Coto Molina,15,f/Itorino,Espinoza Torres,20,m/Olivier,Blanco Sandí,10,m";

    if (isStringFormatValid(hilera_nombres)) {

      Vector<Persona> personas = ManejoPersonasEjercicio3.crearRegistros(hilera_nombres);
      System.out.println(ManejoPersonasEjercicio3.imprimirRegistros(personas));
      System.out.println("**********");
      System.out.println("El menor es: "+ManejoPersonasEjercicio3.obtenerJoven(personas));

    } else {
      System.out.println("La hilera no cumple con el formato: ");
      System.out.println("Nombre,Apellidos,Edad,Genero/Nombre,Apellidos,Edad,Genero/...");
    }

  }

  private boolean isStringFormatValid(String hilera_nombres) {
    String regex = "([A-Za-zÁÉÍÓÚáéíóúÑñ]+,[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*,\\d{1,3},[mf]/?)+";
    return hilera_nombres.matches(regex);
  }

}