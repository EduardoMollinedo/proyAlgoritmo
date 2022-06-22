package com.mycompany.colas;

public class Cola<T> {

    private Nodo<T> inicio;
    private Nodo<T> termino;
    private int tamano;

    public Cola() {
        inicio = null;
        termino = null;
    }

    public void insertar(T valor) {
        Nodo<T> i = new Nodo<T>(valor);
        i.setSiguiente(null);
        if (inicio == null && termino == null) {
            inicio = i;
            termino = i;
        } else {
            termino.setSiguiente(i);
            termino = termino.getSiguiente();
        }

    }

    public T extraer() {
        T dato = inicio.getValor();
        inicio = inicio.getSiguiente();
        return dato;
    }

    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null && termino == null) {
            cola = true;
        } else {
            cola = false;
        }
        return cola;
    }

    public int contar() {
        int contador = 0;
        Nodo<T> c = this.inicio;
        while (c != null) {
            System.out.println(c.toString());
            contador++;
            c = c.getSiguiente();
        }
        return contador;
    }

    public void listar() {
        Nodo<T> aux = inicio;

        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }
    }

    public String toString() {
        System.out.println("entra a la cola de pedidos");
        Nodo<T> c = this.inicio;
        String s = "";
        if (c == null) {
            System.out.flush();
            System.out.println("No hay pedidos pendientes");

        }
        while (c != null) {
            s = s + c.toString();
            c = c.getSiguiente();
        }
        return s;
    }
}
