/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lalo_
 */
public class Caja<T> {
   private T dato;
	
	public Caja() {
		super();
	}
	public T dame() {
		return this.dato;
	}
	public void pon(T x) {
		this.dato = x;
	}

}
