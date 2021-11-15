package com.company;

import java.util.Scanner;

/*
Escribe un programa que pida un número y luego muestre en pantalla todos los números pares que hay entre 0 y el
número solicitado.
*/

public class Ejercicio_20 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero;

        // CÓDIGO:
        System.out.println("Escribe un número:");
        numero = sc.nextInt();
        System.out.println("Los números pares entre el 0 y el número " + numero + " son: ");

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {  // Si el resto de la división del número entre 2 es "0", ese número es par.
                System.out.print(i + ", ");
            }
        }

        sc.close();
    }
}
