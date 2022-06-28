package com.company;

import java.util.Scanner;

/*
Dibujar un cuadrado con * pidiéndole al usuario el número de * por lado,
pero solo pintando los * pares en las filas pares y los impares en las impares.
 */
public class Ejercicio_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        int fila = 1;

        for (int i = 0; i < lado; i++) {
            System.out.println();
            if(fila % 2 == 0){
                for (int j = 0; j < lado; j++) {
                    System.out.print(" *" + " ");
                }
            } else {
                for (int j = 0; j < lado; j++) {
                    System.out.print("* " + " ");
                }
            }
            fila++;
        }

    }
}
