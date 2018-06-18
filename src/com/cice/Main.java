package com.cice;

import com.cice.ejemplo.ClaseEstatica;
import com.cice.ejemplo.Test;

public class Main {


    public static void main(String[] args) {

        // write your code here

        Test test = new Test();
        System.out.println(test.toString());
        //numeroEntero=0 numeroReal=0.0 esCierto=false  caracter[] nobmre='null'




    //llama a un met. estatico de una clase, no requiere instanciar el objeto para utilizarlo
    ClaseEstatica.nombreCompuesto("Gustavo",  "Gamboa");

    //creo un objeto y modifico el valor de su variable estácica
    ClaseEstatica estatica1=new ClaseEstatica();
    estatica1.numeroEstatico=10;

    //genero un nuevo objeto
    ClaseEstatica estatica2 = new ClaseEstatica();

    //pinto el valor de la variable estatica del nuevo objeto
    System.out.println(estatica2.numeroEstatico);


     String cadena ="Esto es una cadena con muchas vocales"; //14 vocales

     int numeroVocales=0;

     for (int i=0; cadena.length();i++){

            switch (cadena.toLowerCase().charAt(i)){

             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                    //si pasa por aqui es vocal
                    numeroVocales++;
                    break;
              default:
                    //si pasa por aqui es consonante
                    continue;
            }
     }

        System.out.println("El numero de vocales es: "+ numeroVocales);

    }




}
