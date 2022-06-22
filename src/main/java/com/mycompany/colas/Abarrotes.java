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
public class Abarrotes implements Comparable<Abarrotes> {

    String unidad = "unidades";
    Integer cantidad;
    String nombre;
    double precioUnitario;

    public Abarrotes(String nombre, Integer cantidad, double precio) {
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precio;

    }

    public Abarrotes() {
        this.nombre = "";
        unidad = "unidades";
    }

    public double ingresar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del abarrote");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese precio unitario ");
        this.precioUnitario = sc.nextDouble();
        System.out.println("Ingrese cantidad en unidades");
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
    public int compareTo(Abarrotes o) {
        return this.nombre.compareTo(o.nombre);
    }
}
