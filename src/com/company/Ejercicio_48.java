package com.company;

/* Calcular la letra del DNI. La forma de obtenerla es dividiendo el número de DNI
entre 23 (23 letras del alfabeto español). El resto obtenido de la división indicará
una posición en el siguiente mapa de letras, y la letra correspondiente a esa posición
es la buscada. */

import java.util.Scanner;

public class Ejercicio_48 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        char letra[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        // CÓDIGO:
        System.out.print("Introduce tu número del DNI sin la letra: ");
        int numeroDNI = sc.nextInt();
        int resto = numeroDNI % 23;

        /* Imprimimos la letra del DNI, la cual su posición en el array coincide con el número
        de "resto". */
        System.out.println("La letra de tu DNI es: " + letra[resto]);
        sc.close();
    }
}
