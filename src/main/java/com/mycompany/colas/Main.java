package com.mycompany.colas;

import java.util.Scanner;

/**
 *
 * @author lalo_
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola colaPedidos = new Cola();
        HashC<String> h = new HashC<String>(11);
        h.insert(34, "Faraon");
        h.insert(3, "Pedrito");
        h.insert(7, "Castillo");
        h.insert(30, "Fiu Fiu");
        h.insert(5, "Aguacate");
        h.insert(14, "Dr Strange");
        h.insert(23, "Cali");
         h.insert(23, "Cali");
        h.insert(22, "Algoritmos");
        h.insert(8, "Estructuras");
        h.insert(13, "Datos");
        System.out.println(h.toString());
//        h.delete(34);
//        System.out.println("New Table 2.0");
//        System.out.println(h.toString());
//        h.insert(34, "Faraon");
//        System.out.println("New Table3.0 insertando en posici\u00f3n eliminada");
//        System.out.println(h.toString());        
//        
        
        
        
        
   //     Pedidos ejem = new Pedidos();
        
//        Fruta xxx = new Fruta("Manzana", 2, 2.9);
//        Item<Fruta> item = new Item<Fruta>(xxx);
//        Pila pilaa = new Pila();
//        pilaa.apilar(item);
//        
//        Pedidos p = new Pedidos("edu",pilaa,22.3);
//        colaPedidos.insertar(p);
//       // System.out.println("hola");
//        System.out.println(colaPedidos.contar());
//        System.out.println(colaPedidos);
        /*
        boolean fl = true;
        while (fl) {
            System.out.println("*********BODEGUITA**********");
            System.out.println("Ingrese opcion\n1.- Ingresar Pedidos\n2.- Mostrar pedidos"
                    + "\n3.- Atender Pedido\n4.- Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    Pedidos p = new Pedidos();
                    p.ingresar();
                    colaPedidos.insertar(p);
                    break;
                }
                case 2: {
                    System.out.println(colaPedidos.toString());

                    break;
                }
                case 3: {
                    colaPedidos.extraer();
                    System.out.println("Atendiendo pedido en cola....");
                    break;
                }
                case 4: {
                    fl = false;
                }
            }
        }

        */

        
//        System.out.println("Ingrese opcion\n1.- Ingresar Pedidos\n2.- Mostrar pedidos\n3.- Atender Pedido\n4.- Buscar");
//        int opcion = hola.nextInt();
//        
//        switch(opcion){
//            case 1 :
//                for(int i=0; i<nPedidos; i++){
//                    Pedidos p = new Pedidos();
//                    listaPedidos[i]=p;
//                    p.ingresar();
//                }
//                break;
//        }

       
        
    }
}
