package com.company;

import java.util.Scanner;

/*
Programa que pide al usuario dos números enteros y muestre después la suma de los dos.
*/

public class Ejercicio_1 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;

        // CÓDIGO:
        System.out.println("Escribe el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo número:");
        numero2 = sc.nextInt();
        resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);

        sc.close(); // Siempre cerraremos el scanner cuando no lo volvamos a utilizar.
    }
}
