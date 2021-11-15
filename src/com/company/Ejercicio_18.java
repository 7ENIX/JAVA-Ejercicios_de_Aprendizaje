package com.company;

import java.util.Scanner;

/*
Pedir números al usuario hasta que introduzca un "0". Cuando lo haga, el programa mostrará la suma y la media de todos
los números. También ha de mostrar cuál ha sido el menor y mayor número que se ha escrito.
*/

public class Ejercicio_18 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        double numero, suma, media, numMenor, numMayor;
        int contador = 0;

        // CÓDIGO:
        System.out.println("Escribe un número:");
        numero = sc.nextDouble();
        suma = numero;
        numMayor = numero;
        numMenor = numero;

        while (numero != 0) {
            if (numero >= numMayor) {
                numMayor = numero;
            }
            if (numero <= numMenor) {
                numMenor = numero;
            }
            System.out.println("Escribe otro número:");
            numero = sc.nextDouble();
            suma += numero;
            contador ++;
        }

        media = suma / contador;
        System.out.println("La suma de todos los números escritos es: " + suma + " , y la media es: " + media);
        System.out.println("El menor número escrito ha sido: " + numMenor + " y el mayor ha sido: " + numMayor);

        sc.close();
    }
}
