package com.company;

import java.util.Scanner;

/*
Pedir una cadena de caracteres al usuario.
Se dirá:
1- Cuántos espacios tiene
2- Cuántas mayúsculas tiene
3- Cuántas minúsculas tiene
 */
public class Ejercicio_41 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int contadorEspacio = 0, contadorMayuscula = 0, contadorMinuscula = 0;

        // CÓDIGO:
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacio++;
            } else if (Character.isUpperCase(frase.charAt(i))) {
                contadorMayuscula++;
            } else if (Character.isLowerCase(frase.charAt(i))) {
                contadorMinuscula++;
            }
        }
        System.out.println("El número de espacios en la frase es de: " + contadorEspacio);
        System.out.println("El número de mayúsculas en la frase es de: " + contadorMayuscula);
        System.out.println("El número de minúsculas en la frase es de: " + contadorMinuscula);
        sc.close();
    }
}
