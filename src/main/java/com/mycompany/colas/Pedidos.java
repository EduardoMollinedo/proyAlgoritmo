/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lalo_
 */
public class Pedidos implements Comparable<Pedidos> {

    String cliente;
    Pila listaItems;
    double precioTotal;

    public Pedidos() {
        super();
        cliente = "";
        precioTotal = 0.0;
        listaItems = new Pila();
    }

    public Pedidos(String cliente, Pila listaItems, double precio) {
        super();
        this.cliente = cliente;
        this.precioTotal = precio;
        this.listaItems = listaItems;
    }

    public void ingresar() {
        int fl = 1;
        
        Scanner sc = new Scanner(System.in);
        Integer opc = 0;
        System.out.flush();
        System.out.println("NUEVO PEDIDO");
        System.out.println("Ingrese nombre de cliente");
        cliente = sc.nextLine();
        while (fl == 1) {
            System.out.flush();
            System.out.println("Agregar fruta (1) o abarrote (2)");
            opc = sc.nextInt();
            if (opc == 1) {
                Fruta f = new Fruta();
                precioTotal += f.ingresar();
                Item<Fruta> item = new Item<Fruta>(f);
                item.setPrecioTotal(f.calcularPrecio());
                listaItems.apilar(item);
            }
            if (opc == 2) {
                Abarrotes a = new Abarrotes();
                precioTotal += a.ingresar();
                Item<Abarrotes> item = new Item<Abarrotes>(a);
                item.setPrecioTotal(a.calcularPrecio());
                listaItems.apilar(item);
            }

            System.out.println("Agregar otro elemento? si(1) no (0)");
            fl = sc.nextInt();
        }
    }
  
    @Override
    public int compareTo(Pedidos o) {
        return this.cliente.compareTo(o.cliente);
    }

    public String toString() {
        System.out.flush();

        String s = ("**********Cliente: " + this.cliente + "********** \nPedido: \n"
                + listaItems + "\nPrecio total : " + precioTotal + "\n");
        return s;
    }

}
