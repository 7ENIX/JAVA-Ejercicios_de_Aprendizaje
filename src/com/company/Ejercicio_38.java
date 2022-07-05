package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Programa que pide un número de 4 cifras al usuario y después muestra
solo las cifras pares de dicho número.
Ejemplo: del número 2574 mostraría los números 2 y 4.
 */
public class Ejercicio_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroString = "";
        List<Integer> listaCifrasPares = new ArrayList<Integer>();

        do {
            System.out.print("Escribe un número entero de 4 cifras: ");
            int numero = sc.nextInt();
            numeroString = String.valueOf(numero); //Transformamos el número en un String con '.ValueOf()'.

            if (numeroString.length() < 4) {
                System.out.println("El número introducido tiene menos de 4 cifras.\n");
            } else if (numeroString.length() > 4) {
                System.out.println("El número introducido tiene mas de 4 cifras.\n");
            } else {
                for (int i = 0; i < numeroString.length(); i++) {
                    char[] listaCifras = numeroString.toCharArray();
                    int cifra = Integer.parseInt(listaCifras[i] + "");
                    if (cifra % 2 == 0) {
                        listaCifrasPares.add(cifra);
                    }
                }
                System.out.println("Sus cifras pares son: " + listaCifrasPares);
            }
        } while (numeroString.length() != 4);
    }
}
