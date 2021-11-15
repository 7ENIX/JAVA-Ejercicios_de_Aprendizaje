package com.company;

import java.util.Scanner;

/*
Realizar todos los puntos del siguiente ejercicio:
a) Pedir dos números y un intervalo al usuario y mostrar una lista del primero al segundo con ese intervalo.
   Ejemplo:
            Introduce un número: 10
            Introduce otro número: 20
            Introduce el intervalo: 3
            Sacar por pantalla: 10, 13, 16, 19
b) Si el segundo número que introduce el usuario es menor que el primero, intercambiarlos.
c) Si el segundo número que introduce el usuario es menor o igual que el primero, volver a pedírselo hasta que
   introduzca uno mayor.

El punto "b" y el "c" no tienen mucho sentido si los hacemos en el mismo ejercicio, pues el "c" arregla el
problema que puede haber en el "b".
*/

public class Ejercicio_17 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, intervalo;

        // CÓDIGO:
        System.out.println("Escribe el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo número:");
        numero2 = sc.nextInt();

        // Creamos el bucle para el punto "c".
        while (numero2 <= numero1) {
            if (numero2 < numero1) {
                System.out.println("El segundo número es menor que el primero. Escríbelo mayor:");
            } else {
                System.out.println("El segundo número es igual que el primero. Escríbelo mayor:");
            }
            numero2 = sc.nextInt();
        }

        System.out.println("Escribe el número de intervalo que hay entre ellos:");
        intervalo = sc.nextInt();

        // Para hacer el punto "b" del ejercicio vamos a modificar un poco el bucle 'FOR' para ordenar los números...
        for (int i = Math.min(numero1, numero2); i <= Math.max(numero1, numero2); i += intervalo) {
            System.out.print(i + "  ");
        }

        sc.close();
    }
}
