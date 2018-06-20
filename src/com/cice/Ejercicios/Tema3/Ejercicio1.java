package com.cice.Ejercicios.Tema3;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;

public class Ejercicio1 {



    public static void main (String args[]) {

        String[] arrayStrings = {"hola que tal", "quiero ver el maximo", "hasta lluego", "probando"};

        int maximo = 0;
        String aux="";

        for (int i = 0; i < arrayStrings.length; i++) {

            if (maximo < arrayStrings[i].length())
                    aux=arrayStrings[i];
                    maximo = arrayStrings[i].length();

        }

        System.out.println("La cadena de mayor longitug tiene: " + maximo + " posiciones y es: " + aux);


        String cadena="esto.es.una.cadena.grande";
        String[] array=cadena.split("\\.");

        Arrays.stream(array).forEach(p-> System.out.println(p));

    }
}
