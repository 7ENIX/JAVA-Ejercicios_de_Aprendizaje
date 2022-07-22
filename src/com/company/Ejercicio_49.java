package com.company;

import java.util.Arrays;
import java.util.Scanner;

/* Crear un array de enteros de 10 posiciones, pedir números al usuario hasta rellenarlo.
Mostrar a continuación la media de los números y cuál es el mayor y el menor. */

public class Ejercicio_49 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int[] arrayNumeros = new int[3];
        int numeracion = 0, suma = 0;
        double media;

        // :::::::::::::::::::::::::::: CÓDIGO :::::::::::::::::::::::::::: //

        System.out.println("A continuación escribe 10 números enteros y positivos: ");

        // Con un for vamos preguntando los números hasta rellenar el array.
        for (int i = 0; i < arrayNumeros.length; i++) {
            numeracion++;
            System.out.print("Escribe el " + numeracion + "º número: ");
            arrayNumeros[i] = sc.nextInt();
        }

        /* Imprimimos el contenido del array (esto no lo pide el ejercicio, pero está bien
        saber cómo se imprime un array simple). */
        System.out.println(Arrays.toString(arrayNumeros));

        // Recorremos el array y vamos sumando todos sus valores.
        for (int i = 0; i < arrayNumeros.length; i++) {
            suma = suma + arrayNumeros[i];
        }

        // Calculamos la media de los números del array y la imprimimos.
        media = suma / arrayNumeros.length;
        System.out.println("La media de los números introducidos es: " + media);

        // Creamos los números menor y mayor y asignamos su valor a una posición del array.
        int numeroMenor = arrayNumeros[1];
        int numeroMayor = arrayNumeros[1];

        // Recorremos el array para saber qué número es el mayor y cuál es el menor.
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (numeroMenor > arrayNumeros[i]) {
                numeroMenor = arrayNumeros[i];
            }
            if (numeroMayor < arrayNumeros[i]) {
                numeroMayor = arrayNumeros[i];
            }
        }

        // Imprimimos el número más pequeño y grande que del array.
        System.out.println("El número introducido más pequeño es el " + numeroMenor + ".");
        System.out.println("El número introducido más grande es el " + numeroMayor + ".");
        sc.close();
    }
}