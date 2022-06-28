package com.company;

import java.util.Scanner;

/*
Dibujar la siguiente figura (siempre son 5 *):

*****        *****
 *****      *****
  *****    *****
   *****  *****
    **********

 */
public class Ejercicio_30 {
    public static void main(String[] args) {

        int numero = 5;
        int contador = 0;
        int contador2 = numero * 2 - 2;

        for (int i = 0; i < numero; i++) {
            System.out.println();
            contador++;
            for (int j = 0; j < contador; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < contador2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            contador2 = contador2 - 2;
        }
    }
}
