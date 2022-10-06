package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Rellenar un array unidimensional de 10 posiciones con números introducidos por el usuario, con la condición
de que no pueden repetirse. En caso de que el número se repita, éste quedará descartado y se le pedirá al
usuario un nuevo número. Finalmente se mostrará el array con todos los números.
*/
public class Ejercicio_58 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int numero = 0;
        boolean repetido;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            repetido = false;
            for (int j = 0; j < array.length && j < i; j++) {
                if (numero == array[j]) {
                    repetido = true;
                    System.out.print("El número introducido ya está en la lista. ");
                }
            }
            if (!repetido) {
                array[i] = numero;
            } else {
                i--;
            }
        }
        System.out.println("\nLa lista de números es: " + Arrays.toString(array));
        sc.close();
    }
}