package com.practicavectores.mvc.models;

import java.util.Vector;

public class OperacionesEjercicioI {
  private Vector<Integer> mi_vector;

  public OperacionesEjercicioI(String[] numeros) {
    mi_vector = new Vector<Integer>();

    /* Excepcion controlada por medio del regex numerico */
    for (String numero : numeros) {
      mi_vector.add(Integer.parseInt(numero));
    }
  }

  public int getCantidadElementos() {
    return mi_vector.size();
  }

  public int getSumaTotal() {

    int total = 0;

    for (Integer integer : mi_vector) {
      total += integer;
    }

    return total;

  }

  public double getPromedio() {
    return (double) getSumaTotal() / getCantidadElementos();
  }

  public int getMayorNumero() {

    int mayor = mi_vector.get(0);

    for (Integer numero : mi_vector) {

      if (numero > mayor) {
        mayor = numero;
      }

    }

    return mayor;

  }

  public int getMenorNumero() {

    int menor = mi_vector.get(0);

    for (Integer numero : mi_vector) {

      if (numero < menor) {
        menor = numero;
      }

    }

    return menor;

  }

}