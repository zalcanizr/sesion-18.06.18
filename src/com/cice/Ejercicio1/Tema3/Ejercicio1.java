package com.cice.Ejercicio1.Tema3;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Ejercicio1 {



    public static void main (String args[]) {

        String[] arrayStrings = {"hola que tal", "quiero ver el maximo", "hasta lluego", "probando"};

        int maximo = 0;

        for (int i = 0; i < arrayStrings.length(); i++) {

            if (maximo < arrayStrings[i].length()) then

                    maximo = arrayStrings[i].length();
        }

        System.out.println("La cadena de mayor longitug tiene: " + maximo + "Posiciones");

    }
}
