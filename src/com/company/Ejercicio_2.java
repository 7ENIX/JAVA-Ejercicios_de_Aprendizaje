package com.company;

import java.util.Scanner;

/*
Programa que pide al usuario un número y que muestre a continuación su tabla de multiplicar.
*/

public class Ejercicio_2 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero;

        // CÓDIGO:
        System.out.println("Escribe un número y saldrá su tabla de multiplicar.");
        numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del número " + numero + " :");
        System.out.println(numero + " x  1 = " + numero * 1);
        System.out.println(numero + " x  2 = " + numero * 2);
        System.out.println(numero + " x  3 = " + numero * 3);
        System.out.println(numero + " x  4 = " + numero * 4);
        System.out.println(numero + " x  5 = " + numero * 5);
        System.out.println(numero + " x  6 = " + numero * 6);
        System.out.println(numero + " x  7 = " + numero * 7);
        System.out.println(numero + " x  8 = " + numero * 8);
        System.out.println(numero + " x  9 = " + numero * 9);
        System.out.println(numero + " x 10 = " + numero * 10);

        // 2ª MANERA:
        /* Iniciamos "i" en "1" porque si ponemos "0" nos multiplicará el número por 0. */
        System.out.println("Tabla de multiplicar del número " + numero + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        sc.close();
    }
}
