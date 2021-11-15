package com.company;

import java.util.Scanner;

/*
Escribe un programa que calcule "a" elevado a "b" pidiendo por teclado a y b (no puede usar la función "pow").
*/

public class Ejercicio_19 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int base, exponente, resultado = 1;

        System.out.println("Escribe el número base:");
        base = sc.nextInt();
        System.out.println("Escribe el exponente:");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        //Iniciamos "i" en "1" porque si ponemos "0" nos multiplicará el número una vez más de la que queremos.
        System.out.println("El resultado (potencia) es: " + resultado);

        sc.close();
    }
}



