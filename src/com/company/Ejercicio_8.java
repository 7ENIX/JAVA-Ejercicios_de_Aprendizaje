package com.company;

import java.util.Scanner;

/*
Pedir un número y mostrar por pantalla si es par o impar.
*PISTA*: Lo averiguaremos mirando el resto de su división entre 2.
*/

public class Ejercicio_8 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero; // Es un Int porque si no

        // CÓDIGO:
        System.out.println("Escribe un número y te digo si es 'par' o 'impar':");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        // Con '%' y 2 sabemos que si el número que introducimos lo dividimos entre 2 y el resto es 0, el número es par.

        sc.close();
    }
}