package com.practicavectores.mvc.models;

public class Persona {

  private String nombre;
  private String apellidos;
  private int edad;
  private char genero;

  public Persona(String nombre, String apellidos, int edad, char genero) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.genero = genero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  @Override
  public String toString() {
    return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", genero=" + genero + "]";
  }

}