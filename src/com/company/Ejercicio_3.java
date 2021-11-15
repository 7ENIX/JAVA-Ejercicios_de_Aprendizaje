package com.company;

import java.util.Scanner;

/*
Pedir dos números enteros por pantalla y mostrar el resultado de su suma, resta, multiplicación y división.
*/

public class Ejercicio_3 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        float resultado;

        // CÓDIGO:
        System.out.println("Escribe el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo número:");
        numero2 = sc.nextInt();

        // Suma:
        resultado = numero1 + numero2;
        System.out.println("La SUMA de los dos números es: " + resultado);

        // Resta:
        resultado = numero1 - numero2;
        System.out.println("La RESTA de los dos números es: " + resultado);

        // Multiplicación:
        resultado = numero1 * numero2;
        System.out.println("La MULTIPLICACIÓN de los dos números es: " + resultado);

        // División:
        resultado = numero1 / numero2;
        System.out.println("La DIVISIÓN de los dos números es: " + resultado);

        sc.close();
    }
}
