package com.company;

import java.util.Scanner;

/*
Pedir una frase al usuario y mostrar las repeticiones de cada una de las vocales con un pictrograma.
Ejemplo: El caballo blanco de Santiago.
A : *****
E : **
I : *
O : ***
U :
*/
public class Ejercicio_57 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        String frase = "";
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        System.out.print("Escribe una frase corta (de no más de 15 palabras): ");
        // Guardamos la frase en minúsuclas para encontrar luego las vocales de manera más sencilla.
        frase = sc.nextLine().toLowerCase();

        // Recorremos la frase letra por letra y contamos las vocales.
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contadorA++;
            }
            if (frase.charAt(i) == 'e') {
                contadorE++;
            }
            if (frase.charAt(i) == 'i') {
                contadorI++;
            }
            if (frase.charAt(i) == 'o') {
                contadorO++;
            }
            if (frase.charAt(i) == 'u') {
                contadorU++;
            }
        }
        System.out.println(); // Línea en blanco.

        // Vocal A:
        System.out.print("ContadorA: ");
        for (int j = 0; j < contadorA; j++) {
            System.out.print("* "); // Imprimimos en asteriscos el número de veces que se repite la vocal.
        }
        System.out.println("(" + contadorA + ")."); // Finalmente imprimimos el número en dígito.

        // Vocal E:
        System.out.print("ContadorE: ");
        for (int j = 0; j < contadorE; j++) {
            System.out.print("* ");
        }
        System.out.println("(" + contadorE + ").");

        // Vocal I:
        System.out.print("ContadorI: ");
        for (int j = 0; j < contadorI; j++) {
            System.out.print("* ");
        }
        System.out.println("(" + contadorI + ").");

        // Vocal O:
        System.out.print("ContadorO: ");
        for (int j = 0; j < contadorO; j++) {
            System.out.print("* ");
        }
        System.out.println("(" + contadorO + ").");

        // Vocal U:
        System.out.print("ContadorU: ");
        for (int j = 0; j < contadorU; j++) {
            System.out.print("* ");
        }
        System.out.println("(" + contadorU + ").");

        sc.close();
    }
}
