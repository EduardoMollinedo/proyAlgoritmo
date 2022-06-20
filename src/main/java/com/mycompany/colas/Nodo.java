package com.mycompany.colas;

public class Nodo<T>{
	Object valor;
	private Nodo<T> siguiente;
	
	public Nodo(T valor)
	{
		this.valor=valor;
		this.siguiente=null;
	}
	@SuppressWarnings("unchecked")
	public T getValor() {
		return (T) valor;
	}
	@SuppressWarnings("unchecked")
	public void setValor(Object valor) {
		this.valor= (T) valor;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente=siguiente;
	}
	public String toString()
	{
		String s=" "+valor+" ";
		return s;
	}
}
