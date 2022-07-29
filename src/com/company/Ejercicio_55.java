package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*
Crear y mostrar un array bidimensional de 10 x 10.
En cada posición se guardará (fila*columna).
*/
public class Ejercicio_55 {
    public static void main(String[] args) {

        // VARIABLES:
        int [][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i*j);
                System.out.print(" | " + array[i][j]);
            }
        }
    }
}
