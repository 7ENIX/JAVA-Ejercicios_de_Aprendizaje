package com.company;

import java.util.Scanner;

/*
Calcular el área de un triángulo pidiendo la base y la altura. Preguntaremos al usuario si las medidas introducidas
están en metros o centímetros. Según lo que no diga, daremos el resultado en la misma medida.

Fórmula: Área de triángulo = (base * altura) / 2.
*/

public class Ejercicio_5 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String medida;
        float base, altura, area;

        // CÓDIGO:
        System.out.println("Escribe la base del triángulo:");
        base = sc.nextFloat();
        System.out.println("Escribe la altura del triángulo:");
        altura = sc.nextFloat();
        System.out.println("Escribe 'm' si las medidos introducidas están en metros o 'c' si están en centímetros");
        medida = sc2.nextLine();
        medida = medida.toLowerCase(); // Convertimos la letra que introduzcamos en minúscula.

        area = base * altura / 2; // Fórmula.

        if (medida.equals("m")) { // Si la letra introducida es igual a "m" nos dará el resultado en m2.
            System.out.printf("El área del triángulo es: %5.2f m2.", area);
        }
        if (medida.equals("c")) { // Si la letra introducida es igual a "c" nos dará el resultado en cm2.
            System.out.printf("El área del triángulo es: %5.2f cm2.", area);
        }

        sc.close();
        sc2.close();
    }
}
