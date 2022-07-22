package com.company;

/* Pedir una palabra al usuario y decir si es palíndromo o no. */

import java.util.Scanner;

public class Ejercicio_47 {
    public static void main(String[] args) {

        /* Una forma fácil de realizar este ejercicio es utilizar StringBuilder, el cual
        dispone de un método ".reverse()" que, combinado con el método ".toString", nos
        da la vuelta al string que le indicamos.
        Ejemplo: Hola --> aloH.
        De esta forma nos ahorramos la creación de ArrayList para compararlos. */

        // VARIABLES:
        Scanner sc = new Scanner (System.in);

        // CÓDIGO:
        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine();
        StringBuilder palabraSB = new StringBuilder(palabra);
        String palabraInvertida = palabraSB.reverse().toString();

        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra " + palabra + " sí es un palíndromo.");
        } else {
            System.out.println("La palabra " + palabra + " no es un palíndromo.");
        }
        sc.close();
    }
}
