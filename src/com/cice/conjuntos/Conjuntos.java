package com.cice.conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos {


    public static void main(String[] args) {

        HashSet<String> lista=new HashSet<>();

        lista.add("Gustavo");
        lista.add("Gustavo");

        for (String data: lista){
            System.out.println(data);

            //hemos metido dos veces el mismo objeto y solo muestra uno porque
            //no pueden existir objetos duplicados...

        //nno tenemos get ni indice para preguntar por la posicion...
            // xa sacar la info la unica opcion que tenmos es recorrer la lista
            // con el for each de arriba o de o.f. es utilizar el metodo iterator
            Iterator<String> iterator=lista.iterator();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


        }


    }
}
