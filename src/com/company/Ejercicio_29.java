package com.company;

import java.util.Scanner;

/*
Repetir el ejercicio anterior pero con el triángulo invertido.
 */
public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Dime un número del 3 al 9?");
        int numero = sc.nextInt();
        int contador = 0;
        int contador2 = numero;

        for (int i = 0; i < numero; i++) {
            System.out.println();
            contador++;
            for (int j = 0; j < contador; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < contador2; k++) {
                System.out.print("* ");
            }
            contador2--;
        }

        sc.close();
    }
}
