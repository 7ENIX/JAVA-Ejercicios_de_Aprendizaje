package com.company;

import java.util.Arrays;
import java.util.Scanner;

/* Leer por teclado dos tablas de 5 números enteros y mezclarlas en una
tercera de la forma */

public class Ejercicio_50 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] arrayCombo = new int[10];
        int numeracion = 0;

        // :::::::::::::::::::::::::::: CÓDIGO :::::::::::::::::::::::::::: //

        System.out.println("A continuación escribe números enteros y positivos: ");
        System.out.println("Introduce 5 números para la 1ª tabla:");
        // Con un for vamos preguntando los números hasta rellenar el array1.
        for (int i = 0; i < array1.length; i++) {
            numeracion++;
            System.out.print("Escribe el " + numeracion + "º número de la 1ª tabla: ");
            array1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Ahora introduce 5 números para la 2ª tabla:");
        // Volvemos a definir la numeración a 0;
        numeracion = 0;
        // Con un for vamos preguntando los números hasta rellenar el array2.
        for (int i = 0; i < array2.length; i++) {
            numeracion++;
            System.out.print("Escribe el " + numeracion + "º número de la 2ª tabla: ");
            array2[i] = sc.nextInt();
        }

        int posicion = 0;

        for (int i = 0; i < arrayCombo.length; i++) {
            arrayCombo[i] = array1[posicion];
            i++;
            arrayCombo[i] = array2[posicion];
            posicion++;
        }
        // Imprimimos por pantalla las 2 tablas y la tabla combinada.
        System.out.println("La primera tabla es: " + Arrays.toString(array1));
        System.out.println("La segunda tabla es: " + Arrays.toString(array2));
        System.out.println("La combinación de ambas tablas es: " + Arrays.toString(arrayCombo));

        sc.close();
    }
}
