package com.company;

import java.util.Scanner;

/*
Pedir tres números y mostrarlos ordenados de mayor a menor o viceversa.
*/

public class Ejercicio_12 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3, numeroAux;

        // CÓDIGO:
        System.out.println("Escribe el 1º número:");
        numero1 = sc.nextInt();
        System.out.println("Escribe el 2º número:");
        numero2 = sc.nextInt();
        System.out.println("Escribe el 3º número:");
        numero3 = sc.nextInt();

        if(numero1 < numero2) {
            numeroAux = numero1;
            numero1 = numero2;
            numero2 = numeroAux;
        }

        if(numero2 < numero3) {
            numeroAux = numero2;
            numero2 = numero3;
            numero3 = numeroAux;
        }

        if(numero1 < numero2) {
            numeroAux = numero1;
            numero1 = numero2;
            numero2 = numeroAux;
        }

        System.out.println("El orden de los números de mayor a menor será: " + numero1 + ", " + numero2 + ", " + numero3 + ".");

        sc.close();
    }
}