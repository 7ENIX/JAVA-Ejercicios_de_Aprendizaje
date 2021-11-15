package com.company;

import java.util.Scanner;

/*
Usando un bucle: Pedir un número al usuario y mostrar su tabla de multiplicar.
*/

public class Ejercicio_15 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero, contador = 1, contador2 = 1;
        // Usamos 2 contadores porque si utilizamos solo el 'contador' cuando llegue al bucle 'DO-WHILE' empezará en 11.

        // CÓDIGO:
        System.out.println("Escribe un número y se mostrará su tabla de multiplicar.");
        numero = sc.nextInt();
        System.out.println("Tabla de multiplicar del número " + numero + " :");

        // Bucle 'FOR':
        System.out.println("Con el bucle 'FOR':");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
            //Iniciamos "i" en "1" porque si ponemos "0" nos multiplicará el número por 0.
        }
        System.out.println();

        // Bucle 'WHILE':
        System.out.println("Con el bucle 'WHILE':");
        while(contador <= 10) {
            System.out.println( numero + " x " + contador + " = " + numero * contador);
            contador++;
        }
        System.out.println();

        // Bucle 'DO-WHILE';
        System.out.println("Con el bucle 'DO-WHILE':");
        do {
            System.out.println( numero + " x " + contador2 + " = " + numero * contador2);
            contador2++;
        } while (contador2 <= 10);

        sc.close();
    }
}
