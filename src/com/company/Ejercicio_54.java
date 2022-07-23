package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición
indicada, desplazando los que estén detrás.
*/

public class Ejercicio_54 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero = 0, posicion = 0;
        int[] tabla = new int[10];

        // Rellenamos el Array con 8 números que pedimos al usuario y los imprimimos.
        for (int i = 0; i < tabla.length-2; i++) {
            System.out.print("Introduce el " + (i+1) + " número: ");
            tabla[i] = sc.nextInt();
        }
        System.out.println("Los números son: " + Arrays.toString(tabla));

        // Pedimos número y posición:
        System.out.println("Ahora vas a introducir un número y una posición 2 veces");
        for (int i = 0; i < 2; i++) {
            System.out.print("Número " + (i+1) + ":");
            numero = sc.nextInt();
            System.out.print("Posición (0-9): ");
            posicion = sc.nextInt();
            for (int j = 9; j > posicion ; j--) {
                tabla[j] = tabla[j-1]; // Igualamos el valor de la posición al valor de la posición anterior.
            }
            tabla[posicion] = numero;
        }

        // Imprimimos el Array final:
        System.out.println(Arrays.toString(tabla));
    sc.close();
    }
}
