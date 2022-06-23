/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

public class Register<E> implements Comparable<Register<E>>
{
    protected int key;
    protected E value;
    
    public Register(final int key, final E value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public int compareTo(final Register<E> r) {
        return this.key - r.key;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Register) {
            final Register<E> r = (Register<E>)o;
            return r.key == this.key;
        }
        return false;
    }
    
    public int getKey() {
        return this.key;
    }
    
    public E getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.key) + ":" + this.value.toString();
    }
}