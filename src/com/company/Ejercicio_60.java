package com.company;

/*
Crear un array bidimensional de 10x10 rellenándolo aleatoriamente de de 0 o 1. Imprimir el array por
pantalla y decir cuántos 0s y cuantos 1s tiene el array.
 */
public class Ejercicio_60 {
    public static void main(String[] args) {

        // VARIABLES:
        int [][] arrayBidimensional =  new int[10][10];
        int contador0 = 0, contador1 = 0;

        /* Rellenamos el array bidimensional con números aleatorios entre 0 y 2, sin incluir el 2. Así, cuando los
        redondeemos al número entero será un '0'' o un '1'. */
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional.length; j++) {
                arrayBidimensional[i][j] = (int) (Math.random()*2);
            }
        }

        // Imprimimos el array:
        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayBidimensional.length; j++) {
                System.out.print(" | " + arrayBidimensional[i][j]);
            }
        }

        // Comprovamos cuántos números '0' y '1' tiene el array:
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional.length; j++) {
                if (arrayBidimensional[i][j] == 0) {
                    contador0++;
                } else {
                    contador1++;
                }
            }
        }

        // Imprimimos el número de '0's y de '1's.
        System.out.println("\n\nEl array tiene " + contador0 + " números '0' y " + contador1 + " números '1'.");
    }
}
