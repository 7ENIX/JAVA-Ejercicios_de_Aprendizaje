package com.company;

import java.util.Scanner;

/*
Pedir al usuario un numero y mostrar por pantalla un triángulo rectángulo
de asteriscos hasta llegar a la altura que ha dicho el usuario:
 */
public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Dime un número del 3 al 9?");
        int numero = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println();
            contador++;
            for (int j = 0; j < contador; j++) {
                System.out.print("* " + " ");
            }
        }
    }
}
