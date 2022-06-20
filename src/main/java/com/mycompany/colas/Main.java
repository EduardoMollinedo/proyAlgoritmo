package com.mycompany.colas;

/**
 *
 * @author lalo_
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println("PILAS");
//        Pila pila = new Pila();
//        pila.apilar(1);
//        pila.apilar(2);
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(5);
//
//        pila.listar();
//        System.out.println("Retirando elemento");
//
//        pila.retirar();
//        pila.listar();
//
//        System.out.println("Retirando el 2");
//
//        pila.remover(2);
//        pila.listar();
//
//        System.out.println("Colocando strings en pila");
//        pila.apilar("Pepito");
//        pila.apilar("Jos�");
//        pila.apilar("Mar�a");
//        pila.apilar("Juana");
//
//        pila.listar();
//
        System.out.println("COLAS");
        System.out.println("Clientes Empresariales");
        Cola cola = new Cola();
        cola.insertar(new Cliente("Pepito", 70025325));
        cola.insertar(new Cliente("Jos�", 77024315));
        cola.insertar(new Cliente("Mar�a", 72735824));
        cola.extraer();
        cola.extraer();
        System.out.println(cola.toString());
        System.out.println("Clientes Premium");
        Cola cola2 = new Cola();
        cola2.insertar(new Cliente("Luis", 70045725));
        cola2.insertar(new Cliente("Rosa", 77052515));
        cola2.insertar(new Cliente("Mario", 72463824));

        System.out.println(cola2.toString());
    }
}
