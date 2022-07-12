package com.company;

import java.util.Scanner;
/*
Pedir un carácter al usuario hasta que coincida con una letra (a-z - A-Z).
Una vez introduzca un carácter correcto se le dirá si es mayúscula o minúscula
y se mostrará la opuesta.
*/
public class Ejercicio_40 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        boolean caracterCorrecto = true;

        // CÓDIGO:
        System.out.print("Escribe un carácter de tipo 'letra': ");
        while (caracterCorrecto) {
            int caracter = sc.next().charAt(0); //Leémos el carácter dentro del while.

            if (caracter > 64 && caracter < 91) {
                String AsciiToString = Character.toString((char)caracter);
                System.out.println("Tu letra mayúscula es: " + AsciiToString);
                System.out.println("Su letra en minúscula es: " + AsciiToString.toLowerCase());
                caracterCorrecto = false;
            } else if (caracter > 96 && caracter < 123) {
                String AsciiToString = Character.toString((char)caracter);
                System.out.println("Tu letra minúscula es: " + AsciiToString);
                System.out.println("Su letra en mayúscula es: " + AsciiToString.toUpperCase());
                caracterCorrecto = false;
            }
            if (caracterCorrecto) {
                System.out.print("Carácter no válido. Escribe un carácter de tipo 'letra': ");
            }
        }
        sc.close();
    }
}
