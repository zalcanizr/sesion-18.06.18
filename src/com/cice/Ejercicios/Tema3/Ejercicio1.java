package com.cice.Ejercicios.Tema3;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

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

        System.out.println("La cadena de mayor longitug tiene: " + maximo + "Posiciones y es: " + aux);

    }
}
