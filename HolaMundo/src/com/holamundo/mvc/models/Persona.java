package com.holamundo.mvc.models;

public class Persona {

	private int id;
	private String nombre;
	private int edad;
	private boolean vivo;

	public Persona(int id, String nombre, int edad, boolean vivo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.vivo = vivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", vivo=" + vivo + "]";
	}
	
}
