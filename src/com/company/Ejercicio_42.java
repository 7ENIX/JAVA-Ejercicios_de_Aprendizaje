package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Pedir una frase al usuario y mostrar cada palabra en una línea
distinta y numerada.
 */
public class Ejercicio_42 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numeracion = 0; //Definimos la numeración de cada palabra en 0, irá aumentando en el FOR.

        // CÓDIGO:
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        /*Creamos un Array que tendrá en cada posición una palabra de la frase que hemos introducido. Esto lo hacemos
        con el método .split, en el cual usaremos el delimitador del "espacio" (" ") para separar cada palabra.*/
        String [] palabra = frase.split(" ");

        /*Recorremos el Array, aumentamos la enumeración de cada palabra para que nos diga qué número de palabra es e
        imprimimos la numeración y la posición de cada palabra del array.*/
        for (int i = 0; i < palabra.length; i++) {
            numeracion++;
            System.out.println(numeracion + ". " + palabra[i] + ".");
        }
        sc.close();
    }
}
