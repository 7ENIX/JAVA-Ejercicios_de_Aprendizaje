package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
Programa que pide un número al usuario y suma todos sus componentes.
En caso de que la suma de más de 1 cifra vuelve a sumarlas hasta que quede
un solo número.
EJEMPLO: 7778
7+7+7+8 = 29
2+9 = 11
1+1 = 2 (1 cifra, termina el programa).
 */
public class Ejercicio_36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numeroString = ""; //Transformamos el número en un String con '.ValueOf()'.
        int sumaCifras = 0;

        System.out.print("Escribe un número entero: ");
        int numero = sc.nextInt();
        numeroString = String.valueOf(numero);

        do {
            sumaCifras=0;
            char[] listaCifras = numeroString.toCharArray();
            for (int i = 0; i < listaCifras.length; i++) {
                int cifra = Integer.parseInt(listaCifras[i] + "");
                sumaCifras = sumaCifras + cifra;

                if (i+1 != listaCifras.length) {
                    System.out.print(cifra + " + ");
                } else {
                    System.out.println(cifra + " = " + sumaCifras);
                }
            }
            numeroString = String.valueOf(sumaCifras);
        } while (numeroString.length() > 1);
        System.out.println("El número lo hemos reducido a 1 cifra. ¡Se terminó!");

        sc.close();
    }
}
