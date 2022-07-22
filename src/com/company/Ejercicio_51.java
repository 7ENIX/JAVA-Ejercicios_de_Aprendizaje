package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Leer por teclado una serie de 10 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente,
decreciente, o si están desordenados.
 */
public class Ejercicio_51 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        int[] arrayNumeros = new int[10];
        int numeracion = 0, creciente = 0, decreciente = 0, desorden = 0;


        // :::::::::::::::::::::::::::: CÓDIGO :::::::::::::::::::::::::::: //

        System.out.println("Introduce 10 números enteros y positivos: ");

        // Con un for vamos preguntando los números hasta rellenar el arrayNumeros.
        for (int i = 0; i < arrayNumeros.length; i++) {
            numeracion++;
            System.out.print("Escribe el " + numeracion + "º número: ");
            arrayNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayNumeros.length-1; i++) {
            if (arrayNumeros[i] <= arrayNumeros[i+1]) {
                creciente++;
            }
            if (arrayNumeros[i] >= arrayNumeros[i+1]) {
                decreciente++;
            }
        }

        if (creciente == 9) {
            System.out.println("La secuencia de números es creciente.");
        } else if (decreciente == 9) {
            System.out.println("La secuencia de números es decreciente.");
        } else {
            System.out.println("La secuencia de números es desordenada.");
        }
        sc.close();
    }
}
