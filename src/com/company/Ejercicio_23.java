package com.company;

/*
Mostrar la tabla de multiplicar de los números del 1 al 10 (no pedir ningún dato al usuario).
 */

public class Ejercicio_23 {
    public static void main(String[] args) {

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla de multiplicar del numero " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}