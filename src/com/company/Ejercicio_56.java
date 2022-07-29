package com.company;
/*
Crear y cargar dos matrices de tamaño 3x3 con números aleatorios (0-100),
sumarlas en un tercer array y mostrarlo.
*/
public class Ejercicio_56 {
    public static void main(String[] args) {

        // VARIABLES:
        int [][] array1 = new int[3][3];
        int [][] array2 = new int[3][3];
        int [][] arrayFinal = new int[3][3];

        // Rellenamos los arrays bidimensionales con números aleatorios entre el 0 y el 100.

        // Array1:
        System.out.print("----- Array1 -----");
        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = (int) (Math.random()*100+1);
                System.out.print(" | " + array1[i][j]);
            }
        }
        System.out.println(); /* Línea en blanco para separar los arrays en la consola. */

        // Array2:
        System.out.print("----- Array2 -----");
        for (int i = 0; i < array2.length; i++) {
            System.out.println();
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = (int) (Math.random()*100+1);
                System.out.print(" | " + array2[i][j]);
            }
        }
        System.out.println(); /* Línea en blanco para separar los arrays en la consola. */

        // Sumamos el array1 + array2 para rellenar el arrayFinal:
        System.out.print("----- ArrayFinal: -----");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayFinal.length; j++) {
                arrayFinal[i][j] = array1[i][j] + array2[i][j];
                System.out.print(" | " + arrayFinal[i][j]);
            }
        }
    }
}
