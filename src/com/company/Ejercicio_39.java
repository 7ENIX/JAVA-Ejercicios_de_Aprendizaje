package com.company;

import java.util.Scanner;

/*
Crear un programa que simula una calculadora.
El programa pedirá un número al usuario seguido de una operación, y así
hasta que la operación que se seleccione sea un "=". Cada vez que el
usuario seleccione una operación deberá mostrarse lo acumulado en pantalla
y pedir un nuevo número.

EJEMPLO:
Introduce un numero: 10
Introduce un signo: +
Valor actual: 10
Introduce un numero: 20
*/

public class Ejercicio_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroTotal = 0;
        double numero = 0;
        char signo = ' ';

        System.out.print("Introduce un número: ");
        numero = sc.nextDouble();
        numeroTotal = numero;

        while(signo != '='){

            System.out.print("Qué operación es: ");
            signo = sc.next().charAt(0);

            if(signo == '='){
                break;
            }

            System.out.print("Introduce otro número: ");
            numero = sc.nextDouble();

            switch (signo) {
                case '+':
                    numeroTotal = numeroTotal + numero;
                    break;
                case '-':
                    numeroTotal = numeroTotal - numero;
                    break;
                case '*':
                    numeroTotal = numeroTotal * numero;
                    break;
                case '/':
                    numeroTotal = numeroTotal / numero;
                    break;
            }
            System.out.println("Valor acumulado: " + numeroTotal);
        }
        System.out.println("El resultado final es: " + numeroTotal);

        sc.close();
    }
}
