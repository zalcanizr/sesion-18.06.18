package com.cice.Ejercicios.Tema3;



public class Ejercicio3 {

    public static void main(String[] args) {


        //con String
        String cadena = "Texto donde se insertarán espacios";

        cadena=cadena.replace(" ", "/ ");
        System.out.println(cadena);

        System.out.println("***********************************");


        //o.f. con StringBuilder
        StringBuilder sb = new StringBuilder("Esto es una cadena con espacios");

        int pos =0;

        while ((pos=sb.indexOf(" ",pos))>0){

            sb.insert(pos, "/");
            pos+=2;
        }
        System.out.println(sb.toString());


    }


}
