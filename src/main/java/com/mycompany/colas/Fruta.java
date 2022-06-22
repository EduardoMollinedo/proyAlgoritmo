/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.Scanner;

/**
 *
 * @author lalo_
 */
public class Fruta implements Comparable<Fruta> {

    String unidad = "kilogramos";
    Integer cantidad;
    String nombre;
    double precioUnitario;

    public Fruta(String nombre, Integer cantidad, double precio) {
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precio;

    }

    public Fruta() {
        this.nombre = "";
        unidad = "kilogramos";
    }

    public double ingresar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de la fruta");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese precio unitario por kg");
        this.precioUnitario = sc.nextDouble();
        System.out.println("Ingrese cantidad en kg");
        this.cantidad = sc.nextInt();
        return calcularPrecio();
    }

    public double calcularPrecio() {
        return cantidad * precioUnitario;
    }

    public String toString() {
        return (cantidad + " " +unidad + " de " + nombre + " a "+ calcularPrecio()+"\n");
    }

    @Override
    public int compareTo(Fruta o) {
        return this.nombre.compareTo(o.nombre);
    }
}
