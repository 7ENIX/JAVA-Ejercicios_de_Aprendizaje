package com.company;

import java.util.Scanner;

/*
Calcular la nota media de un alumno pidiendo por pantalla sus 4 últimas calificaciones. Tendremos que dar el resultado
solo con 1 decimal.
*/

public class Ejercicio_4 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero_notas = 4;
        float nota1, nota2, nota3, nota4;
        float resultado;

        // CÓDIGO:
        System.out.println("Introduce la 1ª nota del alumno:");
        nota1 = sc.nextFloat();
        System.out.println("Introduce la 2ª nota del alumno:");
        nota2 = sc.nextFloat();
        System.out.println("Introduce la 3ª nota del alumno:");
        nota3 = sc.nextFloat();
        System.out.println("Introduce la 4ª nota del alumno:");
        nota4 = sc.nextFloat();

        resultado = (nota1 + nota2 + nota3 + nota4) / numero_notas; // Fórmula.
        System.out.printf("La nota media del alumno es: %5.1f", resultado); // Usando "printf" y "%5.2f" para solo 2 decimales.

        sc.close();
    }
}
