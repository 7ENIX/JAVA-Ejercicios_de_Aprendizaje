package com.company;

import java.util.Scanner;

/*
Escribe un programa que pida un número y nos diga si es o no un número primo. Además, que muestre en pantalla todos
los números primos que hay entre 0 y el número escrito.
*/

public class Ejercicio_22 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int numero, contadoratras,contador;
        String repetir;

        // CÓDIGO:
        do {
            System.out.println("Escribe un número y te diré si es un número primo.");
            numero = Integer.parseInt(sc.nextLine());
            contadoratras = numero;
            contador = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("El número " + numero + " sí es un número primo.");
                System.out.println();
                contador = 0;

                System.out.println("Los números primos entre el número 0 y el " + numero + " son:");
                for (int i = 1; i < numero; i++) {
                    for (int j = 1; j <= contadoratras ; j++) {
                        if (contadoratras % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        if (contadoratras == 2) {
                            System.out.print(contadoratras + ".\n");
                        } else {
                            System.out.print(contadoratras + ", ");
                        }
                    }
                    contador = 0;
                    contadoratras--;
                }
            } else {
                System.out.println("El numero " + numero + " no es un número primo.\n");
            }
            System.out.println("¿Quieres comprobar otro número?");
            repetir = sc.nextLine();
        } while (repetir.toLowerCase().equals("s"));

        sc.close();
    }
}
