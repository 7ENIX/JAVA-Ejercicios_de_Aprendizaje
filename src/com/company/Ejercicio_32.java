package com.company;

import java.util.Scanner;

/*
Dibujar un cuadrado con * con el número de asteriscos que diga el usuario
por lado, pero sin rellenarlo:
 */
public class Ejercicio_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos '*' tiene tu cuadrado?");
        int numero = sc.nextInt();

        for (int h = 0; h < numero; h++) {
            System.out.print("* " + " ");
        }
        System.out.println();
        for (int i = 0; i < numero - 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("* " + " ");
            }
            for (int k = 0; k < numero - 2; k++) {
                System.out.print(" " + " " + " ");
            }
            for (int l = 0; l < 1; l++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
        for (int m = 0; m < numero; m++) {
            System.out.print("* " + " ");
        }
    }
}
