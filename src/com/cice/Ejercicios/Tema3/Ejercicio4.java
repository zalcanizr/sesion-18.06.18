package com.cice.Ejercicios.Tema3;

import java.sql.SQLOutput;
import java.util.Random;

public class Ejercicio4 {


    public static void main (String[] args){

        Random r =new Random();

        int primerAleatorio=r.nextInt(101)+1;
        int segundoAleatorio =r.nextInt(101)+1;
        int suma =0;

        if (segundoAleatorio==primerAleatorio){
            suma=segundoAleatorio;
            System.out.print("Los números aleatorios son iguales.La suma es: ");
        }
        else if (segundoAleatorio>primerAleatorio){
            for (int i=primerAleatorio;i<=segundoAleatorio;i++){
                suma+=i;
            }
            System.out.print("La suma de los números enteros comprendidos entre: "+(primerAleatorio)+ " y " + (segundoAleatorio)+" es: ");
        }
        else{
            for (int i=segundoAleatorio;i<=primerAleatorio;i++){
                suma+=i;
            }
            System.out.print("La suma de los números enteros comprendidos entre: "+(segundoAleatorio)+ " y " + (primerAleatorio)+" es: ");
        }


        System.out.println(suma);

    }
}
