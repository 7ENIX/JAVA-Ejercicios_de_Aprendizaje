package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Con 2 arrays que se rellenan con 10 números aleatorios del 1 al 50
comprobar si alguno de los números del array A se repite en el array B.
 */
public class Ejercicio_52 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        // Recorremos los arrays y los rellenamos con números aleatorios con Math.random().
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 50 + 1);
            arrayB[i] = (int) (Math.random() * 50 + 1);
        }

        // Los imprimimos por pantalla para ver qué números tienen.
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));

        // Comprobamos si los números del arrayA se repiten en el arrayB.
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    System.out.println("\nEl número " + arrayA[i] + " del ArrayA se repite en el ArrayB.");
                }
            }
        }
        sc.close();
    }
}
