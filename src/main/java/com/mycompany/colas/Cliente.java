package com.mycompany.colas;

import java.util.Scanner;

public class Cliente implements Comparable<Cliente> {

    String nombre;
    int nCelular;
    int id; // el id es su DNI 

    public Cliente(String nombre, int dni, int nCelular) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.nCelular = nCelular;
    }

    public Cliente() {
        this.nombre = "";
        this.id = 0;
        this.nCelular = 0;
    }

    public void Ingresar() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.flush();
        System.out.println("Ingrese DNI");
        id = sc.nextInt();
        System.out.println("Ingrese Nombre");
        System.out.flush();
        nombre = sc2.nextLine();
        System.out.println("Ingrese numero de Celular");
        nCelular = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compareTo(Cliente o) {
        return this.nombre.compareTo(o.nombre);
    }

    public String toString() {
        return ("Nombre=" + this.nombre +"nCelular=" + this.nCelular + ", " + "Dni=" + this.id);
    }
}
