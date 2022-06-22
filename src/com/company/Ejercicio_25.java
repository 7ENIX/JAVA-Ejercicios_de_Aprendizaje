package com.company;

import java.util.Scanner;

/*
Dibujar un rectángulo con * pidiéndole al usuario el número de columnas y de filas.
 */
public class Ejercicio_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas filas tiene tu rectángulo?");
        int filas = sc.nextInt();
        System.out.println("¿Cuántas columnas tiene tu rectángulo?");
        int columnas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            System.out.println();
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* " + " ");
            }
        }
    }
}
