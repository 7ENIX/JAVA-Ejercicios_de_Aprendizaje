package com.company;

import java.util.Scanner;

/*
Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
Ejemplo: 0-5: insuficiente, 5:suficiente, 6:bien, 7-8:notable, 9-10:sobresaliente, mayor que 10: nota no válida.
*/

public class Ejercicio_13 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        double nota;

        // CÓDIGO:
        do {
            System.out.println();
            System.out.println("Introduce la nota de tu examen:");
            nota = sc.nextDouble();
            if (nota > 10) {
                System.out.println("La nota no es válida, por favor escribe una nota correcta.");
            }
        } while (nota > 10);

        if (nota >= 0 && nota <= 4.99) { //Definimos el rango de número en los que se calificará la nota del examen.
            System.out.println("Tu nota es: 'Insuficiente'.");
        }
        if (nota >= 5 && nota <= 5.99) {
            System.out.println("Tu nota es: 'Suficiente'.");
        }
        if (nota >= 6 && nota <= 6.99) {
            System.out.println("Tu nota es: 'Bien'.");
        }
        if (nota >= 7 && nota <= 8.99) {
            System.out.println("Tu nota es: 'Notable'.");
        }
        if (nota >= 9) {
            System.out.println("Tu nota es: 'Sobresaliente'.");
        }

        sc.close();
    }
}
