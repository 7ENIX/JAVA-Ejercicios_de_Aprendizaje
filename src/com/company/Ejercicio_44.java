package com.company;

import java.util.Scanner;

/*
Pedir una frase y una letra al usuario. Contar el número de
repeticiones de esa letra en la frase (solo caractéres normales).
 */
public class Ejercicio_44 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        //CÓDIGO:
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine().toLowerCase();
        System.out.print("Escribe una letra: ");
        char caracter = sc.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("Tu frase tiene la letra" + " '" +  caracter + "' " + contador + " veces.");
        sc.close();
    }
}
