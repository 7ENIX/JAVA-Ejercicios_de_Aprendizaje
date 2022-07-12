package com.company;

import java.util.Scanner;

/* Cadena espejo. Crea un programa que reciba una cadena de
caracteres y la devuelva invertida con efecto espejo, esto es, se concatena
a la palabra original su inversa, compartiendo la última letra, que hará de
espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia
atrás. Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al
introducir “goma” devolverá “gomamog”. */

public class Ejercicio_45 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);

        // CÓDIGO:
        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i));
        }

        /* Definimos el valor de 'i' como la longitud de la palabra menos 2 posiciones, para que
        así, al ir restando posiciones con 'i--' es como si empezase desde la última letra, pero
        esta no queremos imprimirla, ya que el ejercicio así lo dice.*/
        for (int i = palabra.length() - 2; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
        sc.close();
    }
}
