package com.cice.Ejercicios.Tema3;


import java.util.Scanner;

public class ClaseEnvoltorio {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero: ");

        String a = sc.nextLine();

        System.out.print("introduce otro numero: ");

        String b = sc.nextLine();

        int enteroA = Integer.parseInt(a);
        int enteroB = Integer.parseInt(b);

        System.out.println("La suma de los numeros es: " + (enteroA + enteroB));


    }
}
