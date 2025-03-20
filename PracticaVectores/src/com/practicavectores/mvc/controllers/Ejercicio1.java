package com.practicavectores.mvc.controllers;

import com.practicavectores.mvc.models.OperacionesEjercicioI;

public class Ejercicio1 {

  private String numeros;

  public Ejercicio1(String numeros) {
    this.numeros = numeros;
  }

  public void run() {

    if (isStringValidNumbers(numeros)) {

      OperacionesEjercicioI operaciones_vector = new OperacionesEjercicioI(numeros.split(","));
      System.out.println("Numero elementos: " + operaciones_vector.getCantidadElementos());
      System.out.println("Suma Total: " + operaciones_vector.getSumaTotal());
      System.out.println("Promedio: " + String.format("%.3f", operaciones_vector.getPromedio()));
      System.out.println("Mayor Numero: " + operaciones_vector.getMayorNumero());
      System.out.println("Menor Numero: " + operaciones_vector.getMenorNumero());

    } else {
      System.out.println("Invalido, la cadena solo debe contener unicamente numeros separados por commas");
    }

  }

  private boolean isStringValidNumbers(String numeros) {
    String regex = "^\\d+(,\\d+)*$";
    return numeros.matches(regex);
  }

}