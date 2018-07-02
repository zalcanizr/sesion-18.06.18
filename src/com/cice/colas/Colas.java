package com.cice.colas;

import java.util.PriorityQueue;

public class Colas {

    //PriorityQueue
    public static void main(String[] args) {

        PriorityQueue<String> cola=new PriorityQueue<>();
        cola.add("barco");
        cola.add("casa");
        cola.add("coche");
        cola.add("perro");
        cola.add("alfombra");

        for (String s:cola){

            System.out.println(s.poll());
        }
        //NO FUNCIONA BIEN LA ORDENACION...solo con el poll
        //vemos que no los muestra ordenados por orden alfabetico

        //probamos a hacerlo de integer
        PriorityQueue<Integer> enteros=new PriorityQueue<>();

        enteros.add(35);
        enteros.add(29);
        enteros.add(13);
        enteros.add(2);
        enteros.add(15);
        enteros.add(42);
        enteros.add(7);

        for (int i=0;enteros.size()>i;) {

            System.out.println(enteros.poll());
        }



    }




}
