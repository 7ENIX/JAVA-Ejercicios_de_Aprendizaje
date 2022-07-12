package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Pedir 2 números al usuario. Imprimir la lista de números desde el número más
alto hasta el número más bajo, de 1 en 1 en caso de haber una diferencia
impar entre ellos y de 2 en 2 en caso de haber una diferencia par.
 */
public class Ejercicio_33 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int num1, num2, numeroEntreMenorYMayor, numAux = 0, diferencia = 0;
        Boolean tipoDiferencia = true;
        List<Integer> listaNumeros = new ArrayList<Integer>();
        List<Integer> listaNumerosCada2 = new ArrayList<Integer>();

        // Preguntamos y leemos los números.
        System.out.print("Dime el 1º número desde el 1 hasta el 30: ");
        num1 = sc.nextInt();
        System.out.print("Dime el 2º número desde el 1 hasta el 30: ");
        num2 = sc.nextInt();

        // Ordenamos los números (num1 siempre será el pequeño).
        if (num1 > num2) {
            numAux = num2;
            num2 = num1;
            num1 = numAux;
        }

        // Definimos la diferencia.
        diferencia = num2 - num1;

        // Definimos el tipo de diferencia: si es par sera 'True', sino 'False'.
        if (diferencia % 2 == 0) {
            tipoDiferencia = true; /* par */
        } else {
            tipoDiferencia = false; /* impar */
        }
        // Definimos la variable que ejecutará los números que hay entre el 1º número(num1) y el 2º número(num2).
        numeroEntreMenorYMayor = num1 + 1;

        // Empezamos a introducir los números en el array.
        listaNumeros.add(num1);
        while(numeroEntreMenorYMayor < num2) {
            listaNumeros.add(numeroEntreMenorYMayor);
            numeroEntreMenorYMayor++;
        }
        listaNumeros.add(num2);

        if(tipoDiferencia) {
            for (int i = 0; i < listaNumeros.size(); i = i+2) {
                listaNumerosCada2.add(listaNumeros.get(i));
            }
            System.out.println(listaNumerosCada2);
        } else {
            System.out.println(listaNumeros);
        }

        sc.close();
    }
}
