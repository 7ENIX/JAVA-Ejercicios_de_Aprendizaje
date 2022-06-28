package com.company;

import java.util.Scanner;

/*
Dibujar un cuadrado con * pidiéndole al usuario el número de * por lado.
 */
public class Ejercicio_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos * mide el lado de tu cuadrado?");
        int lado = sc.nextInt();

        for (int i = 1; i <= lado; i++) {
            System.out.println();
            for (int j = 1; j <= lado; j++) {
                System.out.print("* " + " ");
            }
        }

        sc.close();
    }
}
