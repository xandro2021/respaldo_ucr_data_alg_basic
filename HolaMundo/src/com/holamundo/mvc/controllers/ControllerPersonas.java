package com.holamundo.mvc.controllers;

import com.holamundo.mvc.models.ListaPersonas;
import com.holamundo.mvc.models.Persona;

public class ControllerPersonas {

  public ControllerPersonas() {

  }

  public void init() {

    ListaPersonas l = new ListaPersonas();
    Persona p = new Persona(0, "Federico", 35, true);
    l.create(p);

    l.create(new Persona(1, "Ana", 25, false));
    l.create(new Persona(2, "Luis", 78, true));
    l.create(new Persona(3, "Maria", 15, true));
    l.create(new Persona(4, "Juan", 65, false));

    System.out.println(l.getData());
    System.out.println(l.getVivos());

    int elem_buscar = 0;
    System.out.println("El elemento #"+elem_buscar+" corresponde a: ");
    System.out.println(l.getItem(elem_buscar));


    System.out.println("El elemento #"+elem_buscar+" ha sido eliminado");
    l.delete(elem_buscar);
    System.out.println(l.getData());
  }

}
