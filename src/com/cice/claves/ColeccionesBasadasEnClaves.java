package com.cice.claves;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ColeccionesBasadasEnClaves {

    //BASADA EN CLAVES
    //HASHTABLE O HASHMAP



    public static void main(String[] args) {


        Hashtable<String,String> listaPersonas = new Hashtable<>();


        HashMap<String,String> listaNombres = new HashMap<>();


        //1º HASHTABLE
        //para meter un objeto dentro de la lista el metodo put
        listaPersonas.put("profesor","Gustavo");
        listaPersonas.put("alumno","Jose Mari");
        listaPersonas.put("alumna","Ana");
        //como vemos no hemos repetido la clave

        //vamos a sacar con el get pasándole la key
        String profesor= listaPersonas.get("profesor");
        //esto me devuelve un string
        System.out.println(profesor);


        //comprobamos más metodos
        //size, devuelve el tamaño, el numero de objetos clave-valor
        int tamanio=listaPersonas.size();
        System.out.println(tamanio);

        //contains... ojo con distinguir mays. y mins.
        listaPersonas.contains("Gustavo");//devuelve true
        listaPersonas.contains("gustavo"); //devuelve false

        //idem para el método containsKey
        listaPersonas.containsKey("alumna");

        //listaPersonas.remove("alumno","Jose Mari");

        Set<String> keySet =listaPersonas.keySet();

        for (String key:keySet){
            System.out.println(key);
            System.out.println(listaPersonas.get(key));
        }// como vemos el orden de salida no es el orden de entrada

        //si intento añadir alumno, Andrea lo que hace es actualizar el valor de la clave
        listaPersonas.put("alumno","Andrea");
        //no se puede meter null en la clave ni en el valor
       // listaPersonas.put(null,null); da error

        System.out.println("**********************************************");

        //HACEMOS EL EJEMPLO CON HASHMAP

        listaNombres.put("profesor","Gustavo");
        listaNombres.put("alumno","Andrea");
        listaNombres.put("alumna","Rocio");
        listaNombres.put(null,null); //esto no da error
        String alumno=listaNombres.get("alumno");
        //listaNombres.contains no existe
        Set<String> keySetNombres=listaNombres.keySet();
        for(String key: keySetNombres){
            System.out.println(key);
            System.out.println(listaNombres.get(key));
        }







    }
}
