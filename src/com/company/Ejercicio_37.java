package com.company;

import java.util.Scanner;

/*
Realizar el siguiente dibujo:
*****
 *****
  *****
   *****
  *****
 *****
*****
 */
public class Ejercicio_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero del 1 al 9: ");
        int numero = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < contador; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            contador++;
            System.out.println();
        }
        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < contador-2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            contador--;
            System.out.println();
        }
    }
}

