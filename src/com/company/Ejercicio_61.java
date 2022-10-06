package com.company;

import java.util.Arrays;

/*
Rellenar un array de 10 posiciones con números aleatorios del 1 al 10 y mostrarlo. Después mostrar un
histograma con las frecuencias (veces que se repite) de cada número.
Ejemplo: El array es: [1,8,2,3,5,4,3,3,8,1]
         El número 1 aparece: **
         El número 2 aparece: *
         El número 3 aparece: ***
         El numero 4 aparece: *
*/
public class Ejercicio_61 {
    public static void main(String[] args) {

        // VARIABLES:
        int [] arrayNumeros = new int[10];


        // 1º Rellenamos el array con números aleatorios del 1 al 10.
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (Math.random()*10+1);
        }

        // 2º Mostramos el array en la consola.
        System.out.println("\nEl array es: " + Arrays.toString(arrayNumeros));

        // 3º Recorremos el array mirando cuántas veces se repite cada número y lo mostramos en la consola.
        for (int i = 1; i <= arrayNumeros.length; i++) {
            int numeroDeVecesQueAparece = 0; //Cada vez que comparemos un número reiniciamos sus repeticiones.
            for (int j = 0; j < arrayNumeros.length; j++) {
                if(i == arrayNumeros[j]){
                    numeroDeVecesQueAparece++;
                }
            }
            System.out.print("El numero " + i + " aparece: ");
            for (int j = 0; j < numeroDeVecesQueAparece; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
