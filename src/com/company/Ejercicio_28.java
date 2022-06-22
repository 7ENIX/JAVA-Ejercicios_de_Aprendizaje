package com.company;

import java.util.Scanner;

/*
Pedir al usuario un numero y mostrar por pantalla un triángulo equilátero
de asteriscos hasta llegar a la altura que ha dicho el usuario:
 */
public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Dime un número del 3 al 9?");
        int numero = sc.nextInt();
        int contador = 0;
        int contador2 = numero;

        for (int i = 0; i < numero; i++) {
            System.out.println();
            contador++;
            for (int j = 0; j < contador2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < contador; k++) {
                System.out.print("* ");
                contador2--;
            }
        }
    }
}
