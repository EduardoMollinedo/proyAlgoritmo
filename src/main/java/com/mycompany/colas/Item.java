/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author lalo_
 */
public class Item<T> {

    private T alimento;
    private Double precioTotal;

    public Item(T dato) {
        this.alimento = dato;
    }

    public T dame() {
        return this.alimento;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void pon(T x) {
        this.alimento = x;
    }

    public String toString() {
        return alimento.toString();
    }

    public void precioItem() {
        

    }
}
