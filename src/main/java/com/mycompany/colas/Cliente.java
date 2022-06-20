package com.mycompany.colas;

public class Cliente implements Comparable<Cliente>{
	String nombre;
	int dni;
	
	public Cliente(String nombre,int dni) {
		super();
		this.nombre=nombre;
		this.dni=dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni=dni;
	}
	public int compareTo(Cliente o) {
		return this.nombre.compareTo(o.nombre);
	}
	public String toString() {
		return("Nombre="+this.nombre+", "+"Dni="+this.dni);
	}
}
