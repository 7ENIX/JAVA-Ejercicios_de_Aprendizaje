package com.company;

import java.util.Scanner;

/* Pedir una frase al usuario y contar el número de vocales que tiene (no hace falta contar los acentos). */

public class Ejercicio_43 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        // CÓDIGO:
        System.out.print("Escribe una frase: ");
        /* En el siguiente paso pasamos todas las letras de la frase a minúsculas para
        que sea más sencillo hacer la comparación */
        String frase = sc.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Tu frase tiene " + contador + " vocales.");
        sc.close();
    }
}
