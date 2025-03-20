package com.holamundo.mvc.models;

import java.util.ArrayList;

public class ListaPersonas {

  private ArrayList<Persona> lista;

  public ListaPersonas() {
    lista = new ArrayList<Persona>();
  }

  // CREATE
  public void create(Persona item) {
    lista.add(item);
  }

  // READ
  public String getData() {

    String data = "";

    for (Persona persona : lista) {
      data += persona + "\n";
    }

    return data;

  }

  public String getVivos() {

    String data = "";

    for (Persona persona : lista) {
      if (persona.isVivo()) {
        data += persona + "\n";
      }
    }

    return data;

  }

  public Persona getItem(int id) {
    return lista.get(id);
  }

  // UPDATE
  public void update(Persona item, int id) {
    lista.set(id, item);
  }

  // DELETE
  public void delete(int id) {
    lista.remove(id);
  }

}
