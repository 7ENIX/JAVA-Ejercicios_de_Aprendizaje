package com.company;

import java.util.Scanner;

/*
Calcular el área de un círculo pidiendo su radio o su diámetro. Preguntaremos al usuario si las medidas introducidas
están en metros o centímetros. Según lo que no diga, daremos el resultado en la misma medida.

Fórmula: Área de círculo = pi * r2.
*/

public class Ejercicio_6 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double pi = 3.141592653589;
        double radio, diametro, area;
        int eleccion;
        String medida;

        // CÓDIGO:
        System.out.println("Pulsa '1' para introducir el radio del círculo o pulsa '2' para introducir el diámetro:");
        eleccion = sc.nextInt();

        if (eleccion == 1) {
            System.out.println("Introduce el radio del círculo:");
            radio = sc.nextDouble();

            area = pi * Math.pow(radio, 2); // Fórmula con el radio.

            System.out.println("Escribe 'm' si el radio estaba en metros o 'c' si estaba en centímetros:");
            medida = sc2.nextLine();
            if (medida.equals("m")) {
                System.out.printf("El área del círculo es: %5.2f m2.", area);
            }
            if (medida.equals("c")) {
                System.out.printf("El área del círculo es: %5.2f cm2.", area);
            }

        } else {
            System.out.println("Introduce el diámetro del círculo:");
            diametro = sc.nextDouble();

            area = pi * ((Math.pow(diametro, 2)) / 4); // Fórmula con el diámetro.

            System.out.println("Escribe 'm' si el radio estaba en metros o 'c' si estaba en centímetros:");
            medida = sc2.nextLine();
            if (medida.equals("m")) {
                System.out.printf("El área del círculo es: %5.2f m2.", area);
            }
            if (medida.equals("c")) {
                System.out.printf("El área del círculo es: %5.2f cm2.", area);
            }
        }

        sc.close();
        sc2.close();
    }
}
