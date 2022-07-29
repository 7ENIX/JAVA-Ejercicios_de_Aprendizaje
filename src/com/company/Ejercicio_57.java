package com.company;

import java.util.Scanner;
/*
Pedir una frase al usuario y mostras las repeticiones de cada una de las vocales con un pictrograma.
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
        int contador = 0;

        System.out.print("Escribe una frase pequeña (de no más de 8 palabras): ");
        frase = sc.nextLine();

        System.out.println(frase);
    }
}
