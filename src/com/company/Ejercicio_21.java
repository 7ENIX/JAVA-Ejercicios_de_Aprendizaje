package com.company;

import java.util.Scanner;

/*
Pedir números al usuario hasta que introduzca un 0. Sumar en un acumulador solo aquellos que sean pares.
*/

public class Ejercicio_21 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        double numero, acumulador = 0;

        // CÓDIGO:
        System.out.println("Escribe un número:");
        numero = sc.nextDouble();

        while (numero != 0) {
            if (numero % 2 == 0) {
                acumulador += numero; //Solo sumamos al acumulador los números cuyo resto al dividir entre 2 es "0".
            }
            System.out.println("Escribe otro número:");
            numero = sc.nextDouble();
        }

        System.out.println("La suma de todos los números pares que has introducido es: " + acumulador);

        sc.close();
    }
}
