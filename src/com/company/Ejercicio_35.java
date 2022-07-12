package com.company;

import java.util.Scanner;

/*
Programa que pide números al usuario hasta que el número introducido sea de 4 cifras.
 */
public class Ejercicio_35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numeroString = ""; //Transformamos el número en un String con '.ValueOf()'.

        do {
            System.out.print("Escribe un número entero de 4 cifras: ");
            int numero = sc.nextInt();
            numeroString = String.valueOf(numero);

            if (numeroString.length() < 4) {
                System.out.println("El número introducido tiene menos de 4 cifras.\n");
            } else if (numeroString.length() > 4) {
                System.out.println("El número introducido tiene mas de 4 cifras.\n");
            } else {
                System.out.println("El número introducido es: " + numeroString);
            }

        } while (numeroString.length() != 4); //Repetiremos el bucle si el número no tiene 4 cifras.

        sc.close();
    }
}
