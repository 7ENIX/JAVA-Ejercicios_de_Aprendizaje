package com.company;

import java.util.Scanner;

/*
Programa que pide un numero de x cifras al usuario y le dice cuántas tiene.
 */
public class Ejercicio_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número entero de entre 1 y 9 cifras: ");
        int numero = sc.nextInt();
        String numeroString = String.valueOf(numero);  //Transformamos el número en un String con '.ValueOf()'.
        int contador = 0;

        for (int i = 0; i < numeroString.length(); i++) { //Recorremos la longitud del número hecho String.
            contador++;
        }
        System.out.println("El número " + numero + " contiene " + contador + " cifras.");
    }
}
